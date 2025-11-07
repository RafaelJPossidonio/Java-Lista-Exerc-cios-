package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp29 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP29 - Contar dígitos de um número");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int qtdDigitos = String.valueOf(numero).length();

        System.out.println("O número tem " + qtdDigitos + " dígitos.");

        scanner.close();
    }
}
