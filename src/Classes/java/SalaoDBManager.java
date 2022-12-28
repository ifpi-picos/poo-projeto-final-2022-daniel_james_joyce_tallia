package Classes.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalaoDBManager {
    public static Connection obterConexao() throws SQLException {
        // URL de conexão com o banco de dados
        String url = "xxxxxxxx";
        // Nome de usuario e senha do banco de dados
        String usuario = "usuario";
        String senha = "senha";
        // Obtém a conexão com o banco de dados
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
}
