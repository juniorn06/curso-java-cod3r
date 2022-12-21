package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        System.out.print("Informe o valor da temperatura em fahrenheit: ");
        int f = sc.nextInt();

        double c = (f - AJUSTE) * FATOR;

        System.out.printf("Temperatura em Celsius: %.1f",  c);
    }
}
