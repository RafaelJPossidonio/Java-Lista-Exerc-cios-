package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp19 {

    public static void main(String[] args) {

        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP19 - Verificar se um número é primo");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (numero <= 1 || divisores > 2) {
            System.out.println(numero + " não é um número primo.");
        } else {
            System.out.println(numero + " é um número primo.");
        }
        scanner.close();
    }
}
