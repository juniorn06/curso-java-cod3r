package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("Valor do IMC: %.2f", imc);

        sc.close();
    }
}
