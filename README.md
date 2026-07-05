# 🚀 DevTrack — Secure Activity Tracking Backend System

DevTrack is a production-oriented backend application for tracking learning and productivity activities through secure REST APIs. It provides JWT-based authentication, ownership-based authorization, activity management, analytics, dashboard insights, and interactive API documentation with Swagger/OpenAPI.

Built with Java 17, Spring Boot, Spring Security, PostgreSQL, and Spring Data JPA, the project demonstrates modern backend engineering practices such as layered architecture, DTO-based API design, request validation, centralized exception handling, dynamic querying with JPA Specifications, and stateless JWT authentication.

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-6DB33F?logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?logo=postgresql&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F)
![Swagger](https://img.shields.io/badge/OpenAPI-Swagger-85EA2D?logo=swagger)
![License](https://img.shields.io/badge/License-MIT-blue)

## 🌐 Live Demo

- **Base URL:** https://devtrack-xkzz.onrender.com
- **Swagger UI:** [https://devtrack-xkzz.onrender.com/swagger-ui/index.html](https://devtrack-xkzz.onrender.com/swagger-ui/index.html)
- **OpenAPI Specification:** [https://devtrack-xkzz.onrender.com/v3/api-docs](https://devtrack-xkzz.onrender.com/v3/api-docs)

The project emphasizes secure, scalable, and maintainable backend development while following production-oriented design principles. It showcases REST API design, authentication and authorization, database integration, analytics generation, and clean software architecture, making it a strong portfolio project that demonstrates production-oriented backend engineering.

---

## ✨ Current Highlights

- 🔐 JWT-based Authentication & Authorization
- 👤 User-specific Activity Management
- 📊 Learning Analytics & Dashboard APIs
- 🔍 Pagination, Sorting, Filtering & Dynamic Search
- 📄 Interactive API Documentation with Swagger UI
- ✅ Request Validation & Global Exception Handling
- 🏗️ Clean Layered Architecture
- 🗄️ PostgreSQL Database Integration
- 🛡️ Secure REST API Design

---

## 🧠 Engineering Design Highlights

- Designed a stateless authentication system using JWT to eliminate server-side session dependency and improve scalability.
- Structured the system using a layered architecture to enforce separation of concerns between the API, business logic, and persistence layers.
- Implemented ownership-based data isolation to ensure strict user-level access control across all resources.
- Used JPA Specifications to support dynamic query composition for filtering, searching, and analytics generation.
- Standardized API responses to ensure consistent response structures and simplify client-side integration.

---

## 📑 Table of Contents

- [Live Demo](#-live-demo)
- [Current Highlights](#-current-highlights)
- [Engineering Design Highlights](#-engineering-design-highlights)
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

## 🧠 Project Overview

DevTrack is a production-oriented backend application designed to help users securely track learning and productivity activities through REST APIs. The system combines stateless JWT authentication, ownership-based authorization, structured activity management, analytics, and dashboard insights within a clean layered architecture.

Rather than focusing solely on CRUD operations, the project emphasizes secure API design, scalable application architecture, maintainable service organization, and flexible data access using Spring Data JPA Specifications. It demonstrates backend engineering practices commonly found in production systems while maintaining clean separation of concerns and consistent API design.

The application is designed as a backend-only service and exposes fully documented REST endpoints through Swagger/OpenAPI for easy exploration and integration.

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
- Spring Security
- JWT Authentication
- Ownership-Based Authorization
- DTO-Based API Design
- Request Validation
- Global Exception Handling
- Spring Data JPA
- JPA Specifications
- Pagination, Sorting & Filtering
- Analytics & Dashboard APIs
- OpenAPI Documentation
- Production-Oriented Backend Development

---

## 🏗️ Architecture

DevTrack follows a **layered architecture** that separates responsibilities across different application layers. This design promotes maintainability, scalability, testability, and clean code organization while following backend development best practices.

Each incoming request passes through authentication and validation before reaching the business logic layer. Responses are standardized using DTOs, and exceptions are handled centrally to ensure consistent API behavior.

---

### 📐 High-Level Architecture

```text
     Client
        │
        ▼
Spring Security (JWT Filter)
        │
        ▼
  REST Controller
        │
        ▼
Request DTO Validation
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

### 🔄 Request Processing Flow

```text
HTTP Request
      │
      ▼
JWT Authentication Filter
      │
      ▼
Spring Security Context
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
PostgreSQL Database
      │
      ▼
Response DTO Mapping
      │
      ▼
Standardized API Response
```

---

### 🧩 Architectural Components

| Layer                 | Responsibility                                                                                  |
| --------------------- | ----------------------------------------------------------------------------------------------- |
| **Controller**        | Exposes REST endpoints and handles incoming HTTP requests.                                      |
| **DTO Layer**         | Transfers request and response objects between clients and the application while preventing direct entity exposure.                   |
| **Validation**        | Validates client requests using Jakarta Bean Validation annotations.                            |
| **Service Layer**     | Contains business logic, authorization checks, analytics calculations, and activity management. |
| **Repository Layer**  | Performs database operations using Spring Data JPA.                                             |
| **Security Layer**    | Handles JWT authentication, authorization, and Spring Security integration.                     |
| **Database**          | Stores users, activities, and related application data in PostgreSQL.                           |
| **Exception Handler** | Provides centralized exception handling and standardized error responses.                       |
| **Specification Layer** | Builds dynamic filtering, searching, and sorting queries using Spring Data JPA Specifications.		 |

---

### ✅ Architectural Highlights

- Layered Architecture
- Separation of Concerns
- DTO-Based Request/Response Modeling
- Stateless JWT Authentication
- Ownership-Based Authorization
- Centralized Exception Handling
- Standardized API Response Structure
- Repository Pattern with Spring Data JPA
- Dynamic Querying using JPA Specifications
- PostgreSQL Persistence Layer
- Scalable REST API Design

---

## 📁 Project Structure

DevTrack follows a clean, layered package structure that separates security, business logic, persistence, analytics, and API concerns. This organization improves maintainability, scalability, readability, and testability while keeping related components modular.

---

### 📂 Source Structure

```text
src
└── main
    ├── java
    │   └── com
    │       └── aqsa
    │           └── devtrack
    │               ├── analytics
    │               ├── config
    │               ├── controller
    │               ├── dashboard
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

### 📦 Package Responsibilities

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

### 🏛️ Design Highlights

- Layered Package Architecture
- Separation of Concerns
- Feature-Oriented Modular Organization
- DTO-Based Request/Response Modeling
- Repository Pattern with Spring Data JPA
- JWT-Based Security Module
- Dynamic Querying using JPA Specifications
- Modular Analytics & Dashboard Components
- Centralized Exception Handling
- Production-Oriented Project Organization

---

## ⚙️ Tech Stack

DevTrack is built using modern Java backend technologies that emphasize security, scalability, maintainability, and production-ready REST API development.

---

### 🖥️ Programming Language

| Technology | Version |
| ---------- | ------- |
| Java       | 17      |

---

### 🚀 Backend Framework

| Technology  | Version                   |
| ----------- | ------------------------- |
| Spring Boot | 3.3.5                     |
| Spring MVC  | Included with Spring Boot |

---

### 🔐 Security

| Technology        | Purpose                        |
| ----------------- | ------------------------------ |
| Spring Security   | Authentication & Authorization |
| JWT (JJWT 0.11.5) | Stateless Authentication       |
| BCrypt            | Password Encryption            |

---

### 🗄️ Database & Persistence

| Technology      | Purpose                |
| --------------- | ---------------------- |
| PostgreSQL      | Relational Database    |
| Spring Data JPA | ORM & Repository Layer |
| Hibernate       | JPA Implementation     |

---

### ✅ Validation

| Technology              | Purpose                          |
| ----------------------- | -------------------------------- |
| Spring Boot Validation  | Request Validation               |
| Jakarta Bean Validation | DTO Validation using Annotations |

---

### 📄 API Documentation

| Technology        | Version  |
| ----------------- | -------- |
| Springdoc OpenAPI | 2.6.0    |
| Swagger UI        | Included |

---

### 🛠️ Build & Development Tools

| Technology | Purpose                                  |
| ---------- | ---------------------------------------- |
| Maven      | Dependency Management & Build Automation |
| Lombok     | Boilerplate Code Reduction               |

---

### ☁️ Deployment

| Technology | Purpose |
|------------|---------|
| Render | Cloud Hosting & Deployment Platform |

---

### 💻 Development Environment

| Technology | Purpose |
|------------|---------|
| IntelliJ IDEA | IDE |
| Git | Version Control |
| GitHub | Source Code Hosting |

---

### 🧪 API Testing

* Postman
* PowerShell (`Invoke-RestMethod`)
* cURL

---

## 🏗️ Backend Engineering Concepts

- RESTful API Development
- Layered Architecture
- DTO-Based API Design
- Spring Security
- Stateless JWT Authentication
- Ownership-Based Authorization
- Request Validation
- Global Exception Handling
- Spring Data JPA
- JPA Specifications
- Pagination
- Sorting
- Filtering
- Dynamic Search
- Analytics APIs
- Dashboard APIs
- OpenAPI Documentation
- Production-Oriented Backend Development

---

## 🗄️ Database Design

DevTrack uses **PostgreSQL** as its relational database and **Spring Data JPA with Hibernate** as the JPA implementation for object-relational mapping. The database schema is designed to maintain data integrity while supporting secure, user-specific activity management.

---

### 📐 Entity Relationship Diagram (ERD)

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

### 🔗 Entity Relationship

DevTrack follows a **One-to-Many** relationship between `User` and `Activity`.

* A **User** can own multiple activities.
* Every **Activity** belongs to exactly one user.
* Activities are isolated per user to enforce ownership-based authorization and secure data access.

---

### 👤 User Entity

| Field        | Type           | Constraints                 |
| ------------ | -------------- | --------------------------- |
| `id`         | Long           | Primary Key, Auto Generated |
| `name`       | String         | Not Null                    |
| `email`      | String         | Not Null, Unique            |
| `password`   | String         | Not Null (BCrypt Encrypted) |
| `role`       | String         | Not Null                    |
| `activities` | List<Activity> | One-to-Many Relationship    |

---

### 📚 Activity Entity

| Field             | Type          | Constraints                 |
| ----------------- | ------------- | --------------------------- |
| `id`              | Long          | Primary Key, Auto Generated |
| `title`           | String        | Not Null                    |
| `description`     | String        | Not Null                    |
| `durationMinutes` | Integer       | Positive Duration           |
| `createdAt`       | LocalDateTime | Automatically Initialized   |
| `user`            | User          | Many-to-One Relationship    |

---

### 🔑 Primary Keys

| Entity   | Primary Key |
| -------- | ----------- |
| User     | `id`        |
| Activity | `id`        |

---

### 🔗 Foreign Keys

| Table    | Foreign Key | References |
| -------- | ----------- | ---------- |
| Activity | `user_id`   | User(id)   |

---

### 🛡️ Data Integrity

The database design ensures:

* Unique email addresses for every registered user.
* Every activity is associated with exactly one user.
* Referential integrity through foreign key relationships.
* Secure ownership mapping between users and activities.
* Automatic primary key generation using the `IDENTITY` strategy.

---

## ⚡ ORM & Persistence Features

DevTrack leverages Spring Data JPA and Hibernate to provide:

- Automatic Object-Relational Mapping (ORM)
- Repository-Based Data Access using Spring Data JPA
- Lazy Loading for User–Activity Relationships
- Automatic SQL Generation through Hibernate
- Entity Lifecycle Management
- Simplified CRUD Operations
- Database Portability through the JPA Specification

---

## 🚀 Features

DevTrack has been developed incrementally through multiple phases, with each phase introducing new backend engineering concepts and production-oriented features.

---

### 🟢 Phase 1 — Core Backend Development

**Objective:** Build the foundational backend architecture and implement complete CRUD functionality for activity management.

#### Implemented Features

* RESTful API development using Spring Boot
* PostgreSQL database integration
* Activity entity design
* User entity design
* Layered architecture (Controller → Service → Repository)
* Spring Data JPA integration
* Hibernate ORM
* Complete CRUD operations for user activities

#### CRUD Operations

* Create Activity
* Retrieve Activity by ID
* Retrieve All Activities
* Update Activity
* Delete Activity

#### Key Concepts

* REST API Design
* Spring Boot Fundamentals
* JPA Entity Mapping
* Repository Pattern
* Service Layer Architecture
* PostgreSQL Integration

---

### 🟡 Phase 2 — Clean API Architecture

**Objective:** Improve API quality through validation, standardized responses, filtering capabilities, and maintainable request handling.

#### Implemented Features

* DTO-based API design
* Request & response separation
* Standardized API response wrapper
* Global exception handling
* Request validation
* Dynamic searching
* Filtering
* Pagination
* Sorting
* JPA Specifications for dynamic queries

#### Validation Rules

* Title cannot be empty
* Description cannot be empty
* Duration must be greater than zero

#### Key Concepts

* DTO Mapping
* Jakarta Bean Validation
* Global Exception Handling
* Dynamic Query Building
* Pagination & Sorting
* Flexible Search APIs

---

### 🔵 Phase 3 — Authentication & Authorization

**Objective:** Secure the application using industry-standard authentication and authorization mechanisms.

### Authentication Features

* JWT-based Authentication
* User Registration
* User Login
* Stateless Authentication
* JWT Token Generation
* JWT Token Validation
* Protected REST APIs

#### Authorization Features

* Ownership-Based Authorization
* User-Specific Activity Access
* Secure Route Protection
* Spring Security Integration
* Security Context Management

#### Security Features

* BCrypt Password Encryption
* Custom JWT Authentication Filter
* Database-backed Authentication
* Unauthorized Access Protection
* Custom Authorization Exceptions

#### Key Concepts

* Spring Security
* JWT Authentication
* Authentication Filters
* Authorization
* Password Hashing
* Secure REST API Development

---

### 🟣 Phase 4 — Analytics & API Documentation

**Objective:** Transform DevTrack from a CRUD application into a production-oriented backend by introducing analytics, dashboard APIs, API documentation, and cloud deployment.

#### Dashboard Module

* Personalized dashboard endpoint
* Aggregated user statistics
* Recent activity summary
* Dashboard data aggregation

#### Analytics Module

* Learning summary analytics
* Weekly analytics
* Monthly analytics
* Learning streak calculation
* Total active days tracking
* Longest learning streak
* Current learning streak
* Total learning time
* Average session duration
* Longest session analysis
* Shortest session analysis

#### Advanced Query Features

* Pagination
* Sorting
* Keyword Search
* Dynamic Filtering
* Custom aggregation queries

#### API Documentation

* Swagger UI Integration
* OpenAPI Specification
* Interactive API Testing
* Self-Documented REST Endpoints

#### Deployment

* Dockerized the application for production deployment
* Cloud deployment on Render
* Environment-based production configuration
* Public REST API hosting
* Online Swagger UI
* Public OpenAPI specification endpoint

#### Key Concepts

* Dashboard Design
* Data Aggregation
* Analytics APIs
* Custom Repository Queries
* Business Logic Aggregation
* DTO Composition
* OpenAPI Documentation
* Docker Containerization
* Cloud Deployment
* Production API Documentation

---

### 🚧 Phase 5 — Production Engineering *(In Progress)*

The application is already deployed and publicly accessible. The next phase focuses on improving scalability, observability, testing, automation, and overall production engineering.

#### Planned Features

- Docker Containerization
- CI/CD Pipeline
- Unit Testing
- Integration Testing
- Redis Caching
- Rate Limiting
- Logging & Monitoring
- Performance Optimization
- Production Security Enhancements

---

## 🔐 Authentication Flow

DevTrack uses **JWT (JSON Web Token)** based stateless authentication with **Spring Security** to secure REST APIs. Authenticated clients include a valid JWT in the `Authorization` header of every protected request, eliminating the need for server-side session management.

---

### 👤 User Registration Flow

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
Return Success Response
```

---

### 🔑 User Login Flow

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
Return JWT Authentication Response
```

---

### 🔒 Protected Request Flow

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
Extract JWT
      │
      ▼
Validate JWT
      │
      ▼
Load UserDetails
      │
      ▼
Populate Security Context
      │
      ▼
Controller
      │
      ▼
Service Layer
      │
      ▼
Repository
      │
      ▼
PostgreSQL
      │
      ▼
Standardized API Response
```

---

### 🔑 Authentication Components

| Component           | Responsibility                                                                       |
| ------------------- | ------------------------------------------------------------------------------------ |
| **Register API**    | Creates a new user account after validating the request and encrypting the password. |
| **Login API**       | Authenticates user credentials and generates a JWT token.                            |
| **JWT Token**       | Carries authenticated user identity and authorization information in a signed token.        |
| **JWT Filter**      | Validates incoming JWT tokens before processing protected requests.                  |
| **Spring Security** |  Manages authentication, authorization, and security filters for protected endpoints.                       |
| **BCrypt**          | Securely hashes user passwords before database storage.                              |

---

### 🔄 Authentication Lifecycle

1. User registers with name, email, and password.
2. Password is encrypted using BCrypt before being stored.
3. User logs in with valid credentials.
4. A signed JWT token is generated and returned.
5. The client securely stores the JWT token.
6. Every protected request includes the token in the `Authorization` header.
7. The JWT authentication filter validates the token and populates the Spring Security context before access is granted.
8. The authenticated user can access only their own resources.

---

### 🛡️ Security Benefits

* Stateless authentication using JWT
* Secure password hashing with BCrypt
* No server-side session management
* Protected REST endpoints
* Ownership-based resource access
* * Authentication and authorization managed by Spring Security
* Token validation on every protected request
* Secure and scalable authentication architecture
---

## 🔒 Security Architecture

DevTrack implements a **stateless security architecture** using **Spring Security** and **JWT (JSON Web Token)** authentication. Every protected request is authenticated through a custom JWT filter before reaching the application layer, ensuring that only authorized users can access secured resources.

---

### 🏛️ Security Workflow

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
Request Continues        Extract User Email
Without Authentication        │
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

### 🛡️ Security Components

| Component                   | Responsibility                                                                                                            |
| --------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| **SecurityConfig**          | Configures Spring Security, stateless authentication, public routes, protected routes, and JWT filter registration.       |
| **JwtAuthenticationFilter** | Intercepts incoming requests, validates JWT tokens, loads authenticated users, and populates the Spring Security context. |
| **JwtService**              | Generates JWT tokens, extracts user information, and validates token authenticity and expiration.                         |
| **BCryptPasswordEncoder**   | Encrypts user passwords before storing them in the database.                                                              |
| **AuthenticationManager**   | Authenticates user login credentials during the login process.                                                            |
| **SecurityContextHolder**   | Stores authentication details for the currently authenticated request.                                                    |

---

### 🔐 Endpoint Security

#### 🌐 Public Endpoints

The following endpoints are accessible without authentication:

* User Registration
* User Login
* Swagger UI (`/swagger-ui/**`)
* OpenAPI Documentation (`/v3/api-docs/**`)

---

#### 🔒 Protected Endpoints

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

#### 🔑 JWT Authentication Process

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

#### 🏗️ Authorization Strategy

DevTrack follows **ownership-based authorization** to ensure data isolation between users.

Authorization checks ensure that:

* Users can access only their own activities.
* Analytics are generated only from the authenticated user's data.
* Dashboard statistics are personalized for the authenticated user.
* Cross-user data access is prevented.
* Unauthorized requests return appropriate HTTP error responses.

---

#### 🛡️ Security Features

* JWT-Based Stateless Authentication
* Spring Security Integration
* BCrypt Password Hashing
* Ownership-Based Authorization
* Custom JWT Authentication Filter
* Protected REST Endpoints
* Secure Password Storage
* Authentication Context Management
* Global Security Configuration

---

#### ✅ Security Highlights

DevTrack follows modern REST API security practices by combining Spring Security with JWT authentication to eliminate server-side sessions while maintaining secure access control. Every authenticated request is validated before reaching the business layer, ensuring scalability, security, and proper user isolation.

---

## 📄 API Documentation

DevTrack provides comprehensive API documentation using **OpenAPI 3** and **Swagger UI**, enabling developers to explore, understand, and test REST endpoints through an interactive web interface.

The documentation is automatically generated from the application's controllers and remains synchronized with the API implementation.

---

### ✨ Documentation Features

* Interactive Swagger UI
* OpenAPI 3 Specification
* Automatic REST API Documentation
* JWT Bearer Authentication Support
* Endpoint Request & Response Visualization
* Built-in API Testing Interface
* Live Documentation Generation

---

### 🔐 JWT Authorization in Swagger

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
JWT Authorization Applied
       │
       ▼
Access Protected APIs
```

---

### 📚 Documented API Modules

| Module             | Description                                                                                      |
| ------------------ | ------------------------------------------------------------------------------------------------ |
| **Authentication** |User registration, login, and JWT authentication endpoints.                                                           |
| **Activities**     | CRUD operations, pagination, sorting, filtering, and dynamic search.                             |
| **Analytics**      | Learning statistics, Learning statistics, weekly analytics, monthly analytics, and learning streaks. |
| **Dashboard**      | Personalized dashboard containing summary statistics, streak information, and recent activities. |

---

### 🔍 OpenAPI Metadata

The generated API documentation includes:

* Project title
* API version
* Project description
* Contact information
* Security requirements
* Bearer Authentication scheme
* API endpoint definitions
* Interactive endpoint documentation

---

### 🚀 Swagger UI

Once the application is running, the interactive documentation is available at:

Local:
```text
http://localhost:8080/swagger-ui/index.html
```
Production:
```text
https://devtrack-xkzz.onrender.com/swagger-ui/index.html
```

The OpenAPI specification can be accessed at:

Local:
```text
http://localhost:8080/v3/api-docs
```
Production:
```text
https://devtrack-xkzz.onrender.com/v3/api-docs
```

---

## ✅ Benefits

- Simplifies API exploration and testing
- Reduces onboarding time for developers
- Documents request and response schemas
- Supports authenticated endpoint testing with JWT
- Demonstrates production-ready API documentation practices
- Automatically stays synchronized with the application codebase
---

## 🔌 API Endpoints

All endpoints (except authentication) require a valid JWT Bearer Token.

---

### 🔐 Authentication APIs

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| POST | `/api/auth/register` | Register a new user | ❌ No |
| POST | `/api/auth/login` | Authenticate user and receive JWT | ❌ No |

---

### 📝 Activity APIs

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

### 📊 Analytics APIs

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| GET | `/api/analytics/summary` | Overall learning statistics | ✅ Yes |
| GET | `/api/analytics/weekly` | Weekly activity analytics | ✅ Yes |
| GET | `/api/analytics/monthly` | Monthly activity analytics | ✅ Yes |
| GET | `/api/analytics/streak` | Learning streak statistics | ✅ Yes |

---

### 📈 Dashboard API

| Method | Endpoint | Description | Authentication |
| ------ | -------- | ----------- | -------------- |
| GET | `/api/dashboard` | Retrieve dashboard overview including summary, streak, and recent activities | ✅ Yes |

---

### 📖 Interactive API Documentation

Interactive API documentation is available through Swagger UI after starting the application.

---

## ▶️ Running Locally

### Prerequisites

Before running the project, ensure you have the following installed:

- Java 17 or later
- Maven 3.9+
- PostgreSQL 14+ (recommended)
- Git

---

### 1. Clone the Repository

```bash
git clone https://github.com/Aqsa30nz/devtrack.git
cd devtrack
```

---

### 2. Configure the Database

Configure your database connection in:

```text
src/main/resources/application.properties
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

### 3. Configure Environment Variables

Create a `.env` file in the project root (or configure the variables in your environment).

Example:

```env
JWT_SECRET=your_jwt_secret_key
```
---

### 4. Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

### 5. Access Swagger UI

Interactive API documentation is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI specification:

```text
http://localhost:8080/v3/api-docs
```

---

## 🧪 API Testing

The REST APIs were thoroughly tested throughout development using multiple tools.

### Tools Used

- Postman
- PowerShell (`Invoke-RestMethod`)
- cURL
- Swagger UI

---

### Testing Workflow

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
- Swagger/OpenAPI documentation
- Public deployment on Render

---

## 🚀 Future Roadmap

The following enhancements are planned for future releases of DevTrack.

### Phase 5 — Production Engineering

- Environment-based Configuration
- Docker Compose for Local Development
- Multi-stage Docker Builds
- GitHub Actions CI/CD Pipeline

### Phase 6 — Reliability & Performance

- Unit Testing using JUnit 5 and Mockito
- Integration Testing
- API Versioning
- Performance Optimization
- Logging & Monitoring

### Future Enhancements

Additional features and integrations will continue to be added as the project evolves.

---

## 📌 Project Status

| Phase | Features | Status |
| ------ | -------- | ------ |
| Phase 1 | CRUD Operations + PostgreSQL | ✅ Delivered |
| Phase 2 | DTO-Based API Design, Validation & Exception Handling | ✅ Delivered |
| Phase 3 | JWT Authentication & Authorization | ✅ Delivered |
| Phase 4 | Analytics, Dashboard, Pagination, Filtering, Swagger & Cloud Deployment | ✅ Delivered |
| Phase 5 | Production Engineering (Environment Configuration, Docker Improvements & CI/CD) | 🚧 In Progress |
| Phase 6 | Reliability, Testing & Performance | 📅 Planned |

---

## 🎯 Learning Outcomes

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

#### 🏗️ System Design & Architecture
- Scalable REST API Design
- Stateless Authentication Systems
- Multi-layer Architecture Design
- Secure Backend Design Patterns

---

## ⭐ Support the Project

If you found this project helpful, consider giving it a ⭐ on GitHub.

Feedback, suggestions, and contributions are always welcome!

---

## 👩‍💻 Author

### Aqsa Naaz
Aspiring Software Engineer passionate about Java backend development, Spring Boot, REST API design, and open source.

### Connect with me

- **GitHub:** [Aqsa30nz](https://github.com/Aqsa30nz)
- **LinkedIn:** [Aqsa Naaz](https://www.linkedin.com/in/Aqsa30nz)
- **Email:** [aqsa301naaz@gmail.com](mailto:aqsa301naaz@gmail.com)