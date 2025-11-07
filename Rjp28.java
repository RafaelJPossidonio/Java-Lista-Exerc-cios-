package RafaeldeJesusPossidonio;

public class Rjp28 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP28 - Soma dos pares entre 1 e 100");
        System.out.println("*******************************************************************");

        int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("A soma dos pares de 1 a 100 e: " + soma);
    }
}
