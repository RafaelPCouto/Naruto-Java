package konoha.bank;

//TODO: testar as classes

public class Main {

    public static void main(String[] args) {
        ContaPoupanca conta01 = new ContaPoupanca(20, TipoConta.POUPANCA);
        conta01.getSaldo();
        conta01.depositar(1000);
        conta01.getSaldo();
    }
}
