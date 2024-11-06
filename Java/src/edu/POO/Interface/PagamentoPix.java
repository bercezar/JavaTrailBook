package edu.POO.Interface;

public class PagamentoPix implements Pagamento, Recibo {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix de R$" + valor + " processado.");
    }

    @Override
    public void gerarRecibo(double valor) {
        System.out.println("Recibo gerado para pagamento via Pix: R$" + valor);
    }
}
