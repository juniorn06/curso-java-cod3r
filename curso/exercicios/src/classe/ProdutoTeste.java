package classe;


public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 5214.50, 0.25);

        var p2 = new Produto();
        p2.nome = "Mouse sem Fio";
        p2.preco = 125.75;
        p2.desconto = 0.35;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaFinal = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.printf("Média do carrinho = %.2f", mediaFinal);
    }
}
