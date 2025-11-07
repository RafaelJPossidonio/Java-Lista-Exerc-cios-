package RafaeldeJesusPossidonio;

import java.util.Locale;
import java.util.Scanner;

public class Rjp09 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP09 - Ordem crescente (três números)");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro número (A): ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número (B): ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro número (C): ");
        double c = scanner.nextDouble();

        System.out.println("Números em ordem crescente:");

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(a + ", " + b + ", " + c);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

        scanner.close();

    }
}
