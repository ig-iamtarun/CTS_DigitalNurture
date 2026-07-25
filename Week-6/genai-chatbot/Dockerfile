# ---------- Stage 1: Build ----------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom first so dependency layer is cached separately from source changes
COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY src ./src
RUN mvn -B clean package -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Run as a non-root user
RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# ANTHROPIC_API_KEY must be supplied at runtime, e.g.:
#   docker run -e ANTHROPIC_API_KEY=sk-ant-... -p 8080:8080 genai-chatbot
ENTRYPOINT ["java", "-jar", "app.jar"]
