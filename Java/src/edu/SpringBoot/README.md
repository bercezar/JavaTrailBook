# Spring Boot:

---

## O que é?

- É um framework destinado a automatizar a criação de aplicações Spring...

## ok, mas para que serve e qual motivo de usar?

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



## Component, Bean, Autowired

---
```
