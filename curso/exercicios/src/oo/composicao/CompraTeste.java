package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compras1 = new Compra();
        compras1.adicionarItem(new Item("Processador AMD Ryzen 3600", 1, 1057.65));
        compras1.adicionarItem(new Item("Crucial Ballistix 8GB 3000 MHz", 2, 271.15));
        compras1.adicionarItem(new Item("SSD Kingston 500GB M.2 NVMe", 2, 271.15));

        System.out.println(compras1.itens.size());
        System.out.println(compras1.obterValorTotal());
    }
}
