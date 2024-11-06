package edu.POO.Construtores;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private String cpf;

    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String newNome){
        nome = newNome;
    }
    public void setSexo(String newSexo){
        sexo = newSexo;
    }
    public void setIdade(int newIdade){
        idade = newIdade;
    }

    // Método construtor deverá ser igual ao nome da classe
    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    // Assim como, pode considerar adicionar um construtor que permita inicializar todos os atributos, se isso for útil

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String newCpf){
        cpf = newCpf;
    }
}
