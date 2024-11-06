package edu.POO.Construtores;

public class Sistema  {
    public static void main(String []args){
        Pessoa pessoa = new Pessoa("1234");
        // A criação, a construção ja deve ser passada com um parãmetro diretamente

        pessoa.setNome("Bernardo");
        pessoa.setIdade(24);
        pessoa.setSexo("Masculino");

    }
}
