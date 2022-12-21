package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double a = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o valor de B: ");
        double b = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o valor de C: ");
        double c = sc.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Valor de Delta: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        sc.close();
    }
}
