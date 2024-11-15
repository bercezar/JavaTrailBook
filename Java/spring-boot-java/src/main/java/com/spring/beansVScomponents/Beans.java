package com.spring.beansVScomponents;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Classe de configuração do Spring. Ao spring, os métodos definidos dentro dela podem ser usados para criar e configurar beans
public class Beans {
    // A classe registra um bean do tipo Gson.
    @Bean // Será genrenciado pelo framework Spring boot
    public Gson gson(){
        return new Gson();
    }
}