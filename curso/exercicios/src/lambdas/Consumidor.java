package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);

        Produto p1 = new Produto("Notebook", 3650.58, 0.25);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Teclado", 157.87,0.09);
        Produto p3 = new Produto("HeadPhone", 249.20,0.15);
        Produto p4 = new Produto("Monitor", 1385.41,0.10);
        Produto p5 = new Produto("Ipad", 7099.0,0.20);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        System.out.println();
        produtos.forEach(imprimirNome);
        System.out.println();
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println();
        produtos.forEach(System.out::println);
    }
}
