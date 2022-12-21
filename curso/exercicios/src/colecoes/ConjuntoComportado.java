package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana Luiza");
        listaAprovados.add("Cati");
        listaAprovados.add("Junior");
        listaAprovados.add("Rute");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }

        System.out.println();

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(50);
        nums.add(36);

        for (int n: nums){
            System.out.println(n);
        }

    }
}
