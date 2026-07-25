# GenAI Chatbot — Docker + AWS + Claude API fundamentals project

A minimal Spring Boot service that wraps the Anthropic Claude API behind a single `/api/chat` REST endpoint, containerized with Docker, and ready to deploy to AWS. Good as a "fundamentals" project touching four pieces at once: a Java backend, calling a GenAI API, containerization, and cloud deployment.

## Architecture
```
Your client (curl/Postman/frontend)
        |
        v
  Spring Boot app (this project, port 8080)
   /api/chat  --->  Anthropic API (api.anthropic.com/v1/messages)
        |
        v
  Docker container  --->  AWS (ECR + ECS Fargate, or App Runner)
```

## Project layout
```
src/main/java/com/example/genaichatbot/
├── GenaiChatbotApplication.java
├── config/AnthropicConfig.java     # WebClient bean pointed at api.anthropic.com
├── controller/ChatController.java  # POST /api/chat
├── service/ChatService.java        # builds request, calls Anthropic, parses reply
├── dto/                            # request/response shapes (ours + Anthropic's)
└── exception/                      # global error handling
Dockerfile             # multi-stage build -> small runtime image
docker-compose.yml      # local convenience runner
```

## 1. Get an API key
Create a key at https://console.anthropic.com (Anthropic Console → API Keys). Keep it secret — never commit it or hardcode it in `application.properties`.

## 2. Run locally (no Docker)
```bash
export ANTHROPIC_API_KEY=sk-ant-your-key-here
mvn spring-boot:run
```

## 3. Run with Docker
```bash
docker build -t genai-chatbot .
docker run -e ANTHROPIC_API_KEY=sk-ant-your-key-here -p 8080:8080 genai-chatbot
```
Or with Compose (reads `ANTHROPIC_API_KEY` from your shell env or a `.env` file):
```bash
export ANTHROPIC_API_KEY=sk-ant-your-key-here
docker compose up --build
```

## 4. Try it
```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "Explain Docker in one sentence."}'
```
Response:
```json
{ "reply": "...", "model": "claude-sonnet-5" }
```

With conversation history:
```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{
    "message": "What did I just ask you?",
    "history": [
      {"role": "user", "content": "My favorite color is blue."},
      {"role": "assistant", "content": "Got it, blue it is!"}
    ]
  }'
```

Health check (useful for AWS load balancers): `GET http://localhost:8080/actuator/health`

## 5. Deploy to AWS

Two common paths — pick based on how much you want to manage:

### Option A: AWS App Runner (simplest — good for a fundamentals project)
1. Push your image to Amazon ECR:
   ```bash
   aws ecr create-repository --repository-name genai-chatbot
   aws ecr get-login-password --region <your-region> | docker login --username AWS --password-stdin <account-id>.dkr.ecr.<your-region>.amazonaws.com
   docker tag genai-chatbot:latest <account-id>.dkr.ecr.<your-region>.amazonaws.com/genai-chatbot:latest
   docker push <account-id>.dkr.ecr.<your-region>.amazonaws.com/genai-chatbot:latest
   ```
2. In the AWS Console, go to **App Runner → Create service**, source = the ECR image you just pushed.
3. Under **Configuration**, set the environment variable `ANTHROPIC_API_KEY` (mark it as a secret — ideally pull it from **AWS Secrets Manager** instead of pasting it plainly).
4. Set the port to `8080` and the health check path to `/actuator/health`.
5. Deploy. App Runner gives you a public HTTPS URL automatically.

### Option B: ECS Fargate (more control, more moving pieces)
1. Push the image to ECR (same steps as above).
2. Create an ECS cluster (Fargate launch type).
3. Create a Task Definition referencing your ECR image, port `8080`, and an environment variable/secret for `ANTHROPIC_API_KEY` (use **Secrets Manager** + reference it in the task definition rather than plaintext).
4. Create a Service behind an Application Load Balancer, health check path `/actuator/health`.
5. Open the ALB's DNS name to hit your API.

**Either way — do not put your real API key in the Dockerfile, in source control, or in plaintext task definitions.** Use AWS Secrets Manager or SSM Parameter Store and inject it at runtime.

## 6. Running tests
```bash
mvn test
```
The test suite doesn't call the real Anthropic API — it just verifies the Spring context boots correctly.

## Next steps you might want
- Swap the blocking `.block()` call in `ChatService` for a reactive/streaming response (Server-Sent Events) so replies stream token-by-token
- Add rate limiting / retry-with-backoff around the Anthropic call
- Add a simple frontend (or just use Postman/curl) to interact with it
- Add CloudWatch logging and an IAM role scoped narrowly to Secrets Manager access
- Wire up a CI/CD pipeline (GitHub Actions) to build, push to ECR, and redeploy on every merge
