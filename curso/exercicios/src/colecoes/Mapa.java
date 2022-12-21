package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // Put: Tanto adiciona elementos como os substitui.
        usuarios.put(1, "Ana Luiza");
        usuarios.put(2, "Cati");
        usuarios.put(20, "Junior");
        usuarios.put(4, "Rute");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Ana Luiza"));
        System.out.println(usuarios.get(20));
        System.out.println(usuarios.remove(4, "Teste"));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
