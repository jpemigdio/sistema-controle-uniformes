# Sistema-Controle-Uniformes
Sistema de Controle de Uniforme Esportivos com operações CRUD, desenvolvido em Java Web utilizando JSP, Servlets, JDBC, MySQL, MVC e DAO.


## Sobre o Projeto
O Sistema de Controle de Uniformes Esportivos foi desenvolvido como projeto acadêmico com o objetivo de gerenciar uniformes utilizados em atividades esportivas. O sistema permite o cadastro, consulta, atualização e exclusão de uniformes, além do controle de solicitações contendo diferentes tamanhos e quantidades.
O projeto foi desenvolvido utilizando Java Web, seguindo a arquitetura MVC e o padrão DAO para organização e persistência dos dados.


## Tecnologias Utilizadas
= Java
- JSP
- Servlets
- JDBC
- MySQL
- HTML5
- CSS3
- MVC (Model, View, Controller)
- DAO (Data Access Object)


## ⚙️ Funcionalidades

### Uniformes

- Cadastrar uniforme
- Consultar uniforme por ID
- Consultar todos os uniformes
- Atualizar uniforme
- Excluir uniforme

### Solicitações

- Registrar solicitação de uniformes
- Definir tamanhos (P, M, G e GG)
- Controlar quantidade por tamanho

---

## 🏗️ Arquitetura

O projeto foi desenvolvido utilizando o padrão MVC:

### Model
Responsável pelas entidades e regras de negócio.

Exemplos:
- Uniforme
- UniformeSolicitacao
- StatusUniforme
- UniformeCor

### View
Responsável pela interface com o usuário.

Exemplos:
- JSP
- HTML
- CSS

### Controller
Responsável pelo processamento das requisições.

Exemplos:
- Servlets

### DAO
Responsável pela comunicação com o banco de dados utilizando JDBC.

Exemplos:
- UniformeDAO
- UniformeSolicitacaoDAO

---

## 🗄️ Banco de Dados

O sistema utiliza MySQL para armazenamento das informações.

Principais entidades:

### Uniforme

- ID
- Modalidade
- Descrição
- Cor
- Fornecedor
- Status
- Localização
- Responsável
- Estado de Conservação

### Solicitação

- ID
- Tamanho
- Quantidade

---

## 🎯 Conceitos Aplicados

Durante o desenvolvimento foram aplicados conceitos de:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- CRUD
- JDBC
- Banco de Dados Relacional
- MVC
- DAO
- Servlets
- JSP

---

## 👨‍💻 Autor

**João Paulo Emigdio de Moraes**
Projeto desenvolvido para fins acadêmicos na disciplina de Implementação Orientada a Objetos.

