```markdown
# loginPractice

Este é um projeto de exemplo que utiliza Spring Security, JWT (JSON Web Token), Flyway e PostgreSQL.

## Descrição

O projeto "loginPractice" é uma aplicação de exemplo que demonstra como implementar autenticação e autorização utilizando Spring Security e JWT. Ele também usa Flyway para gerenciamento de migrações de banco de dados e PostgreSQL como o banco de dados principal.

## Tecnologias Utilizadas

- **Spring Security**: Framework de segurança para aplicações Java.
- **JWT (JSON Web Token)**: Método compacto, URL-safe para representar claims transferidos entre duas partes.
- **Flyway**: Ferramenta para migração de banco de dados.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.

## Pré-requisitos

- JDK 11 ou superior
- Maven 3.6.0 ou superior
- PostgreSQL

## Configuração

1. Clone o repositório:
    ```bash
    git clone https://github.com/KauanJasiskis/loginPractice.git
    cd loginPractice
    ```

2. Configure o banco de dados PostgreSQL conforme necessário e atualize as configurações em `application.properties`.

3. Execute as migrações do Flyway:
    ```bash
    mvn flyway:migrate
    ```

## Executando a Aplicação

Para executar a aplicação, use o Maven:
```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

- **/auth/login**: Endpoint para autenticação. Requer um JSON com `username` e `password`.
- **/auth/register**: Endpoint para registro de novos usuários. Requer um JSON com `username`, `password` e `Role` (ADMIN ou USER).
- **/book**: Endpoint para registro de novos livros e leitura dos livros já registrados. É necessário estar autenticado e autorizado para ter acesso.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```
