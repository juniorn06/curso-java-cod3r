package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {

    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);

        System.out.print("Informe um  valor: ");
        double valor = sc.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("Valor ao quadrado: %.2f\n", quadrado);
        System.out.printf("Valor ao cubo: %.2f", cubo);

        sc.close();
    }
}
