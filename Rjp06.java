package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp06 {

        public static void main(String[] args) {
            System.out.println("*******************************************************************");
            System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
            System.out.println("* Classe RJP06 - Múltiplo de 3 e/ou 5");
            System.out.println("*******************************************************************");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("Múltiplo de 3 e de 5.");
            } else if (numero % 3 == 0) {
                System.out.println("Múltiplo de 3.");
            } else if (numero % 5 == 0) {
                System.out.println("Múltiplo de 5.");
            } else {
                System.out.println("Não é múltiplo de 3 nem de 5.");
            }


        }


}
