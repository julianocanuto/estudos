# Estrutura de dados em Java - Árvores

- Instrutor: Jõao Ricardo Côre Dutra
- Empresa: NTT Data (antiga Everis)
- Linkedin: https://www.linkedin.com/in/jo%C3%A3o-dutra-400a9330/


# Árvores
## Conceitos
- Estruturas de dados bidimensional
- Não linear (listas, filas e pilhas são estruturas lineares)
- Constituída de nós que representam um modelo hierárquico
- Armazenam os dados com base em relações de dependências

## Aplicações
- Sistemas de arquivos
- Bancos de dados
- Inferfaces gráficas
- Páginas Web

## Estrutura
- Nó = elemento da árvore (armazena dados e referências para outros Nós)
- Raíz = Nó que dá origem aos outros Nós (Nível 0)
- Folhas ou Nó terminal = Nó das pontas (que não tem filhos)
- Nó Pai e Filho
- Nó Irmão = Nós no mesmo nível hierárquico
- Altura ou profundidade = Grau máximo dos nós
- Nó interno = que não tem uma folha
- Grau do Nó - Quantidade de Filhos diretos
- Subárvore

## Representações
- Hierárquica (usada no curso)
- Por parênteses aninhados
- Por inclusão

## Algoritmos
Para trabalhar com Árvores Binárias os algoritmos costumam ser muito complexos.

## Tipos de Árvore
- Árvore binária (mais comum)
- Árvore AVL
- Árvore Ordenada
- Árvore Rubro-Negra
- Árvore 2-3
- Árvore 2-4
- Árvore B
- Árvore B+
- Árvore Hiperbólica

## Árvore Binária
Em uma Árvore Binária a posição dos Nós é definida comparando o conteúdo do Nó com base em algum critério. No caso de uma àrvore de inteiros é feita a comparação de valores e com base nisso a posição é definida. Se não houver Nó, o primeiro valor a entrar vira a Raíz. O próximo valor será comparado com a Raíz e se for menor ficará como sendo o nó da esquerda e se for maior ficará como o nó da direita. Essa comparação é feita implementando a interface *Comparable< T >*, no caso de uma Árvore de objetos.

- Posição dos Nós
  - Miores à direita
  - Menores à esquerda

## Implementação do Nó da Árvore Binária

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-baqh{text-align:center;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-baqh" colspan="2">Object()</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-baqh">noEsq</td>
    <td class="tg-baqh">noDir</td>
  </tr>
</tbody>
</table>

- Object() = Payload (conteúdo)
  - noEsq = Referência para o nó à esquerda
  - noDir = Referência para o nó à direita
  - Os nós Folhas apontam para Null.

## Árvores de busca binária: Operações
- Inserção
  - Compara o valor a ser inserido, desde o Nó raíz até encontrar um Nó Folha que seja maior que o valor inserido. O novo Nó não pode entrar no meio da Árvore. 
- Exclusão
  - Exclusão da raíz: Pega o maior elemento da esquerda
- Exibição
  - Usa algoritmo recursivo

## Referências

- [Livro](https://amzn.to/3DtxuO3): Lógica de programação e estruturas de dados - Sandra Puga e Gerson Rissetti
- [Livro](https://amzn.to/3dGbQfb): Estruturas de dados fundamentais: Conceitos e aplicações - Silvio de Lago Pereira
- [Livro](https://www.casadocodigo.com.br/products/livro-certificacao-java-associate?_pos=1&_sid=9ee4c229c&_ss=r): Java SE 8 Programmer I - O guia para sua certificação Oracle Certfied Associate - Guilherme Silveira, Mário Amaral