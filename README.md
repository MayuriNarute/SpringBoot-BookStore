# Spring Boot CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. It manages student records with the ability to add, update,
and delete student information. The frontend is built using Thymeleaf and Bootstrap, while the backend uses Spring Boot with a database for data persistence.

## Features

- **Create**: Add new student records.
- **Read**: View all student records.
- **Update**: Modify existing student details.
- **Delete**: Remove student records.
- **Frontend**: Built using Thymeleaf and styled with Bootstrap.
- **Backend**: Built with Spring Boot, and Spring Data JPA for database operations.

## Technologies Used

- **Spring Boot**: For creating REST APIs and handling backend logic.
- **Spring Data JPA**: For database interactions.
- **Thymeleaf**: For rendering dynamic HTML views.
- **Bootstrap**: For responsive and modern UI design.
- **H2 Database (or MySQL)**: For persisting data.
- **Maven**: For project build and dependency management.

## Prerequisites

Before you begin, ensure you have the following tools installed:

- [JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or later
- [Maven](https://maven.apache.org/install.html)
- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/)

## Installation & Setup

1. **Clone the repository**:

  ``` 
  git clone https://github.com/your-username/spring-boot-crud-app.git
  ```
  ``` 
  cd spring-boot-crud-app
  ```
   
## Database Configuration:

By default, this project uses the in-memory H2 database. To switch to MySQL or another database, update the application.properties file with your database configurations:

spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

## Run the Application:
```
mvn spring-boot:run
```

## Access the Application:
```
http://localhost:8080
```

## CRUD Endpoints
		
| HTTP Method | URL  | Description |
| ------- | --- | --- |
| GET | / | List all students |
| GET | /saveStudentPage | Show form to add a new student |
| POST | /saveStudent | Create a new student |
| GET | /updateStudent/{id} | Show form to update a student |
|	GET	| /deleteStudent/{id}	| Delete a student |
