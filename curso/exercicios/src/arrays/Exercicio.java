package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.8;
        notasAlunoA[1] = 6.7;
        notasAlunoA[2] = 9.8;
        notasAlunoA[3] = 9.1;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        double mediaAlunoA = totalAlunoA / notasAlunoA.length;
        System.out.printf("Média do aluno A: %.1f", mediaAlunoA);

        final double notaArmazenada = 8.7;
        double[] notasAlunoB = { 7.8, 8.1, notaArmazenada, 9.6 };

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        double mediaAlunoB =  totalAlunoB / notasAlunoB.length;
        System.out.printf("\nMédia do aluno B: %.1f", mediaAlunoB);
    }
}
