package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;
/**
 *
 * @author milena
 */
public class AlunoDAO {
    private Connection conn;

    public AlunoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Aluno aluno) throws SQLException{
        String sql = "INSERT INTO aluno(nome, usuario, senha) "
                + "VALUES('"+aluno.getNome()+"', '" 
                + aluno.getUsuario()+ "', '" 
                + aluno.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
}
