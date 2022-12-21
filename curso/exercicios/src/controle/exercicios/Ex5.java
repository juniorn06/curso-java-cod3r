package controle.exercicios;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        //Refatorar o exercício 04, utilizando a estrutura switch.

        Scanner sc = new Scanner(System.in);
        int divisores = 0;

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        switch (divisores){
            case 0:
                System.out.println();
        }
    }
}
