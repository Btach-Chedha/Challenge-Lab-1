# Challenge Lab 1: Microservice Web Application with Spring Boot, PostgreSQL, and Redis

## Objective
Build a complete microservice-based web application using:
- **Spring Boot** (Backend)
- **PostgreSQL** (Database)
- **Redis** (Caching)

Additional requirements:
- API documentation with **Swagger**
- Automated tests (Unit, Integration, E2E)
- Project management using **Scrum practices in Jira**

## Project Structure
The project is divided into 3 main epics, each containing user stories and tasks:

### EPIC-1: Core Microservice
- Build backend Spring Boot application with PostgreSQL
- Implement CRUD operations for Books API
- Add Swagger documentation

### EPIC-2: Frontend Integration & Backend Containerization
- Create simple HTML5/CSS3 frontend
- Configure CORS
- Dockerize both frontend and backend

### EPIC-3: Infrastructure & Quality
- Implement Redis caching
- Write unit and integration tests
- Add Cypress E2E testing

## Sprint Planning
The project is developed across 3 sprints (1 week each):

### Sprint 1: Core Microservice
- Implement Books API
- Connect PostgreSQL
- Add Swagger docs

### Sprint 2: Frontend & Containerization
- Build frontend page
- Configure CORS
- Create Dockerfiles

### Sprint 3: Caching + Testing
- Add Redis caching
- Implement unit/integration tests
- Add Cypress E2E tests

## Branches
The project follows version-based development with Git branches:

1. `version1`: Project initialization with H2 database
2. `version2`: Service layer and ResponseEntity
3. `version3`: Swagger and PostgreSQL
4. `version4`: Redis caching
5. `version5`: Unit and integration tests
6. `version6`: Frontend web page
7. `version7`: Cypress E2E testing

## Technologies Used
- **Backend**: Spring Boot 3.x
- **Database**: PostgreSQL
- **Caching**: Redis
- **API Docs**: Springdoc OpenAPI (Swagger)
- **Testing**: JUnit, Mockito, Cypress
- **Frontend**: HTML5, CSS3, JavaScript
- **Containerization**: Docker
- **Project Management**: Jira

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+
- PostgreSQL 14+
- Redis 7+
- Node.js 16+ (for Cypress tests)
- Docker (optional)

### Installation
1. Clone the repository:
   ```bash
   git clone --branch version7 https://github.com/yourusername/challenge-lab-1.git
   
