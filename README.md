<!-- Badges -->
<h1 align="center">👤 API de Usuários</h1>
<p align="center">
  <b>API REST desenvolvida em Java com Spring Boot para gerenciamento de usuários utilizando MongoDB.</b>
</p>
<p align="center">
  Projeto voltado para prática de desenvolvimento backend, arquitetura em camadas, operações CRUD e integração com banco de dados NoSQL.
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

📑 Índice</strong></summary>

🚀 Funcionalidades

🛠️ Tecnologias

🏗️ Arquitetura do Projeto

🔌 Endpoints

📦 Estrutura de Dados

🗄️ Configuração do MongoDB

▶️ Como Executar

🧪 Testando a API

🎯 Objetivo do Projeto

🔮 Possíveis Melhorias

👨‍💻 Autor

</details>
---

<h2 id="funcionalidades">🚀 Funcionalidades</h2>

A API disponibiliza as principais operações para gerenciamento de usuários:

➕ Cadastrar um novo usuário;

📋 Listar todos os usuários cadastrados;

✏️ Atualizar informações de um usuário;

🗑️ Excluir um usuário através do ID.

Os dados são armazenados na coleção 'usuario' do MongoDB.

---

<h2 id="tecnologias">🛠️ Tecnologias</h2>

![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) 

Java: Linguagem principal da aplicação

![spring](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)

Spring Boot	Criação e configuração da API

![spring](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)

Spring Web MVC:	Construção dos endpoints HTTP

![mongo](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

Spring Data MongoDB: Persistência e integração com MongoDB

![mongo](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

MongoDB: Banco de dados NoSQL

![maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Apache Maven: Gerenciamento de dependências e build

![postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

Postman: Testes das requisições HTTP

<p align="center">

</p>
---
<h2 id="arquitetura">🏗️ Arquitetura do Projeto</h2>

O projeto segue uma organização baseada em separação de responsabilidades, dividindo a aplicação entre camadas de controle, regras de negócio e persistência.
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

O `UsuarioController` recebe as requisições HTTP e disponibiliza os endpoints da API através da rota base `/usuarios`.

As operações implementadas utilizam os métodos HTTP:

`POST` • `GET` • `PUT` • `DELETE`

🧠 Business

A classe `UsuarioService` concentra a lógica de negócio e atua como intermediária entre o controller e o repositório.

Entre suas responsabilidades estão:

1. Salvar usuários;

2. Buscar usuários;

3. Atualizar registros;

Excluir usuários.

📄 Entity

A classe `Usuario` representa o documento persistido no MongoDB.

A entidade utiliza:

```java
@Document(collection = "usuario")
```
E possui os campos:
`id`
`nome`
`email`

🗃️ Repository

O `UsuarioRepository` estende:

```java

MongoRepository<Usuario, String>

```
Dessa forma, a aplicação utiliza as operações de persistência disponibilizadas pelo Spring Data MongoDB.

<h2 id="endpoints">🔌 Endpoints</h2>

A rota base da API é:

```text
/usuarios
```
Método	Endpoint	Descrição

<kbd>POST</kbd>	`/usuarios`	Cadastra um novo usuário

<kbd>GET</kbd>	`/usuarios`	Lista todos os usuários

<kbd>PUT</kbd>	`/usuarios`	Atualiza um usuário

<kbd>DELETE</kbd>	`/usuarios?id={id}`	Exclui um usuário pelo ID

➕ POST `/usuarios`

Exemplo de corpo da requisição:

```json
{
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```
📋 Fluxo das operações

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

<h2 id="estrutura-de-dados">📦 Estrutura de Dados</h2>

Cada usuário armazenado pela API possui a seguinte estrutura conceitual:

```json

{
  "id": "identificador-do-usuario",
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```
---

<h2 id="mongodb">🗄️ Configuração do MongoDB</h2>

A aplicação está configurada para utilizar uma instância local do MongoDB:

```text

mongodb://localhost:27017/local
```
A configuração da aplicação está localizada em:

```text

src/main/resources/application.properties
```
O nome configurado para a aplicação é:

```text

api-usuario

```
> ⚠️ Certifique-se de que o MongoDB esteja em execução antes de iniciar a API.

---

<h2 id="como-executar">▶️ Como Executar</h2>

📋 Pré-requisitos
---

Antes de executar o projeto, tenha instalado:

☕ Java 25;

🍃 MongoDB;

📦 Maven ou Maven Wrapper;

🧪 Postman ou outra ferramenta para testar APIs;

🧰 Git.

1️⃣ Clone o repositório

```bash

git clone https://github.com/vitorio-santos/Projeto-API.git
```

2️⃣ Acesse o diretório do projeto

```bash

cd Projeto-API/api-usuario
```

3️⃣ Inicie o MongoDB

Verifique se o serviço do MongoDB está sendo executado localmente e disponível para conexão.

4️⃣ Execute a aplicação

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/macOS:
```bash
./mvnw spring-boot:run
```
---

<h2 id="testando-a-api">🧪 Testando a API</h2>

As requisições podem ser realizadas utilizando o Postman ou qualquer cliente HTTP compatível.

Uma sequência simples de testes é:

**➕ Criar um usuário utilizando `POST /usuarios`;**

**📋 Consultar os usuários utilizando `GET /usuarios`;**

**✏️ Atualizar os dados utilizando `PUT /usuarios`;**

**🗑️ Excluir um registro utilizando `DELETE /usuarios?id={id}`.**

<h2 id="objetivo">🎯 Objetivo do Projeto</h2>

Este projeto foi desenvolvido com foco em prática e evolução no desenvolvimento backend, aplicando conceitos como:

**APIs REST;**

**Java;**

**Spring Boot;**

**Spring Web MVC;**

**Spring Data MongoDB;**

**Banco de dados NoSQL;**

**Operações CRUD;**

**Separação de responsabilidades;**

**Arquitetura em camadas**

**Integração entre aplicação e banco de dados.**

<h2 id="melhorias">🔮 Possíveis Melhorias</h2>

Como evolução futura, podem ser implementados:

**[ ] Validação dos dados de entrada;**

**[ ] Tratamento global de exceções;**

**[ ] DTOs para requisições e respostas;**

**[ ] Documentação com Swagger/OpenAPI;**

**[ ] Testes unitários e de integração;**

**[ ] Paginação e filtros;**

**[ ] Validação de e-mail;**

**[ ] Controle de duplicidade de usuários;**

**[ ] Autenticação e autorização;**

**[ ] Configuração do MongoDB através de variáveis de ambiente.**


<h2 id="autor">👨‍💻 Autor</h2>
<p align="center">
  <strong>Vitório Santos</strong>
</p>
<p align="center">
  Projeto desenvolvido para prática e evolução em <strong>desenvolvimento backend com Java, Spring Boot e MongoDB</strong>.
</p>
<p align="center">
  <i>Continue construindo. Um projeto de cada vez. 🚀</i>
</p>
