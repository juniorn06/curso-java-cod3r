package controle;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num % 2 == 0){
            System.out.println("O número informado é par");
        } else {
            System.out.println("O número informado é ímpar");
        }

        sc.close();
    }
}
