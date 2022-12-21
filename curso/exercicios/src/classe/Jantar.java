package classe;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 15.0);

        Comida c1 = new Comida("Arroz", 0.225);
        Comida c2 = new Comida("Feijão", 0.125);

        System.out.println("Peso antigo: " + p1.peso);

        p1.comer(c1);
        p1.comer(c2);

        System.out.println("Novo peso: " + p1.peso);


    }
}
