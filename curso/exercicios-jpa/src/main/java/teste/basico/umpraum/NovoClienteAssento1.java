package teste.basico.umpraum;

import infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Junior", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();


    }
}
