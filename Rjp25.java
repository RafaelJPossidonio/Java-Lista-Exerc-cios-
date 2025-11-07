package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp25 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP25 - Tabuada com while");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a tabuada:");
        int numero = scanner.nextInt();
        int i = 1;

        System.out.println("Tabuada do " + numero + ":");
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        scanner.close();
    }
}
