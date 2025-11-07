package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp10 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP10 - Ano bissexto");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano (ex: 2024): ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }
}
