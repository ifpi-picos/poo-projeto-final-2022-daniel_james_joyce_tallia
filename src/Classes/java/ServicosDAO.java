package Classes.java;
import Classes.java.Servicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

import Classes.java.SalaoDBManager;

public class ServicosDAO {
    private Connection connection;

    public void cadastrar(Servicos servicos){
        PreparedStatement smt = null;

        try{
            connection = SalaoDBManager.obterConexao();
            String sql = "INSERT INTO....";

            smt = connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
