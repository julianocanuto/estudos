# Aprenda a aplicar testes com Java e JUnit4

- Instrutor: Rodrigo Tassini
- Empresa/cargo: Software Engineer @ CMA 
- Linkedin: https://www.linkedin.com/in/rodrigo-tassini-2b37699/

## Objetivos

- Conceitos do JUnit4
- Asserts
- Rules
- Testando Exceções

## Ambiente

- IDE Eclipse
- JDK 8
- Maven
- JUnit 4.12
- Mockito 3
- Hamcrest
- AssertJ

## Conteúdo

### Rules
Rule é um componente que intercepta uma chamada para um método de teste. Permite que façamos algo antes ou após o método rodar. Para criar uma Rule devemos usar a anotação *@Rule* em um método.

Exemplos de uso:
- Criar arquivos ou diretórios
- Configurar recursos externo com um banco de dados

### Testando exceções

- Exceções esperadas
- Exceções esperadas Rule
- Try/Catch idiom

### Mocks
Objetos Mock, objetos simulados ou simplesmente Mock, é um termo utilizado para descrever objetos que simulam objetos reais de forma controlada.


- Frameworks
  - Mockito (https://site.mockito.org/)
  - EasyMock (https://easymock.org/)
  - PowerMockito (https://powermock.github.io/)
- Razões para usar
  - Quando utilizar o objeto real é difícil e/ou custoso
- Limitações

### Hamcrest 
Framework utilizado para teste de unidade http://hamcrest.org/JavaHamcrest/. Ao invés de usar várias *assertions*, usa-se apenas *assertThat* com os *matchers* adequados.

- Matcher
  - Object Matcher
  - Bean Matcher
  - Collection Matcher
  - Number Matcher
  - Text Matcher

### AssertJ
Permite escrever testes mais fluentes, ou seja, de mais fácil compreensão https://assertj.github.io/doc/.