package edu.POO.Interface;

public class BoletoBancario implements Pagamento, Recibo {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto bancário gerado para pagamento de R$" + valor);
    }

    @Override
    public void gerarRecibo(double valor) {
        System.out.println("Recibo gerado para boleto bancário: R$" + valor);
    }
}
