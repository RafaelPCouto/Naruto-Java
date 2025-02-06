package konoha.bank;

public abstract class ContaBancaria implements Conta {

    double saldo;
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
}
