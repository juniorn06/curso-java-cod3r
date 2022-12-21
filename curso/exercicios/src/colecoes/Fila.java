package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Junior");
        fila.add("Cati");
        fila.offer("Rute");
        fila.add("Aline");
        fila.offer("Helena");

        System.out.println(fila.peek());
        System.out.println(fila.element());

        // Peek e Element -> obter o próximo elemento da fila (sem remover)

//        fila.size();
//        fila.clear();
//        fila.isEmpty();

        // Pool e Remove - obter o próximo elemento da fila e remove

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();
    }
}
