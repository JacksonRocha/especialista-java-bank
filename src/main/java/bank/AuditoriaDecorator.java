package bank;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantidadeDeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeDeOperacoes() {
        return quantidadeDeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantidadeDeOperacoes++;
        getContaOriginal().sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeDeOperacoes++;
        getContaOriginal().depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantidadeDeOperacoes++;
        getContaOriginal().transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        quantidadeDeOperacoes++;
        getContaOriginal().aplicarEmInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {

    }
}
