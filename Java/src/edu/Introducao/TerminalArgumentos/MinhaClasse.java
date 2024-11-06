package edu.Introducao.TerminalArgumentos;

public class MinhaClasse {
    public static void main(String[] args){
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //assunto para mais para frente

        System.out.println("Eu sou " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);

        //rodar no terminal powershell 
    }
}
