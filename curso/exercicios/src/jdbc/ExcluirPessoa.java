package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código da pessoa: ");
        int codigo = sc.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo > ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        int contador = stmt.executeUpdate();

        if (contador > 0){
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Sem alteração!");
        }

        System.out.println("Linhas afetadas: " + contador);
        sc.close();
        conexao.close();
    }
}
