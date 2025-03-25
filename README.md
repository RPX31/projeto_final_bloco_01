# Sistema de Inventário de Produtos - Java Puro

Este projeto é um sistema de inventário desenvolvido em Java, focado em operações CRUD (Create, Read, Update, Delete). O sistema foi projetado para gerenciar um inventário de produtos, permitindo adicionar, listar, atualizar e excluir produtos de maneira simples e eficiente. O sistema não utiliza banco de dados e funciona apenas em memória local, sendo ideal para fins de estudo e aplicação de conceitos de programação orientada a objetos.

## Estrutura do Projeto

A estrutura do projeto está organizada de maneira modular, com três principais pacotes que seguem os princípios da programação orientada a objetos (POO):

- **controller**: Responsável pela lógica de controle do sistema. Aqui são definidas as operações que podem ser realizadas com os produtos (adicionar, listar, atualizar, excluir).
- **repository**: Responsável por gerenciar o armazenamento dos dados em memória local (neste caso, uma lista de produtos). O repositório atua como o "banco de dados" temporário.
- **model**: Contém as classes que representam as entidades do sistema, como o produto. Cada produto possui atributos como nome, preço e quantidade.

## Funcionalidades

O sistema permite as seguintes funcionalidades:

- **Create**: Adicionar um novo produto ao inventário.
- **Read**: Exibir todos os produtos do inventário.
- **Update**: Atualizar as informações de um produto existente.
- **Delete**: Remover um produto do inventário.

## Requisitos

- JDK 11 ou superior instalado na máquina.
- IDE de sua preferência (Ex: IntelliJ IDEA, Eclipse).

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/RPX31/projeto_final_bloco_01.git


2. **Entre na pasta do projeto**:
cd projeto_final_bloco_01

3. **Compile e execute**:

Se você estiver usando uma IDE como IntelliJ ou Eclipse, basta abrir o projeto e executar a classe principal.

Se estiver utilizando a linha de comando, você pode compilar e rodar os arquivos manualmente.




