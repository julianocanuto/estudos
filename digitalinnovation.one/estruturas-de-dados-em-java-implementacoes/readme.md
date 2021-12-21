# Estrutura de dados em Java - Implementações

- Instrutor: Jõao Ricardo Côre Dutra
- Empresa: NTT Data (antiga Everis)
- Linkedin: https://www.linkedin.com/in/jo%C3%A3o-dutra-400a9330/

## Conceitos de equals e hashCode
- hashCode
  - Melhorar a busca de objetos dentro das estrutura de dados
- equals
  - Serve para comparação de igualdade

Devem ser implementados juntos.

## Stack (Pilha)
- Classe *Stack<>*
  - Métodos:
    - empty() - Testa se a pilha está vazia
    - peek() - Olha para o objeto no topo da pilha sem remover o objeto do topo
    - pop() - Remove o objeto do topo da pilha e retorna o objeto
    - push() - Empurra um item para o topo da pilha
    - search() - Returns the 1-based position where an object is on this stack

Documentação (Java SE 10): https://docs.oracle.com/javase/10/docs/api/java/util/Stack.html

## Queue - Interface Queue (Fila, LinkedList)
- Interface *Queue<>*
- A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these **methods exists in two forms: one throws an exception** if the operation fails, the **other returns a special value** (either null or false, depending on the operation). The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.


| Throws exception | Returns special value | Returns special value |
|------------------|-----------------------|-----------------------|
| Insert           | add(e)                | offer(e)              |
| Remove           | remove()              | poll()                |
| Examine          | element()             | peek()                |



Documentação (Java SE 10): https://docs.oracle.com/javase/10/docs/api/java/util/Queue.html

## List (ArrayList)
- Interface *List<>*
  - Métodos *(alguns)*
    - add
    - get
    - indexOf
    - remove

Documentação (Java SE 10): https://docs.oracle.com/javase/10/docs/api/java/util/List.html

## Set (HashSet ou TreeSet)
- Interface *Set<>*
- Não preserva ordem de inserção
- Não permite repetição
- *TreeSet* precisa da implementação do *compareTo()*

Documentação (Java SE 10): https://docs.oracle.com/javase/10/docs/api/java/util/Set.html

## Map (HashMap)
- Interface *Map<>*
- Estrutura chave e valor
  - Métodos (alguns)
    - keySet() - Retorna as chaves
    - values() - retorna os valores
    - containsKey() - Informa se contém uma determinada chave

Documentação (Java SE 10): https://docs.oracle.com/javase/10/docs/api/java/util/Map.html

## Referências

- [Livro](https://amzn.to/3DtxuO3): Lógica de programação e estruturas de dados - Sandra Puga e Gerson Rissetti
- [Livro](https://amzn.to/3dGbQfb): Estruturas de dados fundamentais: Conceitos e aplicações - Silvio de Lago Pereira
- [Livro](https://www.casadocodigo.com.br/products/livro-certificacao-java-associate?_pos=1&_sid=9ee4c229c&_ss=r): Java SE 8 Programmer I - O guia para sua certificação Oracle Certfied Associate - Guilherme Silveira, Mário Amaral