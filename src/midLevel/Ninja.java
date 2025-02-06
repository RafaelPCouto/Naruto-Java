package midLevel;

public class Ninja {

    String nome, missao, nivelDificuldade, statusMissao;
    int idade;

    public void mostrarInformacoes(String[] args) {
        System.out.println("Nome: "+ nome+ "\nMissão: "+ missao+ "Dificuldade: "+ nivelDificuldade+ " Status: "+ statusMissao);
        System.out.println("Idade: "+idade);
    }


}
