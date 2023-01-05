package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() throws SQLException {

        try {
            final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&UseSSL=true";
            final String usuario = "root";
            final String senha = "root123";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
