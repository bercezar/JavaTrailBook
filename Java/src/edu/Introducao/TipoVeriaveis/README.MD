# Tipos de Variáveis

### Método Principal

```java
public static void main(String[] args) throws Exception {
    // throws Exception -> se acontecer um erro específico que você não tratou dentro do método, ele será passado para a máquina virtual Java (JVM), que vai lidar com ele.
    // Sem throws: Você precisa lidar com todos os erros dentro do próprio método main usando try e catch.
    // Com throws: Você pode deixar que a JVM lide com certos erros, o que pode simplificar seu código.

    // double salario = 1455.69;

    // short numeroCurto = 1;
    // int numeroNormal = numeroCurto;

    final String NOME = "Bernardo";

    // NOME = "Cezar";  ->ERRO

    // variável toda maiúscula acompanhada de FINAL e um tipo de dados se torna uma constante

    System.out.print(NOME);
}
```
