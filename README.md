# To-Do List Backend (Spring Boot)

A RESTful To-Do application backend built using Spring Boot, JPA, and PostgreSQL.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Postman (for API testing)

## Features

- Create a new task
- Get all tasks
- Get task by ID
- Update a task
- Delete a task

## API Endpoints

-------------------------------------------------
| Method | Endpoint      | Description          |
|--------|---------------|----------------------|
| GET    | /todos        | Get all tasks        |
| GET    | /todos/{id}   | Get task by ID       |
| POST   | /todos        | Create new task      |
| PUT    | /todos/{id}   | Update task          |
| DELETE | /todos/{id}   | Delete task          |
-------------------------------------------------
## How to Run Locally

1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Run:


mvn spring-boot:run


4. Test APIs using Postman at:

http://localhost:8080/todos


## Learning Outcome

This project demonstrates:
- REST API development
- CRUD operations
- Database integration using JPA
- Git and GitHub version control workflow