# 🚀 Unified Xebia Enterprise LMS Portal

A full stack **Enterprise Learning Management System (LMS)** that brings **course management, assessments, grading, events, learning materials, and certification** into one unified platform.

The project integrates three functional areas into a single application:

* 📚 **Learning & Course Management**
* 📝 **Assessment & Evaluation**
* 📅 **Event Management**

The platform provides **role based access** for Enterprise Administrators, Teachers, and Learners through a shared authentication system, unified dashboard, common navigation, and centralized backend services.

---

## ✨ Key Features

### 🔐 Authentication & Role Based Access

* Secure authentication with session based access
* Role based navigation and permissions
* Separate workspaces for:

  * 👨‍💼 Enterprise Admin
  * 👨‍🏫 Teacher / Instructor
  * 👨‍🎓 Learner
* Protected application routes
* Shared authentication across LMS modules

### 📚 Course Management

* Create and manage courses
* Course enrollment
* Course details and learning content
* Learning material management
* Material upload, download, and preview
* Learner focused course dashboard

### 📝 Assessment & Evaluation

* Create and manage assessments
* Question and assessment management
* Learner submissions
* Teacher evaluation
* Automated / structured grading workflows
* Assessment history and results
* Score tracking

### 📅 Event Management

* Create and manage organizational events
* Event registration
* Upcoming event listings
* Event details and schedules
* Registration tracking

### 🏆 Certification

* Course and assessment completion tracking
* Certificate generation / management
* Learner certification records

### 🎨 Modern Responsive UI

* Responsive dashboard design
* Role specific sidebar navigation
* Reusable UI components
* Modern Tailwind CSS styling
* Desktop and mobile friendly layouts
* Consistent design across all modules

---

# 🏗️ System Architecture

```text
                         ┌─────────────────────────┐
                         │       Web Browser       │
                         │   Next.js / React UI    │
                         └────────────┬────────────┘
                                      │
                                      │ REST API
                                      ▼
                         ┌─────────────────────────┐
                         │     Spring Boot API     │
                         │       Java Backend      │
                         └────────────┬────────────┘
                                      │
                    ┌─────────────────┴─────────────────┐
                    │                                   │
                    ▼                                   ▼
          ┌───────────────────┐              ┌───────────────────┐
          │      MongoDB      │              │      H2 / JPA     │
          │ Document Storage  │              │ Relational Data   │
          └───────────────────┘              └───────────────────┘
```

### Application Flow

```text
User
 │
 ▼
Authentication
 │
 ▼
Role Identification
 │
 ├───────────────┬────────────────┐
 ▼               ▼                ▼
Admin           Teacher          Learner
 │               │                │
 ▼               ▼                ▼
Management      Teaching         Learning
 │               │                │
 └───────────────┴────────────────┘
                 │
                 ▼
          Spring Boot REST API
                 │
                 ▼
          Database Layer
```

---

# 📂 Project Structure

```text
LMS/
│
├── .github/
│   └── workflows/                 # CI/CD workflows
│
├── Assessment-Portal/             # Legacy / reference module
│
├── Xebia-LMS/                     # Main integrated application
│   │
│   ├── backend/
│   │   ├── pom.xml                # Maven dependencies
│   │   └── src/
│   │       └── main/
│   │           ├── java/
│   │           │   ├── controllers/
│   │           │   ├── services/
│   │           │   ├── models/
│   │           │   ├── repositories/
│   │           │   ├── dto/
│   │           │   └── config/
│   │           │
│   │           └── resources/
│   │               └── application.properties
│   │
│   ├── public/
│   │   └── assets/                # Static assets
│   │
│   ├── src/
│   │   ├── app/                   # Next.js App Router
│   │   │   ├── assessments/
│   │   │   ├── courses/
│   │   │   ├── events/
│   │   │   ├── dashboard/
│   │   │   └── ...
│   │   │
│   │   ├── components/
│   │   │   ├── common/
│   │   │   ├── dashboard/
│   │   │   ├── assessments/
│   │   │   ├── courses/
│   │   │   └── events/
│   │   │
│   │   ├── lib/
│   │   │   ├── api/
│   │   │   └── context/
│   │   │
│   │   └── types/
│   │
│   ├── package.json
│   ├── next.config.mjs
│   ├── tsconfig.json
│   └── ...
│
├── .gitignore
└── README.md
```

