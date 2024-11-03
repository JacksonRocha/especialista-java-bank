package bank;

public class ContaPoupanca implements Conta {

    private double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.saldo -= valor + 40;
        conta.depositar(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        this.saldo -= valor;
    }

    public void sacarTarifa(double valorTarifa) {
        this.saldo -= valorTarifa;
    }
}
