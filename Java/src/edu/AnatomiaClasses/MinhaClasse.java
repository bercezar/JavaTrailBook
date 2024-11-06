package edu.AnatomiaClasses;
public class MinhaClasse {
    
    public static void main(String [] args) {
        System.out.print ("Olá, ");


        String meuNome = "Bernardo";
        String meuSobreNome = "Cezar ";
        String nomeCompleto = nomeCompleto(meuNome, meuSobreNome);
        
        
        int idade = 24;
        idade = 23;


        boolean simNao = true; // false;
        if(simNao){
            System.out.print (nomeCompleto);
            System.out.print (idade);
        }
        else
        System.out.print ("Falso");
    }

    public static String nomeCompleto(String nome, String sobrenome){
        // return nome.concat(" ").concat(sobrenome);
        return nome + " " + sobrenome;
    }
} 