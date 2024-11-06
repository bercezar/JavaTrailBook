package edu.POO.Heranca;

public class Automovel {
    private boolean motor = false;


    public void ligar(){
        if (motor == false){
            motor = true;
            System.out.println("Motor ligado");
        }
            
        else
            System.out.println("Motor já está ligado");
    }

    public void desligar(){
        if (motor == true){
            motor = false;
            System.out.println("Motor desligado");
        }

        else
            System.out.println("Motor já está desligado");
    }


}
