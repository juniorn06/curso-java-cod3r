package teste.basico.muitospramuitos;

import infra.DAO;
import modelo.basico.muitospramuitos.Sobrinho;
import modelo.basico.muitospramuitos.Tio;

import java.util.Date;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio tia1 = new Tio("Cati");
        Tio tio2 = new Tio("Junior");

        Sobrinho sobrinha1 = new Sobrinho("Andri");
        Sobrinho sobrinho2 = new Sobrinho("João");

        tia1.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluir(tia1).incluir(tio2).incluir(sobrinha1).incluir(sobrinho2).fecharT().fechar();
    }
}
