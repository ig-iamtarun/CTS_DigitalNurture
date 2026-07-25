# ---------- Stage 1: Build ----------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
COPY product-service/pom.xml product-service/pom.xml
RUN mvn -B -pl product-service -am dependency:go-offline

COPY product-service/src product-service/src
RUN mvn -B -pl product-service -am clean package -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring
COPY --from=build /app/product-service/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
