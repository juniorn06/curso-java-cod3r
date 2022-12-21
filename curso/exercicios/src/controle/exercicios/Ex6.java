package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        /*Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
         O Jogador tem 10 tentativas para adivinhar o número gerado.
         Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
         */

        Scanner sc = new Scanner(System.in);
        int cont = 10;
        int sorteado;
        Random random = new Random();
        sorteado = random.nextInt(101);


        System.out.print("Adivinhe o número secreto de 0 a 100: ");
        int num = sc.nextInt();
        sc.nextLine();

            while (cont >= 1){
            if (num == sorteado){
            System.out.println("Parabéns! Vorcê adivinhou o número!");
            break;
            } else if (num > sorteado){
                System.out.println("Número incorreto! O número informado é menor que " + num + " e você tem " + cont + " tentativas!");
                num = sc.nextInt();
            }
            else if (num < sorteado){
                System.out.println("Número incorreto! O número informado é maior que " + num + " e você tem " + cont + " tentativas!");
                num = sc.nextInt();
            }
            else {
                System.out.println("O número sorteado foi: " + sorteado + ". Tente novamente!");
            }
            cont--;
        }

    }
}
