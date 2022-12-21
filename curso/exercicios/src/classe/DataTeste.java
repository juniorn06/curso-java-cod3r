package classe;

import java.util.Scanner;

public class DataTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Data d1 = new Data(30, 3, 2020);
        Data d2 = new Data();
        System.out.println("Informe uma data:");

        System.out.print("Dia: ");
        d2.dia = sc.nextInt();
        sc.nextLine();
        System.out.print("Mês: ");
        d2.mes = sc.nextInt();
        System.out.print("Ano: ");
        d2.ano = sc.nextInt();

        Data d3 = new Data();

        System.out.println("Data 1: " + d1.dataFormatada());
        System.out.println("Data 2: " + d2.dataFormatada());
        System.out.println("Data default: " + d3.dataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
