# 👤 API de Usuários

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de usuários utilizando **MongoDB** como banco de dados NoSQL.

O projeto foi desenvolvido como base para criação e estudo de APIs, aplicando conceitos de desenvolvimento backend, arquitetura em camadas, operações CRUD e integração com banco de dados.

## 🚀 Funcionalidades

A API permite realizar as principais operações de gerenciamento de usuários:

* ➕ Cadastrar usuário;
* 📋 Listar usuários;
* ✏️ Atualizar usuário;
* 🗑️ Excluir usuário por ID.

Cada usuário possui:

* `id`
* `nome`
* `email`

Os dados são armazenados na coleção `usuario` do MongoDB.

## 🛠️ Tecnologias utilizadas

* **Java 25**
* **Spring Boot 4.1.0**
* **Spring Web MVC**
* **Spring Data MongoDB**
* **MongoDB**
* **Maven**
* **Postman** para testes das requisições

As dependências do projeto estão configuradas no `pom.xml`.

## 🏗️ Arquitetura

O projeto utiliza uma estrutura organizada por responsabilidades:

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

### Controller

O `UsuarioController` é responsável por receber as requisições HTTP e disponibilizar os endpoints da API através da rota `/usuarios`.

Ele implementa as operações `POST`, `GET`, `PUT` e `DELETE`.

### Business

A classe `UsuarioService` concentra a lógica de negócio e faz a comunicação com o repositório.

Ela possui métodos para salvar, buscar, atualizar e excluir usuários.

### Entity

A classe `Usuario` representa o documento armazenado no MongoDB.

Ela utiliza `@Document(collection = "usuario")` e possui os campos `id`, `nome` e `email`.

### Repository

O `UsuarioRepository` estende `MongoRepository<Usuario, String>`, permitindo utilizar as operações de persistência disponibilizadas pelo Spring Data MongoDB.

## 🔌 Endpoints

A API utiliza a rota base:

```text
/usuarios
```

| Método   | Endpoint            | Descrição                |
| -------- | ------------------- | ------------------------ |
| `POST`   | `/usuarios`         | Cadastra um novo usuário |
| `GET`    | `/usuarios`         | Lista todos os usuários  |
| `PUT`    | `/usuarios`         | Atualiza um usuário      |
| `DELETE` | `/usuarios?id={id}` | Exclui um usuário        |

Essas rotas correspondem aos métodos implementados no `UsuarioController`.

## 📦 Exemplo de usuário

Para cadastrar um usuário através do `POST /usuarios`:

```json
{
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```

## 🗄️ MongoDB

A aplicação está configurada para utilizar um MongoDB local:

```text
mongodb://localhost:27017/local
```

A configuração está localizada em:

```text
src/main/resources/application.properties
```

O nome da aplicação configurado é `api-usuario`.

## ▶️ Como executar

### Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

* Java 25;
* MongoDB;
* Maven ou utilizar o Maven Wrapper;
* Postman ou outra ferramenta para testar APIs.

### 1. Clone o repositório

```bash
git clone https://github.com/vitorio-santos/Projeto-API.git
```

### 2. Acesse o projeto

```bash
cd Projeto-API/api-usuario
```

### 3. Execute a aplicação

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux/macOS:

```bash
./mvnw spring-boot:run
```

Certifique-se de que o **MongoDB esteja em execução** antes de iniciar a aplicação.

## 🧪 Testando a API

As requisições podem ser realizadas utilizando o **Postman**.

Exemplo de fluxo:

```text
POST   /usuarios
   ↓
Criação do usuário

GET    /usuarios
   ↓
Consulta dos usuários

PUT    /usuarios
   ↓
Atualização do usuário

DELETE /usuarios?id={id}
   ↓
Exclusão do usuário
```

## 🎯 Objetivo do projeto

O projeto tem como objetivo demonstrar conhecimentos práticos em desenvolvimento backend utilizando:

* APIs REST;
* Java;
* Spring Boot;
* Spring Web;
* Spring Data MongoDB;
* Banco de dados NoSQL;
* Operações CRUD;
* Separação de responsabilidades;
* Arquitetura em camadas;
* Integração entre aplicação e banco de dados.

## 🔮 Possíveis melhorias

Como evolução do projeto, podem ser adicionados:

* Validação dos dados de entrada;
* Tratamento global de exceções;
* DTOs para requisições e respostas;
* Documentação com Swagger/OpenAPI;
* Testes unitários e de integração;
* Paginação e filtros;
* Validação de e-mail;
* Controle de duplicidade de usuários;
* Autenticação e autorização;
* Configuração do MongoDB através de variáveis de ambiente.

## 👨‍💻 Autor

**Vitório Santos**

Projeto desenvolvido para prática e evolução em **desenvolvimento backend com Java, Spring Boot e MongoDB**.

