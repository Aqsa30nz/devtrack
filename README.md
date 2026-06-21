# 🚀 DevTrack — Activity Tracking Backend System

A scalable backend application built using **Spring Boot, PostgreSQL, and Java** for tracking coding and learning activities.

Designed using clean layered architecture and production-oriented backend development practices.

---

# 🧠 Project Overview

DevTrack enables users to:

* Create activities
* Track learning sessions
* Update progress
* Maintain structured activity history

The project focuses on backend engineering concepts including:

* RESTful API design
* Layered architecture
* DTO-based API design
* Request validation
* Exception handling
* Database persistence using PostgreSQL

---

# 🏗️ Architecture

```text
Controller
    ↓
Validation
    ↓
DTO
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL

+ Global Exception Handling
+ Standardized API Responses
```

---

# 📁 Project Structure

```text
src/main/java/com/aqsa/devtrack

│   DevtrackApplication.java
│
├── controller
│   └── ActivityController.java
│
├── dto
│   ├── ActivityRequestDTO.java
│   ├── ActivityResponseDTO.java
│   └── ApiResponse.java
│
├── entity
│   └── Activity.java
│
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
│
├── repository
│   └── ActivityRepository.java
│
└── service
    └── ActivityService.java
```

---

# ⚙️ Tech Stack

* Java 17
* Spring Boot 3.2.x
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Lombok

---

# ✨ Features

## 🟢 Phase 1 — Completed

### Core Backend

* REST APIs using Spring Boot
* PostgreSQL Integration
* Activity Entity Design
* Layered Architecture

### CRUD Operations

* Create Activity
* Get All Activities
* Get Activity By ID
* Update Activity
* Delete Activity

---

## 🟡 Phase 2 — Completed

### Clean API Design

* DTO Layer
* Request Validation
* Global Exception Handling
* Standardized API Responses

### Validation Rules

* Title cannot be empty
* Description cannot be empty
* Duration must be at least 1 minute

---

## 🔵 Phase 3 — In Progress

### Security

* Spring Security
* JWT Authentication
* User Registration
* Login API
* Password Encryption (BCrypt)
* Protected Endpoints

---

## 🔴 Phase 4 — Planned

### Advanced Features

* Analytics APIs
* Dashboard APIs
* Learning Streak Tracking
* Activity Statistics
* Swagger/OpenAPI Documentation
* Deployment

---

# 🔌 API Endpoints

| Method | Endpoint               | Description        |
| ------ | ---------------------- | ------------------ |
| POST   | `/api/activities`      | Create Activity    |
| GET    | `/api/activities`      | Get All Activities |
| GET    | `/api/activities/{id}` | Get Activity By ID |
| PUT    | `/api/activities/{id}` | Update Activity    |
| DELETE | `/api/activities/{id}` | Delete Activity    |

---

# ✅ Example Success Response

```json
{
  "success": true,
  "data": {
    "id": 1,
    "title": "DSA Practice",
    "description": "Solved arrays problems",
    "durationMinutes": 60,
    "createdAt": "2026-06-21T10:47:52.9304359"
  },
  "message": "Activity created successfully"
}
```

---

# ❌ Example Validation Error

```json
{
  "success": false,
  "data": {
    "title": "Title cannot be empty"
  },
  "message": "Validation failed"
}
```

---

# ❌ Example Resource Not Found Error

```json
{
  "success": false,
  "data": null,
  "message": "Activity not found with id: 999999"
}
```

---

# ▶️ Running Locally

## 1. Clone Repository

```bash
git clone https://github.com/Aqsa30nz/devtrack.git
```

## 2. Configure Database

Add the following properties to your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/devtrack
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 3. Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

# 🧪 API Testing

Tested using:

* PowerShell (`Invoke-RestMethod`)
* Postman
* cURL

Example:

```powershell
Invoke-RestMethod `
-Uri "http://localhost:8080/api/activities" `
-Method GET
```

---

# 📌 Project Status

| Phase                                   | Status      |
| --------------------------------------- | ----------- |
| Phase 1 - CRUD + PostgreSQL             | ✅ Completed |
| Phase 2 - DTO + Validation + Exceptions | ✅ Completed |
| Phase 3 - JWT Authentication            | 📌 In Progress|
| Phase 4 - Analytics & Deployment        | 🚧 Planned  |

---

# 🎯 Goal

Built for:

* Software Engineering Internships
* Backend Development Roles
* Spring Boot Learning
* System Design Practice
* Production-Oriented Backend Development

---

# 👨‍💻 Author

**Aqsa Naaz**

Java Backend Developer | Spring Boot Enthusiast
