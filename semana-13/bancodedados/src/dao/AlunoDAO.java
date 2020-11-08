package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
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
        String sql = "INSERT INTO aluno(nome, usuario, senha) VALUES(?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getNome());
        statement.setString(2, aluno.getUsuario());
        statement.setString(3, aluno.getSenha());
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
        String sql = "SELECT * FROM aluno WHERE usuario = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
}
