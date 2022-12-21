package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana Luiza");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Tagima JA1", 7000.0, 1);
        compra1.adicionarItem("Takamine GD12CE", 2879.10, 1);
        c1.compras.add(compra1);

        Cliente c2 = new Cliente("Junior");

        Compra compra2 = new Compra();
        compra2.adicionarItem("MacBook Air", 13000.0, 1);
        compra2.adicionarItem("Monitor LG 29WL500", 1299.0, 1);
        c2.compras.add(compra2);

        System.out.println(c1);
        System.out.println(c2);

    }
}
