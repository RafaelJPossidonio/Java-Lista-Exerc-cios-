package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp35 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP35 - Número positivo obrigatório ");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um numero positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Invalido. O numero deve ser positivo.");
            }

        } while (numero <= 0);

        System.out.println("Voce digitou o numero positivo: " + numero);
        scanner.close();
    }
}
