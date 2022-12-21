package oo.encapsulamento.casaA;

public class Paulo  extends Ana{

    //método teste acessos
    //segredo
    //facoDentroDeCasa
    // formaDeFalar

    Ana esposa = new Ana();

    void testeAcessos(){
        //System.out.println(esposa.segredo);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.todosSabem);
    }
}
