package konoha.bank;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void getSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void setSaldo(double valor) {


        System.out.println("Saldo alterado");
    }
}
