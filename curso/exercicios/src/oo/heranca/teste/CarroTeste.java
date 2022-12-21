package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(350);
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        System.out.println(ferrari.velocidadeDoAr());
        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        Carro civic = new Civic();
        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        System.out.println();

        ferrari.frear();
        System.out.println(ferrari);

        civic.frear();
        System.out.println(civic);

    }
}
