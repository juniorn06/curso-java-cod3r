package fundamentos;

import java.util.Scanner;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        String n1 = sc.nextLine();
        System.out.print("Informe o segundo valor: ");
        String n2 = sc.nextLine();

        System.out.println(n1 + n2);

        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        double soma = num1 + num2;

        System.out.printf("Soma: %.2f\n",  soma);
        System.out.printf("Média: %.2f",  soma / 2);



    }
}
