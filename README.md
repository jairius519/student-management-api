# Student Management API

A RESTful backend API for managing student records, built with Java and Spring Boot.

## Features

- Create new student records
- Retrieve all students
- Retrieve a student by ID
- Update existing student information
- Delete students
- Handle missing resources with custom exceptions
- Return structured error responses through global exception handling
- Persist student data using MySQL

## Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Project Structure

src/main/java/com/burks/students/
├── controller/
├── service/
├── repository/
├── entity/
└── exception/

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| POST | `/students` | Create a new student |
| PUT | `/students/{id}` | Update an existing student |
| DELETE | `/students/{id}` | Delete a student |

## Error Handling

The API uses global exception handling to provide consistent error
responses when a requested resource cannot be found.

Example:

{
  "timestamp": "2026-08-22T15:30:00",
  "status": 404,
  "error": "Not Found",
  "message": "Student not found with id: 10"
}

