package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp38 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP38 - Confirmar saída com 's'");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("\n-- MENU PRINCIPAL --");
            System.out.println("Processando dados...");
            System.out.println("--------------------");
            System.out.print("Deseja sair do sistema? (s/n): ");
            resposta = scanner.nextLine();

        } while (!resposta.equalsIgnoreCase("s"));

        System.out.println("Encerrando o sistema...");
        scanner.close();
    }
}
