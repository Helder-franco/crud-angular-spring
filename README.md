
# REST API with Spring Boot and Angular
[![MIT License](https://github.com/loiane/crud-angular-spring/actions/workflows/maven.yml/badge.svg?branch=main)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://github.com/loiane/crud-angular-spring/actions/workflows/angular.yml/badge.svg?branch=main)](https://opensource.org/licenses/)

CRUD Angular + Spring demonstrating Has-Many relationship, with tests.

This API is to showcase, what a basic CRUD API that's close to being Production-ready looks like.

# 💻 Tecnologies
- Java 17
- Spring Boot 3 (Spring 6)
- Maven
- JPA + Hibernate
- MySQL
- JUnit 5 + Mockito (back-end tests)
- Angular v16
- Angular Material
- Karma + Jasmine (front-end tests)

# ⌨️ Editor / IDE
- Visual Studio Code
- Intellij IDEA

# Some functionalities available in the API
- ✅ Java model class with validation
- ✅ JPA repository
- ✅ JPA Pagination
- ✅ MySQL database (can you any database of your preference)
- ✅ Controller, Service, and Repository layers
- ✅ Has-Many relationships (Course-Lessons)
- ✅ Java 17 Records as DTO (Data Transfer Object)
- ✅ Hibernate / Jakarta Validation
- ✅ Unit tests for all layers (repository, service, controller)
- ✅ Test coverage for tests
- ✅ Spring Docs - Swagger (https://springdoc.org/v2/)

# Some functionalities available in the Front-end
- ✅ Angular Standalone components (Angular v16+)
- ✅ Angular Material components
- ✅ List of all courses with pagination
- ✅ Form to update/create courses with lessons (has-many - FormArray)
- ✅ View only screen
- ✅ TypedForms (Angular v14+)
- ✅ Presentational x Smart Components
- 🚧 Unit and Integration tests for components, services, pipes, guards

# ❗️Executing the code locally
## Executing the back-end
You need to have Java and Maven installed and configured locally.

Open the crud-spring project in your favorite IDE as a Maven project and execute it as Spring Boot application.

## Executing the front-end
You need to have Node.js / NPM installed locally.

 1. Install all the required dependencies:

        npm install

2. Execute the project:

        npm run start
        
This command will run the Angular project with a proxy to the Java server, without requiring CORS.

Open your browser and access http://localhost:4200 (Angular default port).
