# 🚀 REST API with Spring Boot
This project illustrates the implementation of a **REST API** with **Spring Boot**, allowing the processing of requests sent from a frontend server (built with **Angular, React, Vue.js**).
## 🛠 Prerequisites
- **IDE**: IntelliJ IDEA
- **Backend**: Java 17+, Spring Boot, Maven
- **Database**: MySQL or PostgreSQL
- **Frontend**: Compatible with Angular, React, Vue.js, etc.

## ⚙️ Installation and Execution

### 1️⃣ Clone the project
```sh

git clone https://github.com/AlbertKamsuTchouankam/project-Backend.git
cd project-Backend
```
### 2️⃣  Configure the database
Modify the file   src/main/resources/application.properties :

```properties

spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=root
spring.datasource.password=secret
```

###  ️⃣ Run the application

```sh

mvn clean install
mvn spring-boot:run
```
### 🌍  API Access
The API is accessible at:
🔗 http://localhost:8080/api

You can add this file directly to your project as README.md. 🚀🔥
Let me know if you need any changes! 😊
