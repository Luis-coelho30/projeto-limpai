### Projeto Limpaí
O Limpaí é uma plataforma digital unificada voltada para a criação, divulgação e gerenciamento de mutirões de limpeza. O projeto atua como uma ponte entre voluntários, empresas e ONGs,
permitindo que ações ambientais sejam quantificadas e transformadas em dados de impacto real para o meio ambiente.

### Tecnologias e Configurações
A arquitetura do Back-end foi projetada para ser escalável e segura, utilizando as seguintes tecnologias:
- Linguagem & Framework: Java com Spring Boot
- Banco de Dados: MySQL
- Persistência de Dados: Java Database Connectivity (JDBC)
- Segurança: JSON Web Tokens (JWT) com autenticação baseada em papéis (Role-Based)
- Hospedagem/Cloud: Railway (para API e banco de dados)

### Instalação e Execução (Recomendado)
Para rodar o projeto localmente, você precisará:
1) Java JDK 17+ e Maven instalados
2) Um servidor MySQL ativo
3) Configurar as credenciais do banco no arquivo application.properties do Spring Boot
4) Executar o comando: mvn spring-boot:run
