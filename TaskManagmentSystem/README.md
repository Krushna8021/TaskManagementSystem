Instructions to Run the Application Locally

Prerequisites:

Java JDK 11 or later
Maven
Docker (if using Docker)

1) Setup:
## Setup Instructions

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/yourrepository.git
   cd yourrepository

2) Build the Application:

mvn clean install
3) Run the Application:
mvn spring-boot:run

4) Access the Application:
•	The application will run on http://localhost:8089.
5) Using Docker (if applicable):
•	Build the Docker image:
•	docker build -t your-app-name .
6} Run the Docker container:
docker run -p 8080:8080 your-app-name


API Endpoints
•	POST /api/register: Register a new user
•	POST /api/login: Login and receive JWT token
•	POST /api/tasks: Create a new task
•	GET /api/tasks: Get all tasks
•	PUT /api/tasks/{taskId}: Update a task
•	DELETE /api/tasks/{taskId}: Delete a task
3. API Documentation
You can use tools like Swagger or Postman to document your API.
Swagger:
•	Add Swagger Dependencies:
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>2.0.2</version> <!-- or latest version -->
</dependency>

Add Swagger Configuration (if needed):
@Configuration
@OpenAPIDefinition(info = @Info(title = "Task Management API", version = "v1"))
public class SwaggerConfig {
}

•	Access Swagger UI: After running your application, visit http://localhost:8080/swagger-ui.html to view the API documentation.
Postman Collection:
•	Create a Collection:
o	Use Postman to create a new collection of your API endpoints.
o	Save requests for each endpoint with sample payloads.
•	Export Collection:
o	Go to the collection settings in Postman and export it as a JSON file.
o	Add the file to your repository.

