# 🚀 DevTrack — Activity Tracking Backend System

A scalable backend system built using **Spring Boot + PostgreSQL** to track user activities with full CRUD functionality.

Designed using clean layered architecture and prepared for future expansion into authentication, analytics, and production deployment.

---

# 🧠 Project Overview

DevTrack is a backend system that allows users to:

- Create activities
- Track learning/working sessions
- Update progress
- Maintain structured activity history

Built using real-world backend engineering principles:

- Layered architecture
- Separation of concerns
- RESTful API design
- Spring Data JPA with PostgreSQL

---

# 🏗️ Architecture
```text
Controller → Service → Repository → Database
Controller → Handles HTTP requests
Service → Business logic
Repository → Database operations
PostgreSQL → Persistent storage
```
---

## ⚙️ Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

---

## ✨ Features

### 🟢 Phase 1 — Completed

- REST APIs using Spring Boot
- PostgreSQL integration
- Activity entity design
- Full CRUD operations:
    - Create Activity
    - Read all Activities
    - Read by ID
    - Update Activity
    - Delete Activity
- Layered backend architecture
- End-to-end API testing via PowerShell

### 🟡 Phase 2 — In Progress

- DTO layer (clean API design)
- Input validation
- Global exception handling

### 🔵 Phase 3 — Planned

- JWT Authentication
- User system
- Role-based access control

### 🔴 Phase 4 — Advanced

- Analytics (streaks, stats)
- Dashboard APIs
- Swagger documentation
- Deployment

---

## 🔌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | `/api/activities`        | Create a new activity |
| GET    | `/api/activities`        | Retrieve all activities |
| GET    | `/api/activities/{id}`    | Retrieve activity by ID |
| PUT    | `/api/activities/{id}`    | Update an existing activity |
| DELETE | `/api/activities/{id}`    | Delete an activity |

---

## ▶️ How to Run

1. Clone Repo

```git clone https://github.com/Aqsa30nz/devtrack.git```

2. Setup Database

spring.datasource.url=jdbc:postgresql://localhost:5432/devtrack

spring.datasource.username=your_username

spring.datasource.password=your_password

3. Run App

```mvn spring-boot:run```

---

## 🧪 Testing

Use:

- PowerShell → Invoke-RestMethod
- Postman
- CURL

#### Example:

####  1. API request/response 

POST /api/activities
```
Request:
{
"title": "DSA Practice",
"description": "Solved arrays problems",
"status": "IN_PROGRESS"
}
```
Response:
````
{
"id": 1,
"title": "DSA Practice",
"status": "IN_PROGRESS",
"createdAt": "2026-06-19"
}
````
#### 2. Error handling format (VERY IMPORTANT)
````
{
"timestamp": "2026-06-19T10:00:00",
"status": 404,
"error": "Activity not found",
"message": "No activity exists with id 5"
}
````
---

## 📌 Project Status

#### ✅ Phase 1 Completed

#### 🚧 Phase 2 In Progress

#### 🚧 Phase 3 Planned

#### 🚧 Phase 4 Planned

---

## 🎯 Goal

Built for:
- Software Engineering Internships (2026–2027)
- Backend Development roles
- System design practice

---

## 👨‍💻 Author

#### Aqsa Naaz
Java Backend Developer (Spring Boot)

---