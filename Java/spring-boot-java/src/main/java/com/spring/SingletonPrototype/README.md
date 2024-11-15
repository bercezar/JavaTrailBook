# Singleton vs. Prototype

### Singleton

> Usado quando uma única instância do bean seja compartilhada por toda aplicação

### Protptype

> Usando quando se precisa de uma nova instância sempre que o bean for solicitado

#### Exemplos:

> Singleton

```java
@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Singleton criado!");
}
}
```

> Prototype

```java
@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Prototype criado!");
}
}
```

> Aplicando

```java
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Testando Singleton
        SingletonBean singleton1 = context.getBean(SingletonBean.class);
        SingletonBean singleton2 = context.getBean(SingletonBean.class);
        System.out.println("singleton1 == singleton2? " + (singleton1 == singleton2)); // true

        // Testando Prototype
        PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototype2 = context.getBean(PrototypeBean.class);
        System.out.println("prototype1 == prototype2? " + (prototype1 == prototype2)); // false
    }
}
""
```

- A principal diferença, resumidamente, está nas instâncias e os comportamentos delas em cada execução.

- Imagine uma única impressora compartilhada por todos os computadores de um escritório. Não importa quantas vezes você "solicite a impressora", sempre será a mesma máquina. Isto é o singleton

- Pense em xícaras de café em uma cafeteria. Cada pedido gera uma nova xícara; nenhuma é compartilhada. Isto é o prototype
