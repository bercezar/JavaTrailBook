package edu.POO.Interface;

public class CartaoCredito implements Pagamento, Recibo {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito de R$" + valor + " processado.");
    }

    @Override
    public void gerarRecibo(double valor) {
        System.out.println("Recibo gerado para pagamento com cartão de crédito: R$" + valor);
    }
}
