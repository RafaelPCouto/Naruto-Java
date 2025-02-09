package konoha.bank;

public abstract class ContaBancaria implements Conta {

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
}
