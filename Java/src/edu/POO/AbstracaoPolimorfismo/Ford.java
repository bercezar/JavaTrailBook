package edu.POO.AbstracaoPolimorfismo;

class Ford extends Automovel{
    
    @Override
    public void carro(){ // Esta abstração mantem a mesma assinatura da classe abstrata
        //SOBREPOSIÇÃO - polimorfismo: Ocorre quando uma classe derivada fornece uma implementação específica de um método que já foi definido na classe base.
        System.out.println("Ford");
    }
    private String chassi;
    

    public Ford(String chassi){
        this.chassi = chassi;
    }

    public String getChassi(){
        return chassi;
    }


    public static void main (String []args){
        // Classe abstrata não é instanciada!! 
        // Como em toda abstração há uma herança, c classe Ford herda os métodos de Automóvel, logo, instanciando Ford têm-se esses métodos.
        Ford carro = new Ford("13111c3988cf");

        carro.carro();
        carro.ligar();
        System.out.println("Carro - " + carro.getChassi());
    }
}