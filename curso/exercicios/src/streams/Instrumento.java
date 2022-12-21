package streams;

import java.text.DecimalFormat;

public class Instrumento {

    final String tipo;
    final String modelo;
    final double preco;
    final int quantidade;

    public Instrumento(String tipo, String modelo, double preco, int quantidade) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double precoComDesconto() {
        double desconto = 0;
        if (preco >= 3000.0) {
            desconto = preco * (1 - 0.20);
        }
        return desconto;
    }
}