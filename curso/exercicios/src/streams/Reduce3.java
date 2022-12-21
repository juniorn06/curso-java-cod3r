package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("João", 8.1);
        Aluno a4 = new Aluno("Gabi", 7.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> notas = a -> a.nota;

        BinaryOperator<Media> combinarMedia = Media::combinar;
        BiFunction<Media, Double, Media> calcularMedia = Media::adicionar;

        Media media = alunos.parallelStream().filter(aprovado).map(notas).reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média do aluno é: " + media.getValor());

    }
}
