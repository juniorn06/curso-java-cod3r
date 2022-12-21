package controle.exercicios;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        //Criar um programa que receba um número e diga se ele é um número primo.

        Scanner sc = new Scanner(System.in);
        int divisores = 0;

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 0){
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }
    }
}
