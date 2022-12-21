package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double n1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe o segundo valor: ");
        double n2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe a operação desejada(+, -, *, /, %): ");
        String operacao = sc.next();

        double resultado = "+".equals(operacao) ? n1 + n2 : 0;
        resultado = "-".equals(operacao) ? n1 - n2 : resultado;
        resultado = "*".equals(operacao) ? n1 * n2 : resultado;
        resultado = "/".equals(operacao) ? n1 / n2 : resultado;
        resultado = "%".equals(operacao) ? n1 % n2 : resultado;

        System.out.printf("Resultado da operacão: %.2f", resultado);

        sc.close();

    }
}
