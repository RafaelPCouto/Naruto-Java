package konoha.bank;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void getSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado");
    }
}
