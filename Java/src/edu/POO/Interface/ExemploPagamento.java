package edu.POO.Interface;

public class ExemploPagamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        Pagamento pagamentoPix = new PagamentoPix();
        Recibo reciboPix = new PagamentoPix();
        conta.realizarPagamento(pagamentoPix, reciboPix, 200.0);

        Pagamento boleto = new BoletoBancario();
        Recibo reciboBoleto = new BoletoBancario();
        conta.realizarPagamento(boleto, reciboBoleto, 300.0);

        Pagamento cartao = new CartaoCredito();
        Recibo reciboCartao = new CartaoCredito();
        conta.realizarPagamento(cartao, reciboCartao, 400.0);

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}

