package streams;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.00");

        Instrumento i1 = new Instrumento("Guitarra", "Tagima TG 530", 1150.32, 2);
        Instrumento i2 = new Instrumento("Guitarra", "Fender Player MN", 8490.0, 5);
        Instrumento i3 = new Instrumento("Violão", "Violão Takamine GD71CE", 4027.0, 6);
        Instrumento i4 = new Instrumento("Contrabaixo", "Squier Affinity", 3617.25, 0);
        Instrumento i5 = new Instrumento("Bateria", "Nagano Garage Rock", 4499.0, 3);

        List<Instrumento> instrumentos = Arrays.asList(i1, i2, i3, i4, i5);
        Predicate<Instrumento> maiorPreco = p -> p.preco >= 3000.0;
        Predicate<Instrumento> temEstoque = p -> p.quantidade > 0;
        Function<Instrumento, String> produtoPromocao = p -> "Produto em promoção: " + p.modelo + ", R$ " + df.format(p.precoComDesconto());

        instrumentos.stream().filter(maiorPreco).filter(temEstoque).map(produtoPromocao).forEach(System.out::println);
    }
}
