# Simplificando projetos Java com Spring Boot

- Instrutor: Renan Marques
- Empresa: Sonda
- Linkedin: http://linkedin.com/in/renan-marques-dev 
- Github: https://github.com/re04nan

## Conteúdo

- Introdução e apresentação do curso
- Spring
  - Por que Spring
    - Plataforma com diversos recursos para construção de aplicativos Java, facilitando assim o desenvolvimento Java EE
    - Spring Framework é um dos projetos do ecossistema Spring
      - Arquitetura do Spring Framework
        - Data access/Integration
          - JDBC
          - ORM
          - OXM
          - JMS
          - Transactions
        - Web
          - WebSocket
          - Servlet
          - Web
          - Portlet
        - AOP
        - Aspects
        - Instrumentation
        - Messaging
        - Core Container
          - Beans
          - Core
          - Context
          - SpEL
        - Test
  - Beans
    - É um objeto que é instanciado, montado e gerenciado por um container do Spring atravpes de inversão de controle e injeção de dependência. Beans são gerenciados dentro do **Core Container**.
    - Ciclo de vida:
      - Container iniciado > Beand é instanciado > Dependências são injetadas > Chamada do método de inicialização > Bean é utilizado > Bean é descartado e o ciclo se reinicia.
    - Configuração do Bean
      - XML
      - Anotações
      - BeanFactory
        - BeanFactory fornece um mecanismo de configuração avançada capaz de gerenciar objetos de qualquer natureza
      - ApplicationContext
        - se baseia na BeanFactory (é uma subinterface) e adiciona outras funcionalidades, como integração mais fácil com os recursos AOP do Spring, manipulação de recursos de mensagem (para uso na internacionalização), propagação de eventos e contextos específicos da camada de aplicativo, como WebApplicationContext para uso em aplicativos Web
  - Inversão de controle
    - É um processo onde se inverte o fluxo de comando de um programa. É uma ideia de desacoplar ou remover dependências do objeto e fornecer controle para outra camada. Este objeto delega a tarefa de construir dependências para um contêiner IoC.
  - Injeção de dependência
    - Define quais classes serão instanciadas e onde serão injetadas quando for necessário. Existem três formas de aplicar o DI (dependency injection), por injeção de **construtor**, **setter** e **interface**. O Spring Framework aplica IoC quando necessário também utilizando o DI (dependency injection).
- Spring Boot
- Principais dependências e bibliotecas
- Spring Boot Test
- Conclusão

## Referências
- https://spring.io/why-spring
- https://snyk.io/blog/jvm-scosystem-report-2018-platform-application
- https://github.com/re04nan/dio-experts-spring-boot-java