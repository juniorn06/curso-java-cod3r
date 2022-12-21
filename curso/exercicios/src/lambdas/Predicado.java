package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)) >= 750;

        Produto p1 = new Produto("Notebook", 3893.85, 0.15);
        System.out.println(isCaro.test(p1));
    }
}
