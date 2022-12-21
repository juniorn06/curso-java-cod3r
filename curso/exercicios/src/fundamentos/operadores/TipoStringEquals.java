package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da String: ");
        String s2 = sc.nextLine();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));
    }
}
