# Demo — Spring Boot CRUD REST API

A ready-to-run Spring Boot REST API for managing `Product` records, backed by MySQL (PostgreSQL is also wired up — just switch a few lines of config).

## Stack
- Java 17
- Spring Boot 3.3.4
- Spring Web, Spring Data JPA, Bean Validation
- MySQL (default) / PostgreSQL (alternative)
- Lombok
- Maven

## Project layout
```
src/main/java/com/example/demo/
├── DemoApplication.java        # entry point
├── model/Product.java          # JPA entity
├── repository/ProductRepository.java
├── service/ProductService.java # business logic
├── controller/ProductController.java  # REST endpoints
└── exception/                  # custom exception + global handler
src/main/resources/application.properties  # DB config
```

## 1. Prerequisites
- JDK 17+
- Maven 3.8+ (or use the included `mvnw` wrapper if you add one)
- A running MySQL or PostgreSQL server

## 2. Configure the database
Open `src/main/resources/application.properties`.

**MySQL (default, already active):**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demo_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_mysql_password
```
Just update the username/password to match your local MySQL install. The database `demo_db` will be created automatically.

**PostgreSQL (alternative):**
1. Comment out the MySQL block.
2. Uncomment the PostgreSQL block (url/username/password + `hibernate.dialect.PostgreSQLDialect`).
3. Create the database manually first: `createdb demo_db` (Postgres doesn't auto-create like MySQL does here).

## 3. Run it
```bash
mvn spring-boot:run
```
The API starts on **http://localhost:8080**.

On first run, Hibernate (`spring.jpa.hibernate.ddl-auto=update`) will create the `products` table for you automatically.

## 4. Endpoints

| Method | URL                     | Description          |
|--------|-------------------------|-----------------------|
| GET    | `/api/products`         | List all products     |
| GET    | `/api/products/{id}`    | Get one product        |
| POST   | `/api/products`         | Create a product       |
| PUT    | `/api/products/{id}`    | Update a product        |
| DELETE | `/api/products/{id}`    | Delete a product        |

### Example: create a product
```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Wireless Mouse","description":"Ergonomic 2.4GHz mouse","price":19.99,"quantity":150}'
```

### Example: get all products
```bash
curl http://localhost:8080/api/products
```

Validation errors (e.g. blank name, negative price) return a `400` with a JSON body listing which fields failed. Requests for a non-existent id return a `404`.

## 5. Running tests
Tests use an in-memory H2 database (see `src/test/resources/application-test.properties`), so no real DB is needed to run:
```bash
mvn test
```

## Next steps you might want
- Add pagination/sorting to `GET /api/products` (`Pageable` in the repository/controller)
- Swap `ddl-auto=update` for a migration tool like Flyway once this goes to production
- Add DTOs instead of exposing the entity directly
- Add Springdoc/OpenAPI for interactive API docs
- Wrap credentials in environment variables instead of hardcoding them in `application.properties`
