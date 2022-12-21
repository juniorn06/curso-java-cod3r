package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double nota = 0, total = 0;

        while (nota != -1){
            System.out.print("Informe o valor da nota (-1: sair) ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                total += nota;
                cont++;
            } else if (nota != -1){
                System.out.println("Valor inválido! Informe uma nota de 0 a 10! ");
            }
        }

        double media = total / cont;
        System.out.println("Total de notas válidas: " + cont);
        System.out.printf("A médias das notas é: %.1f", media);

        sc.close();
    }
}
