package jdbc;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql, "Rute Nogueira");
        dao.incluir(sql, "Alice Ferreira");
        dao.incluir(sql, "Maria Helena");

        dao.close();
    }
}
