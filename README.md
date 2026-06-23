# 🚀 DevTrack — Secure Activity Tracking Backend System

A production-oriented backend application built using **Java, Spring Boot, PostgreSQL, Spring Security, and JWT Authentication** for tracking coding and learning activities.

DevTrack follows a clean layered architecture and demonstrates modern backend development practices including authentication, authorization, validation, exception handling, and database persistence.

---

# 🧠 Project Overview

DevTrack enables users to:

* Register and create accounts
* Securely authenticate using JWT tokens
* Create and manage activities
* Track learning sessions and coding progress
* Maintain structured activity history
* Access only their own activities through ownership-based authorization

The project focuses on:

* RESTful API Design
* Layered Architecture
* DTO-Based API Design
* Request Validation
* Global Exception Handling
* Spring Security
* JWT Authentication
* Authorization & Access Control
* PostgreSQL Integration
* Production-Oriented Backend Development

---

# 🏗️ Architecture

```text
Client
   ↓
JWT Authentication
   ↓
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

+ Spring Security
+ JWT Filter
+ Global Exception Handling
+ Standardized API Responses
+ User Authorization
```

---

# 📁 Project Structure

```text
src/main/java/com/aqsa/devtrack

│── DevtrackApplication.java
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   ├── ActivityController.java
│   └── AuthController.java
│
├── dto
│   ├── ActivityRequestDTO.java
│   ├── ActivityResponseDTO.java
│   ├── ApiResponse.java
│   ├── AuthResponseDTO.java
│   ├── LoginRequestDTO.java
│   └── RegisterRequestDTO.java
│
├── entity
│   ├── Activity.java
│   └── User.java
│
├── exception
│   ├── GlobalExceptionHandler.java
│   ├── ResourceNotFoundException.java
│   └── UnauthorizedAccessException.java
│
├── repository
│   ├── ActivityRepository.java
│   └── UserRepository.java
│
├── security
│   └── JwtAuthenticationFilter.java
│
├── service
│   ├── ActivityService.java
│   ├── AuthService.java
│   ├── CustomUserDetailsService.java
│   └── JwtService.java
```

---

# ⚙️ Tech Stack

* Java 17
* Spring Boot 3.3.5
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Lombok

---

# 🗄️ Database Design

## User

| Field    | Type   |
| -------- | ------ |
| id       | Long   |
| name     | String |
| email    | String |
| password | String |
| role     | String |

## Activity

| Field           | Type          |
| --------------- | ------------- |
| id              | Long          |
| title           | String        |
| description     | String        |
| durationMinutes | Integer       |
| createdAt       | LocalDateTime |
| userId          | Long          |

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

## 🔵 Phase 3 — Completed

### Authentication & Security

* Spring Security Integration
* JWT Authentication
* User Registration API
* User Login API
* BCrypt Password Encryption
* Stateless Authentication
* JWT Validation Filter
* Protected Endpoints

### Authorization

* Activity Ownership Enforcement
* User-Specific Activity Access
* Unauthorized Access Protection
* Custom Authorization Error Responses

### Security Features

* Password Hashing using BCrypt
* Database-backed Authentication
* JWT Token Generation
* JWT Token Validation
* Secure Route Protection

---

## 🔴 Phase 4 — Planned

### Advanced Features

* Activity Analytics APIs
* Dashboard APIs
* Learning Streak Tracking
* User Statistics
* Swagger/OpenAPI Documentation
* Docker Support
* Cloud Deployment

---

# 🔐 Authentication Flow

```text
Register
   ↓
User Stored in PostgreSQL
   ↓
Password Encrypted with BCrypt
   ↓
Login
   ↓
JWT Token Generated
   ↓
Client Sends JWT Token
   ↓
JWT Filter Validates Token
   ↓
Protected APIs Accessible
```

---

# 🔒 Security Architecture

