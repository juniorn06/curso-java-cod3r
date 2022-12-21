package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("João", 8.1);
        Aluno a4 = new Aluno("Gabi", 7.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> notas = a -> a.nota;
        BinaryOperator<Double> soma = Double::sum;

        alunos.stream().filter(aprovado).map(notas).reduce(soma).ifPresent(System.out::println);
    }
}
