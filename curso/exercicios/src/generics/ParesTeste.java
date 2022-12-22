package generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Ana");
        resultadoConcurso.adicionar(2, "Cati");
        resultadoConcurso.adicionar(3, "Rute");
        resultadoConcurso.adicionar(4, "Junior");
        resultadoConcurso.adicionar(2, "Helena");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));

    }
}
