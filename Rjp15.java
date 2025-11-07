package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp15 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP15 - Fatorial de um número");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        if (numero < 0) {
            System.out.println("Não é possível calcular fatorial de número negativo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}
