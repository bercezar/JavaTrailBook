# Collections

A classe `Estrutura` é uma introdução ao conceito de coleções em Java, que são estruturas de dados utilizadas para armazenar e manipular grupos de objetos.

## Conceitos Básicos

- **Coleções**: Uma coleção é uma estrutura de dados que armazena múltiplos valores e permite operações sobre esses valores. As coleções facilitam o trabalho com grupos de dados de maneira organizada e eficiente.

- **Arrays**: Em Java, arrays são estruturas de dados que armazenam um número fixo de elementos do mesmo tipo. No entanto, não podemos redimensionar um array após sua criação. Isso implica algumas limitações:

  - É impossível buscar diretamente um elemento quando não se sabe o índice.
  - Não conseguimos determinar quantas posições do array já foram "populadas".

## Problemas com Arrays

Ao tentar inserir novos dados em um array, podemos enfrentar algumas questões:

- Precisamos procurar por um espaço vazio?
- Como gerenciar posições vazias?
- E se não houver espaço disponível?
- Teremos que criar um array maior e copiar os dados do antigo para ele?
- Como saber quantas posições estão sendo usadas no array?
- Vamos precisar sempre percorrer o array inteiro para obter essa informação?

Esses desafios são endereçados pelas **Coleções** em Java, que oferecem mecanismos para gerenciar dados de forma mais eficiente.

## Hierarquia de Interfaces de Coleções

Java fornece várias interfaces na hierarquia de coleções:

- **Collection**: A interface raiz da hierarquia de coleções. Ela não possui uma implementação direta, mas define operações básicas para coleções, como adicionar, remover e esvaziar elementos.

- **Set**: Define uma coleção que não permite elementos duplicados.

- **List**: Define uma coleção ordenada que pode conter elementos duplicados. O usuário tem controle total sobre a posição de cada elemento e pode recuperá-los por seus índices.

- **Queue**: Uma coleção que mantém uma lista de prioridades, onde a ordem dos elementos é definida pela implementação de `Comparator` ou `Comparable`, que determina a prioridade dos elementos.

- **Map**: Mapeia chaves para valores. Cada elemento contém dois objetos: uma chave e um valor. Os valores podem ser duplicados, mas as chaves não podem.

## Conclusão

As coleções em Java são fundamentais para o armazenamento e manipulação de dados. Compreender suas interfaces e como usá-las é crucial para o desenvolvimento de aplicações robustas e eficientes.