---

# 🛠️ Technology Stack

| Layer            | Technology       |
| ---------------- | ---------------- |
| Frontend         | Next.js 16.2     |
| UI Framework     | React            |
| Language         | TypeScript       |
| Styling          | Tailwind CSS     |
| Backend          | Spring Boot 3    |
| Backend Language | Java             |
| Build Tool       | Maven            |
| API              | REST             |
| Database         | MongoDB          |
| Relational Layer | JPA / H2         |
| Authentication   | NextAuth         |
| Version Control  | Git & GitHub     |
| Deployment       | Vercel / Railway |
| Development      | VS Code          |

---

# 🔌 Backend API

The backend follows a RESTful architecture and exposes APIs for the major application modules.

### Authentication

```text
/api/auth
```

Handles authentication and user related operations.

### Assessments

```text
/api/assessments
```

Provides assessment creation, retrieval, management, and evaluation functionality.

### Submissions

```text
/api/submissions
```

Handles learner assessment submissions and evaluation data.

### Events

```text
/api/events
```

Provides event creation, retrieval, registration, and management operations.

### Materials

```text
/api/materials
```

Handles course learning materials and associated resources.

---

# 👥 User Roles

## 👨‍💼 Enterprise Administrator

Administrators can:

* Manage users
* Manage courses
* Manage teachers and learners
* Create and manage events
* Manage assessments
* Monitor platform activity
* Manage organizational learning resources

## 👨‍🏫 Teacher / Instructor

Teachers can:

* Manage assigned courses
* Create assessments
* Manage questions
* Review learner submissions
* Evaluate assessments
* Track learner performance
* Manage course materials

## 👨‍🎓 Learner

Learners can:

* Browse available courses
* Enroll in courses
* Access learning materials
* Attend / register for events
* Take assessments
* Submit answers
* View scores and results
* Track learning progress
* Access certificates

---

# 🔑 Demo Credentials

For local development and demonstration:

| Role             | Username / Email     | Password     |
| ---------------- | -------------------- | ------------ |
| Enterprise Admin | `admin@xebia.com`    | `admin123`   |
| Learner          | `learner@xebia.com`  | `learner123` |
| Teacher          | Create through Admin | Configurable |

> ⚠️ These credentials are intended only for local/demo environments. Do not use default credentials in production.

---

# ⚙️ Local Development Setup

## Prerequisites

Make sure the following are installed:

* **Java JDK 17+**
* **Node.js 18+**
* **npm**
* **MongoDB** or MongoDB Atlas
* **Git**

Verify the installations:

```bash
java -version
node -v
npm -v
git --version
```

---

# 🚀 Running the Backend

### 1. Navigate to the backend

```bash
cd Xebia-LMS/backend
```

### 2. Configure MongoDB

Open:

```text
src/main/resources/application.properties
```

Configure your MongoDB connection:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/employeeDB
```

For MongoDB Atlas, use your Atlas connection string instead.

### 3. Start Spring Boot

Windows:

```bash
.\mvnw.cmd spring-boot:run
```

Or, if Maven is installed globally:

```bash
mvn spring-boot:run
```

The backend will start on the configured Spring Boot port.

---

# 💻 Running the Frontend

Open a new terminal.

### 1. Navigate to the frontend

```bash
cd Xebia-LMS
```

### 2. Install dependencies

```bash
npm install
```

### 3. Start the development server

```bash
npm run dev
```

Open:

```text
http://localhost:3000
```

---

# 🧪 Production Build Verification

Before deployment, verify that both applications build successfully.

## Frontend

```bash
cd Xebia-LMS
npm run build
```

Start the production build:

```bash
npm start
```

## Backend

```bash
cd Xebia-LMS/backend
.\mvnw.cmd clean package -DskipTests
```

The generated JAR will be available inside:

```text
backend/target/
```

---

# 🔄 Development Workflow

```text
1. Create / modify feature
        ↓
2. Implement frontend UI
        ↓
