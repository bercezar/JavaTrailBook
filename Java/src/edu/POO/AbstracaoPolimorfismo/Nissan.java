package edu.POO.AbstracaoPolimorfismo;

class Nissan extends Automovel{
    @Override
    public void carro(){// Esta abstração mantem a mesma assinatura da classe abstrata
        //SOBREPOSIÇÃO - polimorfismo: Ocorre quando uma classe derivada fornece uma implementação específica de um método que já foi definido na classe base.
        System.out.println("Nissan");
    }
    private String chassi;
    

    public Nissan(String chassi){
        this.chassi = chassi;
    }

    public String getChassi(){
        return chassi;
    }


    public static void main (String []args){
        // Classe abstrata não é instanciada!! 
        // Como em toda abstração há uma herança, c classe Nissan herda os métodos de Automóvel, logo, instanciando Nissan têm-se esses métodos.
        Nissan carro = new Nissan("34190c3512cn");

        carro.carro();
        carro.ligar();
        System.out.println("Carro - " + carro.getChassi());
    }
}