package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp27 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP27 - Quantidade de números ímpares digitados");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int impares = 0;

        System.out.println("Digite 10 numeros:");

        while (contador < 10) {
            System.out.print("Numero " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                impares++;
            }
            contador++;
        }

        System.out.println("Voce digitou " + impares + " numeros impares.");
        scanner.close();
    }
}
