package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.LoginForm;

/**
 *
 * @author milena
 */
public class ControllerLogin {
    private LoginForm view;

    public ControllerLogin(LoginForm view) {
        this.view = view;
    }
    
    public void logar(){
        Aluno aluno = new Aluno(null, view.getLoginUsuario().getText(), view.getLoginSenha().getText());
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            ResultSet res = dao.consultar(aluno);
            if(res.next()){
                String nome = res.getString(1);
                JOptionPane.showMessageDialog(null, "Login concluído. Bem vindo(a) "+nome+"!", "Logado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Login não executado.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Falha na conexão.");
        }
    }
}
