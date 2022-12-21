package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("Área do triângulo: %.2f", area);

        sc.close();
    }
}
