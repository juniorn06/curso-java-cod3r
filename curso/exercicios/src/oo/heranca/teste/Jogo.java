package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Heroi heroi = new Heroi(20, 20);

        Monstro monstro = new Monstro();
        monstro.x = 20;
        monstro.y = 21;

        System.out.println("HP Herói: " + heroi.vida);
        System.out.println("HP Monstro: " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        monstro.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        System.out.println();
        System.out.println("HP Herói: " + heroi.vida);
        System.out.println("HP Monstro: " + monstro.vida);

    }
}
