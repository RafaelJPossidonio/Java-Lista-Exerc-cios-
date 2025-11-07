package RafaeldeJesusPossidonio;

import java.util.Locale;
import java.util.Scanner;

public class Rjp07 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP07 - Triângulo válido");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o comprimento do lado 1: ");
        double l1 = scanner.nextDouble();
        System.out.print("Digite o comprimento do lado 2: ");
        double l2 = scanner.nextDouble();
        System.out.print("Digite o comprimento do lado 3: ");
        double l3 = scanner.nextDouble();

        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        scanner.close();

    }
}
