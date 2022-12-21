package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.println("Bom dia");

        System.out.println("\nBom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d  %d %n", 2, 4, 6, 8, 10, 12);
        System.out.printf("Salário: %.1f\n", 12345.6);
        System.out.printf("Nome: %s\n", "Ana Luiza");

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String name = sc.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String lastName = sc.nextLine();
        System.out.print("Informe sua idade: ");
        int age = sc.nextInt();

        System.out.printf("%s %s tem %d anos.%n", name, lastName, age);



    }
}
