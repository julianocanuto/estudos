# Entendendo a importância da modelagem e segurança na construção de APIs

- Instrutores/Empresa/Linkedin:
  - Venilton Falvo Jr - DIO - https://www.linkedin.com/in/falvojr/
  - Thiago Prado - Santander - https://www.linkedin.com/in/thiagoarantesprado/
  - Marcus Vinicius - Santander - https://www.linkedin.com/in/marcus-vinicius-almeida-silva/
  - Claudia Tachira - Santander - https://www.linkedin.com/in/claudia-tachira-cissp-671490/

## Conteúdo

- Apresentação inicial do tema
- O que é uma API
  - Developer Experience[[10][11]](#Referências)
  - Modelar API pensando no consumidor
- Sobre modelagem das APIS - Parte 1
  - Arquitetura REST
  - API First
  - API REST é uma API que segue as boas práticas
  - API RESTFUL é uma API que foi implementada com as boas práticas
  - Nível de maturidade de Richardson
  - Boas práticas (RESTFUL)
    - Recursos estarem no plural
    - Máximo de 4 níveis hierárquicos nos recursos
    - Fazer uso dos verbos
- Sobre modelagem das APIS - Parte 2
  - Modelagem no Swagger, agora chamado OpenAPI
  - Fazer a API antes de começar a codar
  - Contrato API, documento .yml da OpenAPI que define a API
  - Nível 2 de maturidade de Richardson
  - API Gateway
- O que é segurança de APIs
  - Definição de segurança utilizada pela OWASP
  - Pilares da segurança de APIs
    - Visibilidade
    - Controle de acesso
    - Gerenciamento de tráfego
    - Proteção de ameaças
    - Segurança como integridade e confidencialidade das APIs
  - Relatório OWASP API security Top 10
    - Relatório mais visual: owasp-api-security-top-10-cheat-sheet
  - Consultar APIsecurity.io
  - API Academy: Cursos gratuitos sobre modelagem, segurança e gerente de produto
  - Os top 3 vulnerabilidades relacionadas a APIs estão relacionadas ao controle de acesso
    - Protocolos:
      - OAuth2
      - OpenID
    - Outros termos [[12]](#Referências)
      - JWT
      - JWE
      - JWS
  - Livro Securing Microservice APIs [[13]](#Referências)
  - Três riscos principais relacionados a segunraça de APIs
    - Estrutura
      - Tamanho de mensagem
      - Spoofing de content type
      - Mensagem mal formatada
    - Formato
      - Identificar o que está vindo no payload
      - Payload binário (imagens, áudios)
      - Payload markup (xml, json)
    - Semântica
      - Blacklist
      - Whitelist
      - Validação de Schema
  - SLA: Service Level Agreement
    - Pensar como:
      - Limitação de throughput
      - Cotas de uso
      - limites de horário
  - 60% dos ataques virtuais vem de usuários internos
    - 80% dos ataques internos utilizaram credenciais de outras pessoas ou serviços
- Breve visão sobre LGPD e vazamento de dados
  - API expoe tanto a lógica do negócio quanto tem acesso aos dados
  - PII: Personally identifiable information
  - Controlar a visibilidade do que está sendo consumido e pra quem está compartilhando, quando consome, pra que utiliza
  - Cuidado para não compartilhar mais do que foi solicitado
- Pentest em API são realizados?
  - Principal vulnerabilidade: controle de acesso
  - Pentest específico para controle de acesso
  - Existem testes específicos para cada item que queremos testar em uma API
- Questões gerais sobre aplicação do conhecimento em segurança
  - Entregar o funcional, pensando nos requisitos não funcionais
- Delimitando a modelagem de APIs
  - Entender o que quer expor
  - Contexto precisa ser limitado
  - Não pode ter vazamento de domínio
  - API First
    - Modelar/desenhar o contrato usando .yml
    - Expor o contrato dentro de um gateway
      - Google Apigee
    - Desenvolver o backend
- Sobre segurança contra ataques de força bruta
  - Ter um modelo arquitetural que não deixe a segurança somente na mão do dev
  - O **modelo de autenticação** mais indicado é o **OAuth**2
  - Desenvolve-se em várias camadas e a segurança estará em diversas dessas camadas
  - Usando um API Gateway é possível limitar o uso da API definindo regras para os consumidores
- Como se realiza a migração de uma API v1 para v2?
  - Conteito API management
  - Atualizar uma API de v1 para v2 é uma contrato
  - É preciso ter políticas para atualizar e aposentar as APIs
    - As estratégias precisam ser discutidas com os consumidores
  - Atenção se houver muita incidência de versionamento de uma API, pode indicar problemas na qualidade e modelagem da API
- Questões sobre limitação de serviços em relação ao CID
  - CID: Confidencialidade, Integridade e Disponibilidade
  - Definido no SLA
  - Informar o motivo, caso o limite tenha sido atingido
- A relação entre microserviçoes e microgateways[17]
  - Antigamente haviam gateways gigantescos
  - Atualmente é possível ter um microgateway para um serviço específico
- Comentários finais
  - Poucos atualmente desenvolvem tendo conhecimento de segurança (perfil bem desejado)
  - Dev Java com conhecimento de segurança de desenvolvimento de APIs, por exemplo
- Links úteis

## Referências

1. [Artigo Sarah Tumenas sobre modelagem e segurança na construção de APIs](https://sarahtumenas.github.io/Modelagem-e-Seguranca-Construcao-APIs/)
2. [API Certification](https://apiacademy.co/api-certification/)
3. [Apigee e gerenciamento de APIs](https://cloud.google.com/training/api-management?hl=pt)
4. [OpenAPI Specification](https://swagger.io/specification/)
5. [OpenAPI Specification v3.1.0](https://spec.openapis.org/oas/latest.html)
6. [OWASP API Security Project](https://owasp.org/www-project-api-security/)
7. [API Security Articles](https://apisecurity.io/)
8. [Livro: API Management_ An Architect's Guide to Developing and Managing APIs for Your Organization]()
9. [Livro: REST API Design Rulebook]()
10. [Livro: Irresistible APIs_ Designing web APIs that developers will love]()
11. [Livro: Designing Web APIs_ Building APIs That Developers Love]()
12. https://www.brunobrito.net.br/jose-jwt-jws-jwe-jwa-jwk-jwks/
13. https://docs.broadcom.com/doc/securing-microservice-apis-sustainable-and-scalable-access-control
14. [Documenting a Spring REST API Using OpenAPI 3.0 by Baeldung](https://www.baeldung.com/spring-rest-openapi-documentation)
15. [Library for OpenAPI 3 with spring-boot By Badr NASS LAHSEN](https://springdoc.org/)
16. [Doing More With Springdoc-OpenAPI](https://dzone.com/articles/doing-more-with-springdoc-openapi)
17. [Selecting the Right API Gateway to Protect Your APIs and Microservices by Gartner](https://www.gartner.com/en/documents/3880018/selecting-the-right-api-gateway-to-protect-your-apis-and)
