package controle.exercicios;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        /*7. Criar um programa que enquanto estiver recebendo números positivos,
         imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
         */

        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

       do {
           System.out.print("Informe um número positivo: ");
           num = sc.nextInt();
           if (num >= 0){
               soma += num;
               System.out.println("Soma dos números: " + soma);
           }
       } while (num >= 0);
    }
}
