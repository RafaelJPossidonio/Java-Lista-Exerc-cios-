package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp30 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP30 - Menu até escolher sair");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);

        String escolha = "";

        while (!escolha.equalsIgnoreCase("sair") && !escolha.equals("3")) {
            System.out.println("\nMENU");
            System.out.println("1: Opcao 1");
            System.out.println("2: Opcao 2");
            System.out.println("3: Sair");
            System.out.print("Escolha uma opcao (digite '3' ou 'sair' para parar): ");

            escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Voce escolheu a Opcao 1.");
                    break;
                case "2":
                    System.out.println("Voce escolheu a Opcao 2.");
                    break;
                case "3":
                case "sair":
                case "Sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
