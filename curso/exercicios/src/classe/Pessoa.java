package classe;

public class Pessoa {

    //nome, peso
    //método comer = comida + peso

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
    }
}
