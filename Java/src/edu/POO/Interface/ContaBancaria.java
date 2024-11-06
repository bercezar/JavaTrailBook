package edu.POO.Interface;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void realizarPagamento(Pagamento pagamento, Recibo recibo, double valor) {
        if (saldo >= valor) {
            pagamento.processarPagamento(valor);
            recibo.gerarRecibo(valor);
            saldo -= valor;
            System.out.println("Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
