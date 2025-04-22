# Sistema gerenciamento Usuários com Docker - MongoDB 🍃 🐳

Um repositório que faz parte do conjunto entre outros 2 repositórios, que são aplicações que salvam e exibem os dados de usuários. Uma é responsável por exibir os dados que salvos em coleções no MySQL e a outra exibe ambos os dados das APIs.
Neste projeto é disponibilizado uma API que persiste e retorna dados contidos na tabela MongoDB.

## Projetos Relacionados:
- API que persiste o dado no MySQL 🐬: [API MySQL](https://github.com/gustavoc0imbra/API-Usuarios-Mysql-docker-1bim)
- Aplicação frontend: [App React](https://github.com/gustavoc0imbra/frontusuarios-proj1bim-docker)

## Como instalar e rodar o projeto:
- Clonar este repositório no diretório desejado `git clone https://github.com/gustavoc0imbra/API-Usuarios-Mongo-docker-1bim.git`
- Após clonar, acessar via terminal o diretório do projeto e digite o seguinte comando para realizar o build da imagem docker:
- `docker-compose up -d`
- Aguarde o término do build
> [!NOTE]
> - A API será disponibilizada no endereço `http://localhost:8080/api/v0`  
> - O endpoint para receber a lista e salvar as informações são `/users`  
> - A documentação da API pode ser acessada no endereço `http://localhost:8080/docs`