```text
Request
   ↓
JWT Filter
   ↓
Extract Token
   ↓
Validate Token
   ↓
Load User Details
   ↓
Spring Security Context
   ↓
Controller Access
```

---

# 🛡️ Security Highlights

* JWT-based Stateless Authentication
* BCrypt Password Hashing
* Protected REST Endpoints
* User Ownership Enforcement
* Database-backed Authentication
* Custom Authorization Handling
* Access Control using Spring Security

---

# 🔌 API Endpoints

## Authentication APIs

| Method | Endpoint             | Description   |
| ------ | -------------------- | ------------- |
| POST   | `/api/auth/register` | Register User |
| POST   | `/api/auth/login`    | Login User    |

---

## Activity APIs

| Method | Endpoint               | Description         |
| ------ | ---------------------- | ------------------- |
| POST   | `/api/activities`      | Create Activity     |
| GET    | `/api/activities`      | Get User Activities |
| GET    | `/api/activities/{id}` | Get Activity By ID  |
| PUT    | `/api/activities/{id}` | Update Activity     |
| DELETE | `/api/activities/{id}` | Delete Activity     |

---

# 📊 HTTP Status Codes

| Status Code | Meaning            |
| ----------- | ------------------ |
| 200         | Success            |
| 201         | Resource Created   |
| 400         | Validation Error   |
| 401         | Unauthorized       |
| 403         | Forbidden          |
| 404         | Resource Not Found |

---

# ✅ Example Success Response

```json
{
  "success": true,
  "data": {
    "id": 7,
    "title": "DSA Practice",
    "description": "Solved Arrays Problems",
    "durationMinutes": 60
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

# ❌ Example Unauthorized Access Error

```json
{
  "success": false,
  "data": null,
  "message": "You cannot access this activity"
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

## 2. Configure PostgreSQL

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/devtrack
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 3. Configure JWT Secret

```properties
jwt.secret=your-secret-key
```

## 4. Run Application

```bash
mvn spring-boot:run
```

Application runs at:

```text
http://localhost:8080
```

---

# 🧪 API Testing

Tested using:

* PowerShell (`Invoke-RestMethod`)
* Postman
* cURL

---

# 🔒 Authorization Example

DevTrack implements ownership-based authorization.

* User A can access only their activities.
* User B cannot access User A's activities.
* Cross-user access attempts return HTTP 403.
* Custom authorization exceptions are handled globally.

This ensures proper user data isolation and secure access control.

---

# 📚 Key Concepts Implemented

* Spring Security Configuration
* JWT Authentication
* BCrypt Password Encryption
* Authentication Flow
* Authorization & Ownership Checks
* DTO Mapping
* Validation
* Global Exception Handling
* JPA Relationships
* Layered Architecture
* Repository Pattern

---

# 🚀 Future Roadmap

* Activity Analytics Dashboard
* Learning Streak Tracking
* Swagger/OpenAPI Documentation
* Docker Containerization
* Unit Testing (JUnit + Mockito)
* Integration Testing
* GitHub Actions CI/CD
* Cloud Deployment (Render / Railway / AWS)

---

# 📌 Project Status

| Phase                                            | Status      |
| ------------------------------------------------ | ----------- |
| Phase 1 - CRUD + PostgreSQL                      | ✅ Completed |
| Phase 2 - DTO + Validation + Exceptions          | ✅ Completed |
| Phase 3 - JWT Authentication + Authorization     | ✅ Completed |
| Phase 4 - Analytics + Documentation + Deployment | 🚧 Planned  |

---

# 🎯 Learning Outcomes

This project demonstrates:

* Java Backend Development
* Spring Boot Development
* REST API Design
* PostgreSQL Integration
* JWT Authentication
* Spring Security
* Authorization & Access Control
* Exception Handling
* Validation
* Clean Architecture
* Production-Oriented Backend Practices

---

# 👨‍💻 Author

**Aqsa Naaz**

Java Backend Developer • Spring Boot Enthusiast • Open Source Contributor
