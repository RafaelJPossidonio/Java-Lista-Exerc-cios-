package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp40 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP40 - Ler números e mostrar o maior (até digitar negativo)");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = 0;

        do {
            System.out.print("Digite um numero (negativo para parar): ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

        } while (numero >= 0);

        System.out.println("O maior numero positivo digitado foi: " + maior);
        scanner.close();
    }
}