3. Connect REST API
        ↓
4. Implement / update backend service
        ↓
5. Connect database
        ↓
6. Test API using Postman
        ↓
7. Test complete user workflow
        ↓
8. Run production builds
        ↓
9. Commit changes
        ↓
10. Push to GitHub
```

---

# 🧪 API Testing

REST APIs can be tested using tools such as **Postman**.

Typical testing workflow:

```text
Frontend Request
      ↓
Spring Boot Controller
      ↓
Service Layer
      ↓
Repository
      ↓
MongoDB / H2
      ↓
Response
      ↓
Frontend
```

API testing should cover:

* Authentication
* Course operations
* Assessment operations
* Submission workflows
* Event registration
* Learning materials
* Role based access
* Error handling

---

# 🔐 Security Considerations

The application is designed with role based access and protected application workflows.

Recommended production practices include:

* Store secrets in environment variables
* Never commit database credentials
* Never commit API keys
* Replace demo passwords before deployment
* Configure secure authentication secrets
* Enable HTTPS
* Configure CORS appropriately
* Validate and sanitize API input
* Apply authorization at backend endpoints
* Use production MongoDB credentials with restricted permissions

Example:

```env
MONGODB_URI=your_mongodb_connection_string
AUTH_SECRET=your_secure_secret
```

> `.env` files containing secrets should be excluded through `.gitignore`.

---

# 🌐 Deployment Architecture

A possible production deployment structure is:

```text
                    GitHub Repository
                           │
             ┌─────────────┴─────────────┐
             │                           │
             ▼                           ▼
       Vercel                        Railway
       Frontend                      Backend
       Next.js                      Spring Boot
             │                           │
             └─────────────┬─────────────┘
                           │
                           ▼
                    MongoDB Atlas
```

### Frontend

The Next.js application can be deployed using platforms such as Vercel.

### Backend

The Spring Boot API can be deployed using Railway or another Java compatible hosting platform.

### Database

MongoDB Atlas can provide the production database layer.

---

# 📊 Major Modules

| Module          | Description                                |
| --------------- | ------------------------------------------ |
| Authentication  | Login, sessions and role based access      |
| Dashboard       | Role specific application workspace        |
| Courses         | Course creation, enrollment and management |
| Materials       | Learning resource management               |
| Assessments     | Tests, questions and evaluation            |
| Submissions     | Learner submission and grading             |
| Events          | Event creation and registration            |
| Certificates    | Completion and certification               |
| User Management | User and role administration               |

---

# 🎯 Project Objectives

The Unified Xebia Enterprise LMS Portal was developed to provide:

* A centralized corporate learning platform
* Unified authentication across modules
* Role based application workflows
* Digital course management
* Structured assessment and evaluation
* Event management
* Learning material distribution
* Learner progress tracking
* Certification management
* Scalable REST based backend architecture

---

# 🔮 Future Enhancements

Potential future improvements include:

* 📈 Advanced analytics dashboard
* 🤖 AI assisted assessment evaluation
* 💬 AI learning assistant
* 🔔 Real time notifications
* 📱 Progressive Web App support
* 📊 Advanced learner performance analytics
* 🏆 Gamification and achievement badges
* 📄 Automated certificate generation
* 🔍 Advanced course search and filtering
* ☁️ Cloud optimized deployment
* 🔐 OAuth / enterprise SSO integration
* 📦 Docker based deployment
* ⚡ Redis caching
* 🧪 Automated unit and integration testing

---

# 📌 Project Status

**Status:** Active Development

The repository contains the integrated LMS application combining learning, assessment, and event management capabilities into a unified full stack platform.

---

# 👨‍💻 Development

This project demonstrates full stack application development involving:

```text
Frontend Development
        +
REST API Development
        +
Database Integration
        +
Authentication
        +
Role Based Access
        +
API Testing
        +
Deployment
```

---

# 📜 License

This project is intended for **educational, internship, and demonstration purposes** unless otherwise specified by the project owner or organization.

---

## ⭐ Acknowledgements

Developed as part of the **Xebia internship / academic project work**, combining enterprise learning workflows with modern full stack web technologies.

---
