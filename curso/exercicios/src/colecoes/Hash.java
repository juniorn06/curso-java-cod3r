package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Cati"));
        usuarios.add(new Usuario("Junior"));

        boolean resultado = usuarios.contains(new Usuario("Ana"));
        System.out.println(resultado);

    }
}
