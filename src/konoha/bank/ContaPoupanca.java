package konoha.bank;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        valor *= 0.09;
        saldo += valor;
        System.out.println("Valor depositado (com desconto de 1%)");
    }

    @Override
    public void getSaldo() {
        System.out.println("Saldo: R$ " + this.saldo);
    }
}
