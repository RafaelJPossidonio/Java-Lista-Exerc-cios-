package RafaeldeJesusPossidonio;

import java.util.Locale;
import java.util.Scanner;

public class Rjp05 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP05 - Notas e aprovação");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média é: " + media);

        if (media >= 7.0) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }

        scanner.close();
    }
}
