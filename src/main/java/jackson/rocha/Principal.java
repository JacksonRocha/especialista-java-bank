package jackson.rocha;

import bank.Conta;
import bank.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.transferir(conta2, 100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo());

    }
}
