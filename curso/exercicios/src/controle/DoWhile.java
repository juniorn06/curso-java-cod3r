package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = "";
        System.out.println("Para sair, você precisa das palavras mágicas...");

        do {
            System.out.print("Deseja sair? ");
            palavra = sc.nextLine();
        } while (!palavra.equalsIgnoreCase("por favor"));

        System.out.println("Até a próxima!");
        sc.close();

    }
}
