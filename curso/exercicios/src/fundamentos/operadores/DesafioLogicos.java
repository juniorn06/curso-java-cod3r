package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        //Trabalho na terça(verdadeiro ou falso)
        //Trabalho na quinta(verdadeiro ou falso)

        //dois verdadeiros: tv 50 polegadas
        //apenas 1: tv 32
        // 50 ou 32: tomar sorvete
        // dois falsos: nada

        boolean t1 = true;
        boolean t2 = true;

        boolean tv50 = t1 && t2;
        boolean tv32 = t1 ^ t2;
        boolean tomarSorvete = tv50 || tv32;
        boolean Saudavel = !tomarSorvete;

        System.out.println(tv50);
        System.out.println(tv32);
        System.out.println(tomarSorvete);
        System.out.println(Saudavel);

        // solução professor

        /*boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Comprou sorvete\"? " + comprouSorvete);
        System.out.println("Comprou sorvete\"? " + maisSaudavel);*/
    }
}
