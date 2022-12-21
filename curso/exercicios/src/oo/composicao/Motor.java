package oo.composicao;

public class Motor {

    final Carro carro;
    double fatorDeInjecao = 1;
    boolean ligado = false;

    Motor(Carro carro){
        this.carro = carro;
    }

    int giros() {
        if (!ligado){
            return 0;
        } else{
            return (int)Math.round(fatorDeInjecao * 3000);
        }
    }
}
