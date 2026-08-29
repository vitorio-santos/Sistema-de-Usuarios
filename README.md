<!-- Badges -->
<h1 align="center">👤 API de Usuários</h1>
<p align="center">
  <b>REST API developed in Java with Spring Boot for user management using MongoDB.</b>
</p>
<p align="center">
  A project focused on practicing backend development, layered architecture, CRUD operations, and integration with a NoSQL database.
</p>
<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java%2025-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot%204.1.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img alt="MongoDB" src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white" />
  <img alt="Maven" src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img alt="Postman" src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" />
</p>
---
<details open>

<summary><strong>

📑 Table of Contents</strong></summary>

🚀 Features

🛠️ Technologies

🏗️ Project Architecture

🔌 Endpoints

📦 Data Structure

🗄️ MongoDB Configuration

▶️ How to Run

🧪 Testing the API

🎯 Project Goal

🔮 Possible Improvements

👨‍💻 Author

</details>
---

<h2 id="funcionalidades">🚀 Features</h2>

The API provides the main operations for user management:

➕ Register a new user;

📋 List all registered users;

✏️ Update a user's information;

🗑️ Delete a user by ID.

The data is stored in the usuario collection in MongoDB.

---

<h2 id="tecnologias">🛠️ Technologies</h2>

![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) 

Java: Main programming language of the application

![spring](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)

Spring Boot: API creation and configuration

![spring](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)

Spring Web MVC: HTTP endpoint development

![mongo](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

Spring Data MongoDB: Persistence and MongoDB integration

![mongo](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

MongoDB: NoSQL database

![maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Apache Maven: Dependency management and build automation

![postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

Postman: HTTP request testing

<p align="center">

</p>
---
<h2 id="arquitetura">🏗️ Project Architecture</h2>

The project follows an organization based on separation of responsibilities, dividing the application into control, business logic, and persistence layers.
```text

api-usuario
└── src
    └── main
        ├── java
        │   └── com.VitorioSantos.api_usuario
        │       ├── business
        │       │   └── UsuarioService.java
        │       │
        │       ├── controller
        │       │   └── UsuarioController.java
        │       │
        │       ├── infrastructure
        │       │   ├── entities
        │       │   │   └── Usuario.java
        │       │   │
        │       │   └── repository
        │       │       └── UsuarioRepository.java
        │       │
        │       └── ApiUsuarioApplication.java
        │
        └── resources
            └── application.properties
```
🎮 Controller

The UsuarioController receives HTTP requests and exposes the API endpoints through the base route /usuarios.

The implemented operations use the following HTTP methods:

`POST` • `GET` • `PUT` • `DELETE`

🧠 Business

The UsuarioService class contains the business logic and acts as an intermediary between the controller and the repository.

Its responsibilities include:

Saving users;

Retrieving users;

Updating records;

Deleting users.

📄 Entity

The Usuario class represents the document persisted in MongoDB.

The entity uses:

```java
@Document(collection = "usuario")
```
And contains the following fields:

`id`
`nome`
`email`

🗃️ Repository

The UsuarioRepository extends:

MongoRepository<Usuario, String>

This way, the application uses the persistence operations provided by Spring Data MongoDB.

<h2 id="endpoints">🔌 Endpoints</h2>

The API base route is:

```text
/usuarios
```
Method	Endpoint	Description

<kbd>POST</kbd>	`/usuarios`	Registers a new user

<kbd>GET</kbd>	`/usuarios`	List all users

<kbd>PUT</kbd>	`/usuarios`	Updates a user

<kbd>DELETE</kbd>	`/usuarios?id={id}`	Deletes a user by ID

**➕ POST `/usuarios`**

Example request body:

```json
{
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```
**📋 Operation Flow**

```text
POST /usuarios
      ↓
Criação do usuário

GET /usuarios
      ↓
Consulta dos usuários

PUT /usuarios
      ↓
Atualização do usuário

DELETE /usuarios?id={id}
      ↓
Exclusão do usuário
```
---

<h2 id="estrutura-de-dados">📦 Data structure</h2>

Each user stored by the API has the following conceptual structure:

```json

{
  "id": "identificador-do-usuario",
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```
---

<h2 id="mongodb">🗄️ MongoDB ConfigurationB</h2>

The application is configured to use a local MongoDB instance:

```text

mongodb://localhost:27017/local
```
The application configuration is located at:

```text

src/main/resources/application.properties
```
The configured application name is:

```text

api-usuario

```
> ⚠️ Make sure MongoDB is running before starting the API.

---

<h2 id="como-executar">▶️ How to run</h2>

📋 Prerequisites
---

Before running the project, make sure you have installed:

☕ Java 25;

🍃 MongoDB;

📦 Maven or Maven Wrapper;

🧪 Postman or another API testing tool;

🧰 Git.

1️⃣ Clone the repository

```bash

git clone https://github.com/vitorio-santos/Projeto-API.git
```

2️⃣ Access the project directory

```bash

cd Projeto-API/api-usuario
```

3️⃣ Start MongoDB

Make sure the MongoDB service is running locally and available for connection.

4️⃣ Run the application

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/macOS:
```bash
./mvnw spring-boot:run
```
---

<h2 id="testing-the-api">🧪 Testing the API</h2>

Requests can be made using Postman or any compatible HTTP client.

A simple testing sequence is:

**➕ Create a user using `POST /usuarios`;**

**📋 Retrieve users using `GET /usuarios`;**

**✏️ Update data using `PUT /usuarios`;**

**🗑️ Delete a record using `DELETE /usuarios?id={id}`.**

<h2 id="project-goal">🎯 Project goal</h2>

This project was developed with a focus on practice and growth in backend development, applying concepts such as:

**APIs REST;**

**Java;**

**Spring Boot;**

**Spring Web MVC;**

**Spring Data MongoDB;**

**NoSQL databases;**

**CRUD operations;**

**Separation of responsibilities;**

**Layered architecture;**

**Integration between application and database.**

<h2 id="improvements">🔮 Possible Improvements</h2>

As future improvements, the following features may be implemented:

.Input data validation;

.Global exception handling;

.DTOs for requests and responses;

.Documentation with Swagger/OpenAPI;

.Unit and integration tests;

.Pagination and filters;

.Email validation;

.User duplication control;

.Authentication and authorization;

.MongoDB configuration through environment variables.

<h2 id="autor">👨‍💻 Author</h2>
<p align="center">
  <strong>Vitório Santos</strong>
</p>
<p align="center">
  Project developed for practice and growth in <strong>backend development with Java, Spring Boot, and MongoDB</strong>.
</p>
<p align="center">
  <i>Keep building. One project at a time. 🚀</i>
</p>
