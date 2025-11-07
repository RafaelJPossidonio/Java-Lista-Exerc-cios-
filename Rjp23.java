package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp23 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP23 - Senha correta");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String tentativa;

        System.out.println("Digite a senha:");
        tentativa = scanner.nextLine();

        while (!tentativa.equals(senhaCorreta)) {
            System.out.println("Senha incorreta.");
            System.out.println("Digite a senha:");
            tentativa = scanner.nextLine();
        }

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}
