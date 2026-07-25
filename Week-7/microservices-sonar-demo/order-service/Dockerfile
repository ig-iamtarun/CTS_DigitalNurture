# ---------- Stage 1: Build ----------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
COPY order-service/pom.xml order-service/pom.xml
RUN mvn -B -pl order-service -am dependency:go-offline

COPY order-service/src order-service/src
RUN mvn -B -pl order-service -am clean package -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring
COPY --from=build /app/order-service/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
