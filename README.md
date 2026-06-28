# 🚀 DevTrack — Secure Activity Tracking Backend System
DevTrack is a secure backend system for tracking user activity events and generating productivity analytics through structured REST APIs. It simulates a production-grade event logging and insights pipeline with authentication, authorization, and data aggregation layers.

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-6DB33F?logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?logo=postgresql&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F)
![Swagger](https://img.shields.io/badge/OpenAPI-Swagger-85EA2D?logo=swagger)
![License](https://img.shields.io/badge/License-MIT-blue)


DevTrack provides secure user authentication, ownership-based authorization, advanced activity management, analytics dashboards, learning progress insights, and well-documented REST APIs. The project follows a clean layered architecture and demonstrates modern backend engineering practices, making it suitable as a portfolio project and a foundation for production-ready backend development.

---

## ✨ Current Highlights

- 🔐 JWT-based Authentication & Authorization
- 👤 User-specific Activity Management
- 📊 Learning Analytics & Dashboard APIs
- 🔍 Pagination, Sorting, Filtering & Search
- 📄 Interactive API Documentation with Swagger UI
- ✅ Request Validation & Global Exception Handling
- 🏗️ Clean Layered Architecture
- 🗄️ PostgreSQL Database Integration
- 🛡️ Secure REST API Design

##🧠 Engineering Design Highlights
Designed a stateless authentication system using JWT to eliminate server-side session dependency and improve scalability
Structured system using layered architecture to enforce separation of concerns between API, business logic, and persistence layers
Implemented ownership-based data isolation to ensure strict user-level access control across all resources
Used JPA Specifications to support dynamic query composition for filtering, searching, and analytics generation
Standardized API responses to ensure consistency across all endpoints and improve client-side integration reliability
---
# 📑 Table of Contents

- [Project Overview](#-project-overview)
- [Architecture](#-architecture)
- [Project Structure](#-project-structure)
- [Tech Stack](#-tech-stack)
- [Database Design](#-database-design)
- [Features](#-features)
- [Authentication Flow](#-authentication-flow)
- [Security Architecture](#-security-architecture)
- [API Endpoints](#-api-endpoints)
- [Running Locally](#-running-locally)
- [API Testing](#-api-testing)
- [Future Roadmap](#-future-roadmap)
- [Project Status](#-project-status)
- [Learning Outcomes](#-learning-outcomes)
- [Author](#-author)
---

# 🧠 Project Overview

DevTrack is a secure, production-oriented backend application designed to help users track their coding, learning, and productivity activities. It provides a robust RESTful API for managing activities while ensuring secure access through JWT-based authentication and ownership-based authorization.

Beyond basic CRUD operations, DevTrack incorporates advanced backend features such as activity analytics, dashboard insights, pagination, sorting, filtering, searching, request validation, exception handling, and comprehensive API documentation using Swagger/OpenAPI.

The project follows a clean layered architecture and emphasizes scalable backend design, maintainability, and production-ready development practices.

---

## 🎯 Core Functionalities

DevTrack enables users to:

- Register and securely create accounts
- Authenticate using JWT tokens
- Manage personal learning and coding activities
- Create, update, view, and delete activities
- Search, filter, sort, and paginate activity records
- View personalized dashboard statistics
- Track learning streaks and productivity metrics
- Analyze activity completion and category-wise progress
- Access interactive API documentation through Swagger UI
- Access only their own activities through ownership-based authorization

---

## 🛠️ Backend Concepts Demonstrated

This project showcases modern backend development practices, including:

- RESTful API Design
- Layered Architecture
- DTO-Based API Design
- Authentication & Authorization
- JWT Security
- Spring Security
- Request Validation
- Global Exception Handling
- Standardized API Responses
- Pagination, Sorting & Filtering
- Search Functionality
- Analytics & Dashboard APIs
- PostgreSQL Integration with Spring Data JPA
- OpenAPI (Swagger) Documentation
- Production-Oriented Backend Development

---
# 🏗️ Architecture

DevTrack follows a **layered architecture** that separates responsibilities across different application layers. This design promotes maintainability, scalability, testability, and clean code organization while following backend development best practices.

Each incoming request passes through authentication and validation before reaching the business logic layer. Responses are standardized using DTOs, and exceptions are handled centrally to ensure consistent API behavior.

---

## 📐 High-Level Architecture

```text
                        Client
                           │
                           ▼
                  JWT Authentication
                           │
                           ▼
                 Spring Security Filter
                           │
                           ▼
                     REST Controller
                           │
                           ▼
               Request Validation (DTO)
                           │
                           ▼
                     Service Layer
                           │
                           ▼
                  Repository Layer
                           │
                           ▼
                     PostgreSQL Database
```

---

## 🔄 Request Processing Flow

```text
HTTP Request
      │
      ▼
JWT Authentication Filter
      │
      ▼
Spring Security
      │
      ▼
Controller
      │
      ▼
Request DTO Validation
      │
      ▼
Service Layer
      │
      ▼
Repository (Spring Data JPA)
      │
      ▼
PostgreSQL
      │
      ▼
Response DTO
      │
      ▼
Standardized API Response
```

---

## 🧩 Architectural Components

| Layer                 | Responsibility                                                                                  |
| --------------------- | ----------------------------------------------------------------------------------------------- |
| **Controller**        | Exposes REST endpoints and handles incoming HTTP requests.                                      |
| **DTO Layer**         | Transfers request and response data while preventing direct entity exposure.                    |
| **Validation**        | Validates client requests using Jakarta Bean Validation annotations.                            |
| **Service Layer**     | Contains business logic, authorization checks, analytics calculations, and activity management. |
| **Repository Layer**  | Performs database operations using Spring Data JPA.                                             |
| **Security Layer**    | Handles JWT authentication, authorization, and Spring Security integration.                     |
| **Database**          | Stores users, activities, and related application data in PostgreSQL.                           |
| **Exception Handler** | Provides centralized exception handling and standardized error responses.                       |

---

## ✅ Architectural Highlights

* Layered Architecture
* Separation of Concerns
* DTO-Based API Design
* Stateless JWT Authentication
* Ownership-Based Authorization
* Centralized Exception Handling
* Standardized API Responses
* Spring Data JPA Repository Pattern
* PostgreSQL Persistence
* Scalable REST API Design
---

# 📁 Project Structure

DevTrack follows a clean package-by-feature architecture that separates business logic, security, analytics, persistence, and API layers for improved maintainability, scalability, and readability.

---

## 📂 Source Structure

```text
src
└── main
    ├── java
    │   └── com
    │       └── aqsa
    │           └── devtrack
    │               ├── analytics
    │               │   └── dto
    │               ├── config
    │               ├── controller
    │               ├── dashboard
    │               │   └── dto
    │               ├── dto
    │               ├── entity
    │               ├── exception
    │               ├── repository
    │               ├── security
    │               ├── service
    │               ├── specification
    │               └── DevtrackApplication.java
    │
    └── resources
        ├── static
        ├── templates
        └── application.properties
```

---

## 📦 Package Responsibilities

| Package           | Responsibility                                                                                                                 |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------ |
| **analytics**     | Contains analytics logic and DTOs for learning statistics, productivity metrics, completion insights, and streak calculations. |
| **config**        | Application configuration including Spring Security, Swagger/OpenAPI, and other framework-level configurations.                |
| **controller**    | Exposes REST endpoints for authentication, activity management, analytics, and dashboard operations.                           |
| **dashboard**     | Contains dashboard-specific DTOs used to aggregate and return summary statistics.                                              |
| **dto**           | Request and response objects exchanged between clients and the API.                                                            |
| **entity**        | JPA entity classes representing database tables such as `User` and `Activity`.                                                 |
| **exception**     | Custom exceptions and global exception handling for consistent API error responses.                                            |
| **repository**    | Spring Data JPA repositories responsible for database access and persistence operations.                                       |
| **security**      | JWT authentication filter, token utilities, Spring Security integration, and user authentication services.                     |
| **service**       | Business logic for authentication, activity management, analytics, dashboard generation, and authorization.                    |
| **specification** | Dynamic JPA Specifications used for searching, filtering, and building flexible database queries.                              |

---

## 🏛️ Project Design Highlights

* ✅ Layered Architecture
* ✅ Feature-Based Package Organization
* ✅ DTO-Centric API Design
* ✅ Spring Security with JWT Authentication
* ✅ Repository Pattern using Spring Data JPA
* ✅ Dynamic Querying using JPA Specifications
* ✅ Modular Analytics & Dashboard Components
* ✅ Centralized Exception Handling
* ✅ Clean Separation of Concerns
---
# ⚙️ Tech Stack

DevTrack is built using modern Java backend technologies that emphasize security, scalability, maintainability, and production-ready REST API development.

---

## 🖥️ Programming Language

| Technology | Version |
| ---------- | ------- |
| Java       | 17      |

---

## 🚀 Backend Framework

| Technology  | Version                   |
| ----------- | ------------------------- |
| Spring Boot | 3.3.5                     |
| Spring MVC  | Included with Spring Boot |

---

## 🔐 Security

| Technology        | Purpose                        |
| ----------------- | ------------------------------ |
| Spring Security   | Authentication & Authorization |
| JWT (JJWT 0.11.5) | Stateless Authentication       |
| BCrypt            | Password Encryption            |

---

## 🗄️ Database & Persistence

| Technology      | Purpose                |
| --------------- | ---------------------- |
| PostgreSQL      | Relational Database    |
| Spring Data JPA | ORM & Repository Layer |
| Hibernate       | JPA Implementation     |

---

## ✅ Validation

| Technology              | Purpose                          |
| ----------------------- | -------------------------------- |
| Spring Boot Validation  | Request Validation               |
| Jakarta Bean Validation | DTO Validation using Annotations |

---

## 📄 API Documentation

| Technology        | Version  |
| ----------------- | -------- |
| Springdoc OpenAPI | 2.6.0    |
| Swagger UI        | Included |

---

## 🛠️ Build & Development Tools

| Technology | Purpose                                  |
| ---------- | ---------------------------------------- |
| Maven      | Dependency Management & Build Automation |
| Lombok     | Boilerplate Code Reduction               |

---

## 🧪 API Testing

* Postman
* PowerShell (`Invoke-RestMethod`)
* cURL

---

## 🏗️ Core Backend Concepts

* RESTful API Development
* Layered Architecture
* DTO-Based API Design
* JWT Authentication
* Role & Ownership-Based Authorization
* Request Validation
* Global Exception Handling
* Pagination
* Sorting
* Filtering
* Dynamic Search
* Analytics APIs
* Dashboard APIs
* OpenAPI Documentation
* Production-Oriented Backend Development
---
# 🗄️ Database Design

DevTrack uses **PostgreSQL** as its relational database and **Spring Data JPA (Hibernate)** as the ORM layer for object-relational mapping. The database schema is designed to maintain data integrity while supporting secure, user-specific activity management.

---

## 📐 Entity Relationship Diagram (ERD)

```text
+----------------------+
|        User          |
+----------------------+
| id (PK)              |
| name                 |
| email (UNIQUE)       |
| password             |
| role                 |
+----------------------+
           │
           │ 1
           │
           │
           │ *
+----------------------+
|      Activity        |
+----------------------+
| id (PK)              |
| title                |
| description          |
| durationMinutes      |
| createdAt            |
| user_id (FK)         |
+----------------------+
```

---

## 🔗 Entity Relationship

DevTrack follows a **One-to-Many** relationship between `User` and `Activity`.

* A **User** can own multiple activities.
* Every **Activity** belongs to exactly one user.
* Activities are isolated per user to enforce ownership-based authorization and secure data access.

---

## 👤 User Entity

| Field        | Type           | Constraints                 |
| ------------ | -------------- | --------------------------- |
| `id`         | Long           | Primary Key, Auto Generated |
| `name`       | String         | Not Null                    |
| `email`      | String         | Not Null, Unique            |
| `password`   | String         | Not Null (BCrypt Encrypted) |
| `role`       | String         | Not Null                    |
| `activities` | List<Activity> | One-to-Many Relationship    |

---

## 📚 Activity Entity

| Field             | Type          | Constraints                 |
| ----------------- | ------------- | --------------------------- |
| `id`              | Long          | Primary Key, Auto Generated |
| `title`           | String        | Not Null                    |
| `description`     | String        | Not Null                    |
| `durationMinutes` | Integer       | Positive Duration           |
| `createdAt`       | LocalDateTime | Automatically Initialized   |
| `user`            | User          | Many-to-One Relationship    |

---

## 🔑 Primary Keys

| Entity   | Primary Key |
| -------- | ----------- |
| User     | `id`        |
| Activity | `id`        |

---

## 🔗 Foreign Keys

| Table    | Foreign Key | References |
| -------- | ----------- | ---------- |
| Activity | `user_id`   | User(id)   |

---

## 🛡️ Data Integrity

The database design ensures:

* Unique email addresses for every registered user.
* Every activity is associated with exactly one user.
* Referential integrity through foreign key relationships.
* Secure ownership mapping between users and activities.
* Automatic primary key generation using identity strategy.

---

## ⚡ ORM Features

DevTrack leverages Hibernate and Spring Data JPA to provide:

* Automatic Object-Relational Mapping (ORM)
* Repository-Based Data Access
* Lazy Loading for User-Activity Relationships
* Automatic SQL Generation
* Entity Lifecycle Management
* Simplified CRUD Operations
* Database Portability through JPA
---
# ✨ Features

DevTrack has been developed incrementally through multiple phases, with each phase introducing new backend engineering concepts and production-oriented features.

---

# 🟢 Phase 1 — Core Backend Development

**Objective:** Build the foundational backend architecture and implement complete CRUD functionality for activity management.

### Implemented Features

* RESTful API development using Spring Boot
* PostgreSQL database integration
* Activity entity design
* User entity design
* Layered architecture (Controller → Service → Repository)
* Spring Data JPA integration
* Hibernate ORM
* Complete CRUD operations for activities

### CRUD Operations

* ✅ Create Activity
* ✅ Retrieve Activity by ID
* ✅ Retrieve All Activities
* ✅ Update Activity
* ✅ Delete Activity

### Key Concepts

* REST API Design
* Spring Boot Fundamentals
* JPA Entity Mapping
* Repository Pattern
* Service Layer Architecture
* PostgreSQL Integration

---

# 🟡 Phase 2 — Clean API Architecture

**Objective:** Improve API quality through validation, standardized responses, filtering capabilities, and maintainable request handling.

### Implemented Features

* DTO-based API design
* Request & response separation
* Standardized API response wrapper
* Global exception handling
* Request validation
* Dynamic searching
* Activity filtering
* Pagination
* Sorting
* JPA Specifications for dynamic queries

### Validation Rules

* Title cannot be empty
* Description cannot be empty
* Duration must be greater than zero

### Key Concepts

* DTO Mapping
* Jakarta Bean Validation
* Global Exception Handling
* Dynamic Query Building
* Pagination & Sorting
* Flexible Search APIs

---

# 🔵 Phase 3 — Authentication & Authorization

**Objective:** Secure the application using industry-standard authentication and authorization mechanisms.

### Authentication Features

* JWT-based Authentication
* User Registration
* User Login
* Stateless Authentication
* JWT Token Generation
* JWT Token Validation
* Protected REST APIs

### Authorization Features

* Ownership-Based Authorization
* User-Specific Activity Access
* Secure Route Protection
* Spring Security Integration
* Authentication Context Management

### Security Features

* BCrypt Password Encryption
* Custom JWT Authentication Filter
* Database-backed Authentication
* Unauthorized Access Protection
* Custom Authorization Exceptions

### Key Concepts

* Spring Security
* JWT Authentication
* Authentication Filters
* Authorization
* Password Hashing
* Secure REST API Development

---

# 🟣 Phase 4 — Analytics & API Documentation

**Objective:** Transform DevTrack from a CRUD application into a data-driven backend by introducing analytics, dashboard APIs, and professional API documentation.

### Dashboard Module

* Personalized dashboard endpoint
* Aggregated user statistics
* Recent activity summary
* Dashboard response composition

### Analytics Module

* Learning summary statistics
* Weekly learning analytics
* Monthly learning analytics
* Learning streak calculation
* Total active days tracking
* Longest learning streak
* Current learning streak
* Total learning time
* Average session duration
* Longest session analysis
* Shortest session analysis

### Advanced Query Features

* Pagination
* Sorting
* Keyword Search
* Dynamic Filtering
* Repository Aggregation Queries

### API Documentation

* Swagger UI Integration
* OpenAPI Specification
* Interactive API Testing
* Self-Documented REST Endpoints

### Key Concepts

* Dashboard Design
* Data Aggregation
* Analytics APIs
* Custom Repository Queries
* Business Logic Aggregation
* DTO Composition
* OpenAPI Documentation
* Production API Documentation

---

# 🚧 Phase 5 — Production Engineering *(In Progress)*

The next phase focuses on making DevTrack production-ready by introducing advanced engineering practices.

### Planned Features

* Docker Containerization
* CI/CD Pipeline
* Redis Caching
* Rate Limiting
* Logging & Monitoring
* Performance Optimization
* Unit Testing
* Integration Testing
* Cloud Deployment
* Production Security Enhancements
---

# 🔐 Authentication Flow

DevTrack uses **JWT (JSON Web Token)** based stateless authentication with **Spring Security** to secure REST APIs. Once authenticated, clients include the JWT token in every request to access protected resources without maintaining server-side sessions.

---

## 👤 User Registration Flow

```text
User
 │
 ▼
POST /api/auth/register
 │
 ▼
Validate Request
 │
 ▼
Check Email Availability
 │
 ▼
Encrypt Password (BCrypt)
 │
 ▼
Store User in PostgreSQL
 │
 ▼
Registration Successful
```

---

## 🔑 User Login Flow

```text
User
 │
 ▼
POST /api/auth/login
 │
 ▼
Validate Credentials
 │
 ▼
Load User from Database
 │
 ▼
Verify Password (BCrypt)
 │
 ▼
Generate JWT Token
 │
 ▼
Return JWT Token
```

---

## 🔒 Protected Request Flow

```text
Client Request
      │
      ▼
Authorization: Bearer <JWT>
      │
      ▼
JWT Authentication Filter
      │
      ▼
Extract JWT Token
      │
      ▼
Validate Token
      │
      ▼
Load User Details
      │
      ▼
Spring Security Context
      │
      ▼
Controller
      │
      ▼
Business Logic
      │
      ▼
Database
      │
      ▼
Standardized API Response
```

---

## 🔑 Authentication Components

| Component           | Responsibility                                                                       |
| ------------------- | ------------------------------------------------------------------------------------ |
| **Register API**    | Creates a new user account after validating the request and encrypting the password. |
| **Login API**       | Authenticates user credentials and generates a JWT token.                            |
| **JWT Token**       | Identifies authenticated users without maintaining server-side sessions.             |
| **JWT Filter**      | Validates incoming JWT tokens before processing protected requests.                  |
| **Spring Security** | Handles authentication, authorization, and request security.                         |
| **BCrypt**          | Securely hashes user passwords before database storage.                              |

---

## 🔄 Authentication Lifecycle

1. User registers with name, email, and password.
2. Password is encrypted using BCrypt before being stored.
3. User logs in with valid credentials.
4. A signed JWT token is generated and returned.
5. The client stores the JWT token securely.
6. Every protected request includes the token in the `Authorization` header.
7. Spring Security validates the token before granting access.
8. The authenticated user can access only their own resources.

---

## 🛡️ Security Benefits

* Stateless authentication using JWT
* Secure password hashing with BCrypt
* No server-side session management
* Protected REST endpoints
* Ownership-based resource access
* Authentication managed by Spring Security
* Token validation on every protected request
* Secure and scalable authentication architecture
---

# 🔒 Security Architecture

DevTrack implements a **stateless security architecture** using **Spring Security** and **JWT (JSON Web Token)** authentication. Every protected request is authenticated through a custom JWT filter before reaching the application layer, ensuring that only authorized users can access secured resources.

---

## 🏛️ Security Workflow

```text
                    Client Request
                           │
                           ▼
             Authorization: Bearer <JWT>
                           │
                           ▼
               JwtAuthenticationFilter
                           │
          ┌────────────────┴────────────────┐
          │                                 │
          ▼                                 ▼
   Missing / Invalid Token          Valid JWT Token
          │                                 │
          ▼                                 ▼
 Continue Filter Chain            Extract User Email
                                          │
                                          ▼
                              Load User from Database
                                          │
                                          ▼
                         Create Authentication Object
                                          │
                                          ▼
                     Populate SecurityContextHolder
                                          │
                                          ▼
                           Spring Security Authorization
                                          │
                                          ▼
                              Protected REST Controller
```

---

## 🛡️ Security Components

| Component                   | Responsibility                                                                                                            |
| --------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| **SecurityConfig**          | Configures Spring Security, stateless authentication, public routes, protected routes, and JWT filter registration.       |
| **JwtAuthenticationFilter** | Intercepts incoming requests, validates JWT tokens, loads authenticated users, and populates the Spring Security context. |
| **JwtService**              | Generates JWT tokens, extracts user information, and validates token authenticity and expiration.                         |
| **BCryptPasswordEncoder**   | Encrypts user passwords before storing them in the database.                                                              |
| **AuthenticationManager**   | Authenticates user login credentials during the login process.                                                            |
| **SecurityContextHolder**   | Stores authentication details for the currently authenticated request.                                                    |

---

## 🔐 Endpoint Security

### 🌐 Public Endpoints

The following endpoints are accessible without authentication:

* User Registration
* User Login
* Swagger UI
* OpenAPI Documentation

---

### 🔒 Protected Endpoints

The following resources require a valid JWT token:

* Activity Management APIs
* Analytics APIs
* Dashboard APIs
* All user-specific resources

Every protected request must include:

```http
Authorization: Bearer <your-jwt-token>
```

---

## 🔑 JWT Authentication Process

```text
User Login
     │
     ▼
Validate Credentials
     │
     ▼
Generate JWT (HS256)
     │
     ▼
Return JWT Token
     │
     ▼
Client Stores Token
     │
     ▼
Authorization Header
     │
     ▼
JwtAuthenticationFilter
     │
     ▼
Validate Signature & Expiration
     │
     ▼
Load User Details
     │
     ▼
Populate Security Context
     │
     ▼
Access Protected Resource
```

---

## 🏗️ Authorization Strategy

DevTrack follows **ownership-based authorization** to ensure data isolation between users.

Authorization checks ensure that:

* Users can access only their own activities.
* Analytics are generated only from the authenticated user's data.
* Dashboard statistics are personalized for the authenticated user.
* Cross-user data access is prevented.
* Unauthorized requests return appropriate HTTP error responses.

---

## 🛡️ Security Features

* JWT-Based Stateless Authentication
* Spring Security Integration
* BCrypt Password Hashing
* Role-Based Authentication
* Ownership-Based Authorization
* Custom JWT Authentication Filter
* Protected REST Endpoints
* Secure Password Storage
* Authentication Context Management
* Global Security Configuration

---

## ✅ Security Highlights

DevTrack follows modern REST API security practices by combining Spring Security with JWT authentication to eliminate server-side sessions while maintaining secure access control. Every authenticated request is validated before reaching the business layer, ensuring scalability, security, and proper user isolation.
---
# 📄 API Documentation

DevTrack provides comprehensive API documentation using **OpenAPI 3** and **Swagger UI**, enabling developers to explore, understand, and test REST endpoints through an interactive web interface.

The documentation is automatically generated from the application's controllers and remains synchronized with the API implementation.

---

## ✨ Documentation Features

* Interactive Swagger UI
* OpenAPI 3 Specification
* Automatic REST API Documentation
* JWT Bearer Authentication Support
* Endpoint Request & Response Visualization
* Built-in API Testing Interface
* Live Documentation Generation

---

## 🔐 JWT Authorization in Swagger

DevTrack integrates JWT authentication directly into Swagger UI, allowing authenticated endpoints to be tested without external tools.

Authentication workflow:

```text
Open Swagger UI
       │
       ▼
Click "Authorize"
       │
       ▼
Paste JWT Token
       │
       ▼
Bearer Authentication Applied
       │
       ▼
Access Protected APIs
```

---

## 📚 Documented API Modules

| Module             | Description                                                                                      |
| ------------------ | ------------------------------------------------------------------------------------------------ |
| **Authentication** | User registration and login endpoints.                                                           |
| **Activities**     | CRUD operations, pagination, sorting, filtering, and keyword search.                             |
| **Analytics**      | Learning statistics, weekly reports, monthly reports, and learning streaks.                      |
| **Dashboard**      | Personalized dashboard containing summary statistics, streak information, and recent activities. |

---

## 🔍 OpenAPI Metadata

The generated API documentation includes:

* Project title
* API version
* Project description
* Contact information
* Security requirements
* Bearer Authentication scheme
* Interactive endpoint documentation

---

## 🚀 Swagger UI

Once the application is running, the interactive documentation is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

The OpenAPI specification can be accessed at:

```text
http://localhost:8080/v3/api-docs
```

---

## ✅ Benefits

* Simplifies API exploration
* Reduces onboarding time for developers
* Enables quick endpoint testing
* Documents request and response models
* Demonstrates production-ready API practices
* Keeps documentation synchronized with the codebase
---
# 🔌 API Endpoints

All endpoints (except authentication) require a valid JWT Bearer Token.

---

## 🔐 Authentication APIs

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| POST | `/api/auth/register` | Register a new user | ❌ No |
| POST | `/api/auth/login` | Authenticate user and receive JWT | ❌ No |

---

## 📝 Activity APIs

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| POST | `/api/activities` | Create a new activity | ✅ Yes |
| GET | `/api/activities` | Retrieve paginated activities with filtering and sorting | ✅ Yes |
| GET | `/api/activities/{id}` | Retrieve a specific activity | ✅ Yes |
| PUT | `/api/activities/{id}` | Update an activity | ✅ Yes |
| DELETE | `/api/activities/{id}` | Delete an activity | ✅ Yes |

### Supported Query Parameters

| Parameter | Description | Default |
| ---------- | ----------- | ------- |
| `page` | Page number | `0` |
| `size` | Number of records per page | `10` |
| `sort` | Field used for sorting | `createdAt` |
| `direction` | Sort direction (`asc` or `desc`) | `desc` |
| `minDuration` | Minimum activity duration | Optional |
| `maxDuration` | Maximum activity duration | Optional |
| `keyword` | Search by title or description | Optional |

### Example

```http
GET /api/activities?page=0&size=10&sort=createdAt&direction=desc&keyword=DSA&minDuration=30
```

---

## 📊 Analytics APIs

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| GET | `/api/analytics/summary` | Overall learning statistics | ✅ Yes |
| GET | `/api/analytics/weekly` | Weekly activity analytics | ✅ Yes |
| GET | `/api/analytics/monthly` | Monthly activity analytics | ✅ Yes |
| GET | `/api/analytics/streak` | Learning streak statistics | ✅ Yes |

---

## 📈 Dashboard API

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| GET | `/api/dashboard` | Retrieve dashboard overview including summary, streak, and recent activities | ✅ Yes |

---

## 📖 Interactive API Documentation

Swagger UI is available after starting the application.

```
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON specification:

```
http://localhost:8080/v3/api-docs
```
---
# ▶️ Running Locally

## Prerequisites

Before running the project, ensure you have the following installed:

- Java 17 or later
- Maven 3.9+
- PostgreSQL
- Git

---

## 1. Clone the Repository

```bash
git clone https://github.com/Aqsa30nz/devtrack.git
cd devtrack
```

---

## 2. Configure the Database

Create an `application.properties` file inside:

```text
src/main/resources/
```

Add the following configuration:

```properties
spring.application.name=devtrack

spring.datasource.url=jdbc:postgresql://localhost:5432/devtrack
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> **Note:** Update the database credentials according to your local PostgreSQL setup.

---

## 3. Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## 4. Access Swagger UI

Interactive API documentation is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI specification:

```text
http://localhost:8080/v3/api-docs
```
---
# 🧪 API Testing

The REST APIs were thoroughly tested throughout development using multiple tools.

### Tools Used

- Postman
- PowerShell (`Invoke-RestMethod`)
- cURL
- Swagger UI

---

## Authentication Flow

1. Register a new user.
2. Authenticate using the login endpoint.
3. Receive a JWT access token.
4. Include the token in the `Authorization` header:

```http
Authorization: Bearer <your-jwt-token>
```

5. Access protected endpoints such as Activities, Analytics, and Dashboard APIs.

---

## Features Verified

- User registration and authentication
- JWT-based authorization
- Activity CRUD operations
- Ownership-based access control
- Request validation
- Global exception handling
- Pagination
- Sorting
- Filtering
- Keyword search
- Analytics summary
- Weekly analytics
- Monthly analytics
- Learning streak calculation
- Dashboard aggregation
- Standardized API responses
---
# 🚀 Future Roadmap

The following enhancements are planned for future releases of DevTrack:

## Phase 5

- Docker Containerization
- Environment-based Configuration
- GitHub Actions CI/CD Pipeline
- Cloud Deployment (Render / Railway / AWS)

## Phase 6

- Unit Testing using JUnit 5 and Mockito
- Integration Testing
- API Versioning
- Performance Optimization

## Future Enhancements

- Activity Categories
- Activity Tags
- Goal & Target Tracking
- Progress Charts and Visualizations
- Email Notifications
- User Profile Management
- Export Activity Reports (PDF/CSV)
---
# 📌 Project Status

| Phase | Features | Status |
| ------ | -------- | ------ |
| Phase 1 | CRUD Operations + PostgreSQL | ✅ Completed |
| Phase 2 | DTOs + Validation + Exception Handling | ✅ Completed |
| Phase 3 | JWT Authentication + Authorization | ✅ Completed |
| Phase 4 | Pagination, Sorting, Filtering, Analytics, Dashboard & Swagger | ✅ Completed |
| Phase 5 | Docker + CI/CD + Cloud Deployment | 🚧 Planned |
| Phase 6 | Testing & Production Improvements | 📅 Planned |
---
# 🎯 Learning Outcomes

Building DevTrack strengthened my understanding of modern backend development using the Spring ecosystem.

### Backend Development

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- PostgreSQL
- REST API Design

### Security

- Spring Security
- JWT Authentication
- Role-Based Authorization
- Ownership-Based Access Control
- Password Hashing with BCrypt

### Software Engineering

- Layered Architecture
- Repository Pattern
- DTO-Based API Design
- Request Validation
- Global Exception Handling
- Dynamic Querying using Spring Data JPA Specifications
- Pagination, Sorting, and Filtering
- API Documentation using Swagger/OpenAPI

### Professional Development

- Production-Oriented Backend Development
- Clean Code Practices
- Git & GitHub Workflow
- API Design Best Practices
- Documentation and Project Organization
---
---

## ⭐ Support the Project

If you found this project helpful, consider giving it a ⭐ on GitHub.

Feedback, suggestions, and contributions are always welcome!
---
# 👩‍💻 Author

## Aqsa Naaz

Aspiring Software Engineer passionate about Java backend development, Spring Boot, REST API design, and open source.

### Connect with me

- GitHub: https://github.com/Aqsa30nz
- LinkedIn: https://www.linkedin.com/in/Aqsa30nz