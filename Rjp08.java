package RafaeldeJesusPossidonio;

import java.util.Scanner;

public class Rjp08 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Rafael de Jesus Possidonio - RA : 0023738");
        System.out.println("* Classe RJP08 - Login simples");
        System.out.println("*******************************************************************");

         String usuario = "igor";
         String senha = "senha123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuarioDigitado = scanner.next();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.next();

        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        scanner.close();
    }
}
