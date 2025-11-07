package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp20 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP20 - Números de Fibonacci (n termos)");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();

        int t1 = 0;
        int t2 = 1;

        System.out.println("Os " + n + " primeiros termos de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
        System.out.println();
        scanner.close();
    }
}
