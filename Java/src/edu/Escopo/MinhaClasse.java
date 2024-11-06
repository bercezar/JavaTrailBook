package edu.Escopo;

public class MinhaClasse {
    //Ambiente onde uma variável pode ser acessada
    int a = 2;
    public void main(String [] args) throws Exception{
        int b = 4;
        int c = a + b;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        calcular(c);
    }
    public void calculo(String [] args) throws Exception{
        // int d = c + 5; Escopo diferente, int c se trata de uma variável local
    }

    public void calcular(int c){
        int d = c + a; // Utilizando um função, podemos passar como parametros as variáveis locais. Não distante disso, a variável global pode ser usada sem a necessidade de passar como parâmetro
        System.out.println(d);
    }

}
