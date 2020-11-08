package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.CadastroForm;

/**
 *
 * @author milena
 */
public class ControllerCadastro {
    private CadastroForm view;

    public ControllerCadastro(CadastroForm view) {
        this.view = view;
    }

    public void salvarAluno(){
        String nome = view.getCadastroNome().getText();
        String usuario = view.getCadastroUsuario().getText();
        String senha = view.getCadastroSenha().getText();
        
        Aluno aluno = new Aluno(nome, usuario, senha);
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(null, "Cadastro concluído.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Falha na conexão.");
        }
    }

}
