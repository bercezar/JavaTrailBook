# Spring Boot:

---

## 🚨 Parte prática do Spring Boot se encontra no caminho deste diretório: Java/spring-boot-java/src/main/java/com/spring

---

## O que é?

- É um framework destinado a automatizar a criação de aplicações Spring...

## Ok, mas para que serve e qual motivo de usar?

- Quando criamos classes e quando precisamos dela o do objeto no códig, necessitamos de seus instânciamento, de forma manual usando o new.

```java
public class Calculadora{

    public int somar(int n1, int n2){
        return n1+n2;
    }
}

public class MyApp{

    public void static main(String args[]){
        Calculadora calculadora = new Calculadora(); // Instância criada
        System.out.println("Resultado da soma: " + calculadora.somar(2,5));
    }
}

```

- Com o spring boot, temos a facilidade e a reutilização do código:

```java
@Component
public class Calculadora {
    public int somar(int n1, int n2){
        return n1+n2;
    }
}

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;


    @Override
    public void run(String... args) throws Exception{
        System.out.println("Resultado da soma: " + calculadora.somar(15,7));
    }
}

```

## Component, Bean, Autowired

#### Bean

- Um termo utilizado apenas para se referir a um objeto que será gerenciado pelo Spring. Como exemplo citado a cima, o @Component torna o bean, o objetogerenciado, significa que o Spring Boot instanciará a classe.

#### Component

- Usado para indicar que o Spring irá gerenciar a classe como um bean. Quando uma classe é anotada com @Component, ela é registrada automaticamente no Container de Inversão de Controle (IoC Container) do Spring. O IoC Container é responsável por instanciar, configurar e gerenciar os ciclos de vida dos objetos (beans) da aplicação.

##### Autowired

- Anotação usada para injetar automaticamente uma instância de um bean em outra classe, substituindo a necessidade de criar instâncias com o new.
