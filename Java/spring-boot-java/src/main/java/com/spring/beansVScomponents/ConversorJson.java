package com.spring.beansVScomponents;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

@Component  // Dica: eu uso o @component quando tenho acesso ao código fonte
public class ConversorJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}