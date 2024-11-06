package edu.POO.AbstracaoPolimorfismo;

abstract class Automovel {
    private boolean motor = false;

    public abstract void carro();

    public void ligar(){
        if (!motor){
            motor = true;
            System.out.println("Motor ligado");
        }
            
        else
            System.out.println("Motor já está ligado");
    }

    public void desligar(){
        if (motor){
            motor = false;
            System.out.println("Motor desligado");
        }

        else
            System.out.println("Motor já está desligado");
    }
}
