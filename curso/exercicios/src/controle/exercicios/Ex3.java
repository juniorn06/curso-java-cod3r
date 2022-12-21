package controle.exercicios;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        //Criar um programa que receba duas notas parciais, calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // caso contrário imprime no console "Reprovado".

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10){
            System.out.print("Valor inválido! Informe uma nota de 0 a 10: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        while (nota2< 0 || nota2 > 10){
            System.out.print("Valor inválido! Informe uma nota de 0 a 10: ");
            nota2 = sc.nextDouble();
        }

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0){
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 7.0) {
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Recuperação");
        } else {
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Reprovado");
        }
    }
}
