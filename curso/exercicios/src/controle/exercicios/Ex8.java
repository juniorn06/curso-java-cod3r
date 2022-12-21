package controle.exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        //Criar um programa que receba uma palavra e imprime no console letra por letra.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}
