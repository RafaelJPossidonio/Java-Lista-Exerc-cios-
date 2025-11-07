package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp24 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP24 - Verificar se um número é positivo");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero positivo:");
        numero = scanner.nextInt();

        while (numero <= 0) {
            System.out.println("Numero invalido. Digite um numero POSITIVO:");
            numero = scanner.nextInt();
        }

        System.out.println("Voce digitou um numero positivo: " + numero);
        scanner.close();
    }
}
