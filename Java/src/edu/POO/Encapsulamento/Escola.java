package edu.POO.Encapsulamento;

public class Escola{

    public static void main (String []args){
        Alunos aluno = new Alunos();
        aluno.setNome("Bernardo Cezar Alves de Oliveira");
        aluno.setIdade(24);

        System.out.println("A escola possui o aluno matriculado: \n Nome: " + aluno.getNome() + "\n idade: " + aluno.getIdade());
    }
}
