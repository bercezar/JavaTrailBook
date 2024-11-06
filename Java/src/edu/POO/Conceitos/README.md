# Conceito de Programação Orientada a Objetos

**Programação Estruturada vs Programação Orientada a Objetos:**

- **Programação Estruturada**: Algoritmos com estruturas sequenciais, denominadas procedimentos lineares, que podem afetar variáveis locais ou globais em uma aplicação.

- **Programação Orientada a Objetos**: Baseia-se no conceito de objetos, que podem conter dados na forma de campos, também conhecidos como atributos, e na forma de procedimentos, conhecidos como métodos.

## Classes

- **Classe**: Definido como um tipo de dado na orientação a objetos, fazendo parte métodos e atributos.

- **Características**: Também conhecidos como atributos, toda informação que representa o estado dos objetos.

- **Comportamentos**: Também conhecidos como métodos, toda ação referente a estes objetos.

- **Instanciar (new)**: Ato de criar um objeto a partir da estrutura definida em uma classe.

## Pacotes

Imaginando que sua empresa se chama Power Soft e ela está desenvolvendo softwares comercial, governamental e um software livre ou de código aberto:

- **Comercial**: `com.powersoft`
- **Governamental**: `gov.powersoft`
- **Código Aberto**: `org.powersoft`

### Estrutura dos Pacotes

- **Pacote model**: Contém os modelos principais da aplicação, que normalmente representam entidades ou objetos de domínio. Por exemplo, Usuário, Produto, Pedido.

- **Pacote service**: Contém a lógica de negócio da aplicação. Os serviços realizam operações sobre os dados e frequentemente utilizam repositórios para interagir com o banco de dados. Por exemplo, `UsuarioService`, `PedidoService`, `Cliente` possui o método validar o CPF do cliente cadastrado.

- **Pacote repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados. Por exemplo, `ClienteRepository`.

### Exemplo Prático

`/.src/.com`

## Visibilidade de Recursos

- **Modificadores de acesso**: Os modificadores de acesso em Java são palavras-chave usadas para definir o nível de acesso que outras classes, métodos e membros podem ter em relação a uma classe ou membro específico.

  - **public**:

    - **Visibilidade**: Acessível de qualquer lugar.
    - **Classes**: Quando uma classe é declarada como public, ela pode ser acessada de qualquer outro pacote.

  - **private**:

    - **Visibilidade**: Acessível apenas dentro da própria classe.
    - **Classes**: O modificador private não pode ser aplicado a classes externas, apenas a classes internas.

  - **protected**:

    - **Visibilidade**: Acessível dentro do mesmo pacote e em subclasses, mesmo que estas estejam em pacotes diferentes.
    - **Classes**: O modificador protected não pode ser aplicado diretamente a classes, mas é usado em membros de classe para permitir o acesso controlado.
    - **Melhor Explicação**:
      - **Dentro do Mesmo Pacote**: Membros com o modificador protected são acessíveis para todas as classes no mesmo pacote. Isso significa que qualquer classe que esteja no mesmo pacote pode acessar esses membros, independentemente de ser uma subclasse ou não.
      - **Em Subclasses**: Além do acesso dentro do mesmo pacote, membros protected também são acessíveis em subclasses, mesmo que essas subclasses estejam em pacotes diferentes. Ou seja, se uma classe A define um método protected, e uma classe B estende A (ou seja, B é uma subclasse de A), B pode acessar o método protected de A mesmo que B esteja em um pacote diferente de A.

  - **default (Sem Modificador)**:
    - **Visibilidade**: Acessível apenas dentro do mesmo pacote.
    - **Classes**: Se uma classe não possui nenhum modificador de acesso, ela é acessível apenas pelas outras classes no mesmo pacote.
