package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp37 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP37 - Soma até o número ser múltiplo de 10");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um numero (multiplo de 10 para parar): ");
            numero = scanner.nextInt();
            soma += numero;

        } while (numero % 10 != 0);

        System.out.println("A soma total e: " + soma);
        scanner.close();
    }
}
