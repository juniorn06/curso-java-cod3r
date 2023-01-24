package teste.basico.umpraum;

import infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rute", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}
