package edu.Introducao.TiposEstrutuas;

// import java.util.Scanner;

public class MinhaClasse{
    //Estruturas condicionais: if, else, switch-case
    //Estrutuas de repetição: for, while, do-while
    //Estrturas de exceções: try - catch - finally, throw

    public static void main(String [] args) throws Exception{
    //// Condição Simples
        
    /** 
    *    Scanner scanner = new Scanner(System.in);
    *    double saldo = 0;
    *    double saque = 0;
    *    System.out.println("Informe o saldo em conta: ");
    *    saldo = scanner.nextDouble();
    *    System.out.println("Informe o valor do saque: ");
    *    saque = scanner.nextDouble();

    *    if(saldo < saque){
    *        System.out.println("Saldo indisponível para saque");
    *    }
    *    else{
    *        System.out.println("Saque efetuado: saldo - R$ " + (saldo-saque));
    *    }
    *    scanner.close();
    */

    //// Condição Ternária

    /**     
    *int nota  = 6;
    *String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "Recuperação" : *"Reprovado";
    *System.out.print(resultado);
    */

    //// Switch case

    /** 
    String sigla = "M";
    switch (sigla) {
        case "P":
        {
            System.out.println("Pequeno");
            break;
        }
        case "M":
        {
            System.out.println("Médio");
            break;
        }
        case "G":
        {
            System.out.println("Grande");
            break;
        }
        default:
        System.out.println("Tamanho não disponível");
    }
    */

    //// Repetição


    //For
    // for(int i = 0; i < 5; i++){
    //     for(int j = 0; j <=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }

    // For arr
    String alunos[] = {"BERNARDO", "GREICE", "JUIO", "GABRIELA"};
    // for(int i =0; i<alunos.length; i++){
    //     System.out.println("Aluno: " + alunos[i] + ", de índice " + i);
    // }
    // OUU
    for(String aluno : alunos){
        System.out.println("Aluno: " + aluno);
    }

    //// Exceções

    // try {     -> tenta executar
    //     int result = 10 / 0; 
    // } catch (ArithmeticException e) {  -> caso de erro de execução, catch trata
    //     System.out.println("Não é possível dividir por zero.");
    // }
    } 
}