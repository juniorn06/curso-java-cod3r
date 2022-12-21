package controle.exercicios;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número de 0 a 10: ");
        int num = sc.nextInt();

        if (num < 0 || num > 10){
            System.out.println("O número informado não está dentro do intervalo de 0 a 10");
        } else if (num % 2 == 1) {
            System.out.println("O número informado está no intervalo de 0 a 10, mas não é par.");
        }
        else {
            System.out.println("O número informado é par.");
        }

        sc.close();
    }
}
