package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdNotas, qtdAlunos;
        double total = 0;

        System.out.print("Informe a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe a quantidade de notas por aluno: ");
        qtdNotas = sc.nextInt();

        double[][] notasAlunos = new double[qtdAlunos][qtdNotas];

        for (int i = 0; i < notasAlunos.length; i++) {
                System.out.println("Notas aluno " + (i + 1) + " ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                notasAlunos[i][j] = sc.nextDouble();
                total += notasAlunos[i][j];
            }
        }

        double mediaTurma = total / (qtdAlunos * qtdNotas);
        System.out.printf("\nMédia da turma: %.1f", mediaTurma);

        for (double[] notasAluno: notasAlunos) {
            System.out.println(Arrays.toString(notasAluno));
        }

        sc.close();
    }
}
