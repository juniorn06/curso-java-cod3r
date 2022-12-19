package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(7,7,7);

        tabuleiro.alterarMarcacao(4,4);
        tabuleiro.alterarMarcacao(4,5);
        tabuleiro.abir(3,3);
        System.out.println(tabuleiro);

    }
}
