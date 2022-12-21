package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.1f", fahrenheit);

        sc.close();
    }
}
