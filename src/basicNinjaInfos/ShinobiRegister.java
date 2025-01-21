package basicNinjaInfos;
import java.util.Scanner;
import java.util.ArrayList;

public class ShinobiRegister {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int option = 0;
        ArrayList<String> ninjasKonoha = new ArrayList<>();


        while (option != 3) {

            // MENU

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:

                    System.out.println("Digite o nome do Ninja:");
                    ninjasKonoha.add(keyboard.nextLine());
                    break;
                case 2:
                    for (String ninja : ninjasKonoha) {
                        System.out.print("Ninja: "+ ninja+ "\n");
                    }
                    break;
                case 3:
                    option = 3;
                    break;
                default:
                    System.out.println("Número inválido, tente novamente.");
            }

        }

        keyboard.close();
    }

}
