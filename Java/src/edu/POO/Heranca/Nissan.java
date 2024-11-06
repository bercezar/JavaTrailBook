package edu.POO.Heranca;

public class Nissan extends Automovel{
    private String chassi;
    

    // Método construtor da Nissan
    public Nissan(String chassi){
        this.chassi = chassi;
    }

    // Como estou acessandodo fora da Classe, no caso da main, preciso que seja público
    public String getChassi(){
        return chassi;
    }


    public static void main (String []args){
        Automovel auto = new Automovel();
        Nissan carro = new Nissan("34190c3512cn");

        auto.ligar();
        System.out.println("Carro - " + carro.getChassi());
    }
}
