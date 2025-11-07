package RafaeldeJesusPossidonio;

import java.util.Locale;
import java.util.Scanner;

public class Rjp01 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP01 - Número positivo ou negativo");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira um número inteiro:");
        int n1 = scanner.nextInt();

        if(n1 > 0){
            System.out.println("O número é positivo!");
        }else if(n1 == 0){
            System.out.println("O seu número é 0, nulo");
        }else{
            System.out.println("O seu número é negativo");
        }


        scanner.close();
    }
}
