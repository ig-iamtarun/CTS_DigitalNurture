# Microservices + SonarQube Fundamentals Project

A small, two-service microservices setup, with SonarQube wired in to analyze code quality and test coverage for each service independently.

## Architecture
```
                 HTTP                          HTTP
 client  ------------------->  order-service  ------------------->  product-service
                (place order)     :8082         (check availability)      :8081
                                     |
                                     v
                                orderdb (H2, in-memory)

 product-service uses its own in-memory DB (productdb) too - each
 microservice owns its own data, which is the whole point of the pattern.
```

**Why two services instead of one app?** This demonstrates the core microservices idea: `order-service` doesn't know or care how `product-service` stores its data — it only knows product-service's HTTP contract (`GET /api/products/{id}/availability`). Each service can be built, tested, deployed, and scaled independently.

## Project layout
```
microservices-sonar-demo/
├── pom.xml                    # parent POM - aggregates both modules, defines JaCoCo + Sonar plugin versions
├── docker-compose.yml         # brings up both services + a full SonarQube server
├── product-service/           # owns Product data, exposes availability check
│   ├── pom.xml
│   ├── Dockerfile
│   └── src/main/java/.../{model,repository,service,controller,exception}
└── order-service/             # places orders, calls product-service before confirming
    ├── pom.xml
    ├── Dockerfile
    └── src/main/java/.../{model,repository,client,service,controller,dto,exception}
```

## 1. Run the services locally (no Docker)
In two separate terminals:
```bash
cd product-service && mvn spring-boot:run   # starts on :8081
cd order-service && mvn spring-boot:run     # starts on :8082
```

Try it:
```bash
# Create a product
curl -X POST http://localhost:8081/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Mechanical Keyboard","price":89.99,"stock":10}'

# Place an order for it (order-service will call product-service internally)
curl -X POST http://localhost:8082/api/orders \
  -H "Content-Type: application/json" \
  -d '{"productId":1,"quantity":2}'
```
If `product-service` is down or out of stock, the order still gets created but with `"status":"REJECTED"` — order-service degrades gracefully instead of crashing.

## 2. Run everything with Docker Compose
From the `microservices-sonar-demo/` root:
```bash
docker compose up --build
```
This starts:
- `product-service` on `localhost:8081`
- `order-service` on `localhost:8082` (configured to call `product-service` by its Docker Compose service name)
- `sonarqube` on `localhost:9000` (with its own Postgres DB, `sonarqube-db`)

## 3. Analyze code quality with SonarQube

**Start SonarQube** (if not already up via Compose):
```bash
docker compose up -d sonarqube-db sonarqube
```
Give it a minute to boot, then open http://localhost:9000 (default login: `admin` / `admin`, it'll ask you to change the password).

**Generate a token:** My Account → Security → Generate Token. Copy it.

**Run the analysis** for each service (from the project root, since they share the parent POM):
```bash
export SONAR_TOKEN=squ_your_token_here

mvn clean verify -pl product-service -am \
  sonar:sonar -Dsonar.token=$SONAR_TOKEN

mvn clean verify -pl order-service -am \
  sonar:sonar -Dsonar.token=$SONAR_TOKEN
```
`clean verify` runs the tests and generates the JaCoCo coverage report; `sonar:sonar` uploads results to your SonarQube server. Each service reports as its own project (`product-service` / `order-service` — see the `sonar.projectKey` in each module's `pom.xml`), so you get separate quality gates per microservice, matching how they'd be built/deployed independently in CI.

Once it finishes, refresh the SonarQube dashboard — you'll see bugs, code smells, security hotspots, and test coverage % for each service.

## 4. Running tests only (no SonarQube)
```bash
mvn test
```
Both services have real unit tests (`ProductServiceTest`, `OrderServiceTest`) using Mockito, so there's actual coverage for SonarQube to report on rather than an empty dashboard.

## Next steps you might want
- Add a CI pipeline (GitHub Actions) that runs `mvn verify sonar:sonar` on every push, so quality gates block bad merges automatically
- Add a Sonar quality gate check that fails the build if coverage drops below a threshold
- Add resilience (retry/circuit breaker via Resilience4j) around the `order-service → product-service` call instead of the simple try/catch
- Add a service registry (Eureka) or API gateway if you want to grow this into a "real" microservices topology
- Replace H2 with Postgres per service for something closer to production
