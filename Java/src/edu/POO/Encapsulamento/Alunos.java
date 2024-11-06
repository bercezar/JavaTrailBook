package edu.POO.Encapsulamento;

public class Alunos {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public void setIdade(int newIdade) {
        idade = newIdade;
    }
}
