package oo.heranca.desafio;

public class Carro {

    public int velocidadeAtual;

    protected final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

   public void frear(){
        if (velocidadeAtual > 5){
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual: " + velocidadeAtual + "Km/h.";
    }
}
