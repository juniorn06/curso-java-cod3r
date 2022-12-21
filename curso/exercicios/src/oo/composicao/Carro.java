package oo.composicao;

public class Carro {

    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar(){
        if (motor.fatorDeInjecao < 2.6){
        motor.fatorDeInjecao += 0.4;
        }
    }

    void frear(){
        if (motor.fatorDeInjecao > 0.5){
        motor.fatorDeInjecao -= 0.4;
        }
    }

    void ligado(){
        motor.ligado = true;
    }

    void desligado(){
        motor.ligado = false;
    }

    boolean estaligado(){
        return motor.ligado;
    }
}
