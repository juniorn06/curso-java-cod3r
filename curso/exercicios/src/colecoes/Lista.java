package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario > lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Cati"));
        lista.add(new Usuario("Junior"));
        lista.add(new Usuario("Rute"));
        lista.add(new Usuario("Rute"));

        System.out.println(lista.get(0)); // acesso pelo índice


        System.out.println("Removido: " + lista.remove(2));
        System.out.println(lista.remove(new Usuario("Rute")));
        System.out.println("Tem? " + lista.contains(new Usuario("Cati")));

        for (Usuario u: lista){
            System.out.println(u);
        }
    }
}
