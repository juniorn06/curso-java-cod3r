package controle.exercicios;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        //Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Scanner sc = new Scanner(System.in);

        int maiorNum = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Informe um número: ");
            int num = sc.nextInt();

            if (num > maiorNum){
                maiorNum = num;
            }
        }

        System.out.println("O maior número informado foi: " + maiorNum);
    }
}
