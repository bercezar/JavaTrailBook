package edu.Operadores;

public class MinhaClasse {
    public static void main(String [] args) throws Exception{
        int numero = 6;
        numero++;
        System.out.print(numero); //7
        System.out.print("\n");
        System.out.print(numero++); //7
        System.out.print("\n");
        System.out.print(numero); //8
        System.out.print("\n");

        boolean variavel = true;
        System.out.print(variavel);
        System.out.print(!variavel);
        System.out.print("\n");

        int a, b;
        a = 5;
        b = 6;

        String res = a == b ? "verdade" : "falso";
        System.out.print(res);
        System.out.print("\n");

        boolean simNao = a == b;
        if(simNao){
            System.out.print(simNao);
        }
        else{
            System.out.print(simNao);
        }
//Podendo fazer validação nas próprias variáveis
        boolean naoSim = a != b;
        if(naoSim){
            System.out.print(naoSim);
        }
        else{
            System.out.print(naoSim);
        }
    } 
}
