# Baozi Store API

API REST desenvolvida em Java com Spring Boot para gerenciamento de uma loja fictícia de Baozi, permitindo o cadastro e gerenciamento de produtos, clientes e pedidos.

## Tecnologias

- Java 17
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven

## Funcionalidades

- Cadastro, consulta, listagem e exclusão de clientes.
- Cadastro, consulta, listagem e exclusão de produtos.
- Cadastro, consulta, listagem e exclusão de pedidos.
- Validação da existência de clientes e produtos ao registrar pedidos.
- Validação da quantidade de itens.
- Tratamento global de exceções e respostas HTTP.

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/clientes` | Cadastrar cliente |
| GET | `/clientes` | Listar clientes |
| GET | `/clientes/{id}` | Consultar cliente por ID |
| DELETE | `/clientes/{id}` | Excluir cliente |
|---|---|---|
| POST | `/produtos` | Cadastrar produto |
| GET | `/produtos` | Listar produtos |
| GET | `/produtos/{id}` | Consultar produto por ID |
| DELETE | `/produtos/{id}` | Excluir produto |
|---|---|---|
| POST | `/pedidos` | Cadastrar pedido |
| GET | `/pedidos` | Listar pedidos |
| GET | `/pedidos/{id}` | Consultar pedido por ID |
| DELETE | `/pedidos/{id}` | Excluir pedido |

## Configuração

Configure as credenciais de acesso ao MySQL no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/baozi_store?createDatabaseIfNotExist=true
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
```


## Execução

Execute a aplicação pelo Maven:

**Windows:**
```bash
mvnw.cmd spring-boot:run
```

**Linux/macOS:**
```bash
./mvnw spring-boot:run
```

Após iniciar, a API estará disponível em:

`http://localhost:8080`

## Testes

Os endpoints foram testados utilizando o Postman, verificando operações de cadastro, consulta, listagem, exclusão e validações de pedidos.

## Autor

**Diego Marayo**

Projeto acadêmico desenvolvido para a disciplina de Desenvolvimento Web Back-End — Engenharia de Software, UNINTER.

**Repositório:** https://github.com/DiegoMarayo/baozi-store
