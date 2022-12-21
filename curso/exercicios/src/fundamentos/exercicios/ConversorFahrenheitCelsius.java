package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFahrenheitCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura em Fahrenheit: ");
        double fahr = sc.nextDouble();
        double ajuste = 32;
        double fator = 5.0 / 9.0;

        double celsius = (fahr - ajuste) * fator;
        System.out.printf("Temperatura em Celsius: %.1f", celsius);

        sc.close();
    }
}
