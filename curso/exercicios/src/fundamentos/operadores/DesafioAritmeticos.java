package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double  a = Math.pow((6 * (3 + 2)), 2) / (3 * 2);

        double  b = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

        double c = Math.pow((a - b), 3) /  Math.pow(10, 3);

        System.out.println(c);


        /* solução professor
        double numA = Math.pow(6 *(3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior =  Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;
        System.out.println("O resultado é " + resultado); */
    }
}
