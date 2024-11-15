package com.spring.propertiesValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
    
    private String nome = "Bernardo Cezar Alves de Oliveira";
    private String email = "b1234@gmail.com";
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[]{(long) 40028922}));

    @Override
    public void run (String... args){
        System.out.println("Mensagem enviada por:  " + nome + "\nE-mail: " + email + "\nCom telefone para contato: " + telefones);
        System.out.println("Cadastro aprovado!");
    }
}
