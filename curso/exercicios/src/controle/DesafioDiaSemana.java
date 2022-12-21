package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        // Domingo - 1
        // Quarta - 4

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = sc.nextLine();

        if (dia.equals("Domingo")){
            System.out.println("Número correspondente: " + 1);
        } else if (dia.equalsIgnoreCase("Segunda-Feira")) {
            System.out.println("Número correspondente: " + 2);
        } else if (dia.equalsIgnoreCase("Terça-Feira")) {
            System.out.println("Número correspondente: " + 3);
        } else if (dia.equalsIgnoreCase("Quarta-Feira")) {
            System.out.println("Número correspondente: " + 4);
        } else if (dia.equalsIgnoreCase("Quinta-Feira")) {
            System.out.println("Número correspondente: " + 5);
        } else if (dia.equalsIgnoreCase("Sexta-Feira")) {
            System.out.println("Número correspondente: " + 6);
        } else if (dia.equals("Sábado")) {
            System.out.println("Número correspondente: " + 7);
        }
        else {
            System.out.println("Diá inválido!");
        }
    }
}
