package com.spring.beansVScomponents;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication  // Marca a classe como a classe principal para configurar e iniciar a aplicação Spring Boot

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // Inicia o App Spring Boot
    }

    @Bean // Indica o método run retorna um compenent gerenciado pelo Spring

    CommandLineRunner run(ConversorJson conversor) throws Exception {
    // Interface que permite executar o código após o app iniciar, e com o método run, cria um CommandLineRunner que chama o ConversorJson para converter o JSON fornecido em um objeto ViaCepResponse.
        return args -> {
            String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }
}
