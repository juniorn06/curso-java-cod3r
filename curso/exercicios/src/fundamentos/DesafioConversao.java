package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro salário: ");
        String s1 = sc.nextLine().replace(",", ".");
        System.out.print("Informe o valor do segundo salário: ");
        String s2 = sc.nextLine().replace(",", ".");
        System.out.print("Informe o valor do terceiro salário: ");
        String s3 = sc.nextLine().replace(",", ".");

        double sal1 = Double.parseDouble(s1);
        double sal2 = Double.parseDouble(s2);
        double sal3 = Double.parseDouble(s3);

        double soma = sal1 + sal2 + sal3;
        double media = soma / 3;

        System.out.printf("Soma dos salários: %.2f\n", soma);
        System.out.printf("Média dos salários %.2f", media);

        sc.close();
    }
}
