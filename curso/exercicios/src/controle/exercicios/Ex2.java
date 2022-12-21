package controle.exercicios;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        //Criar um programa informa se o ano atual é um ano bissexto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 ==0 && ((ano % 100) == 1 || ano % 400 ==0)){
            System.out.println("O ano " + ano + " é bissexto.");
        }
        else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
