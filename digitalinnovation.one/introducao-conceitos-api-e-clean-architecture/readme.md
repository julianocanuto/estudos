# Tratamento de exceções em Java

- Instrutor: Jether Rodrigues
- Empresa: C6 Bank
- Linkedin: https://www.linkedin.com/in/jetherodrigues/

## Conteúdo

- Estilo arquitetural REST
  - Roy Fielding (HTTP e REST)
  - **RE**presentational **S**tate **T**ransfer
  - Interoperável e agnóstico a linguagem ou tecnologia (meio de integração entre sistemas de qualquer stack tecnológica)
  - Constraints
    1. Interface Uniforme
        - Baseado em recursos, interfaces por onde o cliente se comunica ao servidor
    1. Cliente-Servidor
         - Podem existir e são independentes (podem ser desenvolvidos separadamente)
    3. Sem estado
         - O servido não guarda estado, sessão, necessário sempre, a cada requisição, caso necessário, informar o servidor quem está requerendo o dado específico
    4. Cache
         - Funcionalidade que elimina, dado algumas configurações, voltar ao servidor, se a requisição se repetir dentro de um tempo. Cache pode ser gerenciado em modo client ou server side. Capacidade de manter cópias de um response armazenadas por um tempo determinado
           - Elementos:
             - Tempo de expiração
             - Cache-Control
               - max-age
             - E-tag
             - Last Modified
    5. Sistema em camadas
         - Por ser sem estado, permite distribuir as implantações e ou recursos, ex.: API em um servido, data storage em outro e sistema de autenticação em um terceiro servidor
    6. Código sob demanda
         - Possibilidade de retornar "executáveis" via API para renderização de algum componente se necessário
   - Versionamento
     - Permite evolução de uma API sem trazer quebra de contratos para os clientes (mudanças em requests e responses, remoção de API)
       - Tipo:
         - URI: http://api.example.com/v1, http://apiv1.example.com/
         - Header customizado: Accept-version: v1
         - Content Negotiation (Accept Header) - **Usado no C6 Bank**:
           - Accept: application/vnd.example.v1+json
           - Accept: application/vnd.example.v1+json;version=1.0
    - Resource Naming Guide
      - Estratégia para expor recursos (plural ou singular)
      - Estrutura de nomes para recuperar recursos, armazenar, detalhe, nomes compostos, passar parâmetros (query param, path param)
      - URI (endereçamento para um determinado recurso)
        - Nomes compostos são separados por hífen
   - Verbos HTTP
     - GET
     - POST
     - PUT
     - PATCH
     - DELETE
   - Códigos HTTP
     - 1xx - Informações
     - 2xx - Sucesso na requisição
     - 3xx - Redirecionamentos
     - 4xx - Erro no lado do cliente
     - 5xx - Erro no lado do servidor
   - Idempotência
     - Uma requisição idempotente é aquela que, independente da quantidade de vezes que se execute, o efeito é o mesmo que da primeira execução
       - POST não é idempotente
     - GET, PUT, PATCH, DELETE, HEAD, OPTIONS e TRACE são idempotentes
   - N+1 em REST APIs
     - API compose
- Conceito de API First
  - Abordagem baseada em contratos, independente de tecnologia, onde se define as chamadas da API e a partir delas as funcionalidades vão sendo desenvolvidas   
- API RESTFul com Spring Boot
- **Clean Architecture**
  - Principal objetivo de uso de Clean Architecture é fornecer aos desenvolvedores uma maneira de organizar o código de forma que encapsule a lógica de negócios, mas mantenha-o separado do mecanismo de entrega.
    - Vantagens:
      - Independência de interfaces de usuário
      - Independência de stack tecnológica utilizada para acesso aos dados e ou expor entradas
      - Testável
      - Carga cognitiva de entendimento do projeto, regras de negócio
      - Facilita manutenabilidade
  - Ports and Adapters
    - Consegue atingir o objetivo da clean architecture
- Sistema de gerenciamento de banco de dados
  - NoSQL
  - Relacional
- Postman 

## Projeto
### Pré-requisito
- Arquitetura Hexagonal aplicado ao projeto
  - Application layer
    - Configs
    - Controllers (conceito de fronteira)
      - DTOs (request, response)
      - Bean Validations
      - Init Binders (validações customizadas)
      - Error Handlers
  - Domain Layer
    - Entidades
    - Portas (interfaces)
    - Services
  - Resource Layer
    - Spring data repository
    - Proxy repository (composição com spring data repository e implementação interface repository do domínio)
    - Entidades mapeadas com anotações de acordo com tecnologia de banco de dados escolhida para o projeto
  - Testes
  - Dockerização
    - Scrpt e configuração para criação de imagem
    - Compose yaml do serviço
    - Usando docker-compose para subir o serviço
  - Heroku
    - Criando uma app
    - Conectando com o github do projeto
    - Automatizando o pipeline de deploy

## Referências
- https://httpstatuses.com
- https://swagger.io/resources/articles/adopting-an-api-first-approach
- https://editor.swagger.io 
- https://start.spring.io
- Slides: https://drive.google.com/file/d/1NJD-33oiHjCfax1VPIBzVuw73iFuzPiV/view