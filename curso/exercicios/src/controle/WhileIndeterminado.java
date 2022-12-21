package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor informado: ");
        String st = sc.nextLine();

        while (!st.equalsIgnoreCase("sair")){
            System.out.print("Valor informado: ");
            st = sc.nextLine();
        }

        sc.close();
    }
}
