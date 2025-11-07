package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp26 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP26 - Número primo com while");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se e primo:");
        int numero = scanner.nextInt();
        boolean ePrimo = true;

        if (numero <= 1) {
            ePrimo = false;
        } else {
            int i = 2;
            while (i <= numero / 2) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
                i++;
            }
        }

        if (ePrimo) {
            System.out.println(numero + " e primo.");
        } else {
            System.out.println(numero + " nao e primo.");
        }
        scanner.close();
    }
}
