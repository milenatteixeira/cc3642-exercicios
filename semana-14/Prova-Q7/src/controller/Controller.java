/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Aluno;
import view.Cadastro;
import view.ExibirAlunos;

/**
 *
 * @author milena
 */
public class Controller {
    private Cadastro view;
    private ExibirAlunos outraView;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Controller(Cadastro view) {
        this.view = view;
    }
    
    public Controller(ExibirAlunos outraview){
        this.outraView = outraview;
    }
    
    public void cadastrarAluno(){
        String nome = view.getNome().getText();
        String cpf = view.getCpf().getText();
        String curso = view.getCurso().getText();
        String numeroMatricula = view.getNumeroMatricula().getText();
        
        Aluno aluno = new Aluno(curso, numeroMatricula, nome, cpf);
        alunos.add(aluno);
    }
    
    public void mostrarAluno(String matricula){
        for(int i = 0; i < alunos.size(); i++){
            String numero = alunos.get(i).getMatricula();
            String nome = alunos.get(i).getNome();
            String cpf = alunos.get(i).getCpf();
            String curso = alunos.get(i).getCurso();
            
            if(matricula.equals(numero)){
                outraView.getResultado().setText("Nome: " + nome + "\nCPF: "+cpf+
                        "\nCurso: "+curso+"\nNumero: "+numero);
            }
        }
    }
}
