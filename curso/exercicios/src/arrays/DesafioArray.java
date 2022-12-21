package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        //Perguntar quantas notas serão informadas
        //primeiro laço: armazenar notas
        //segundo for: soma das notas

        Scanner sc = new Scanner(System.in);
        double total = 0, media;
        int qtd;

        System.out.print("Quantas notas serão informadas? ");
        qtd = sc.nextInt();
        sc.nextLine();

        double[] notas = new double[qtd];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        for (double nota: notas) {
            total += nota;
        }

        media = total / notas.length;

        System.out.printf("A média das notas do aluno é: %.1f", media);
    }
}
