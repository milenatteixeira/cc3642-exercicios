/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author milena
 */
public class Aluno extends Pessoa{
    private String curso;
    private String matricula;

    public Aluno(String curso, String matricula, String nome, String cpf) {
        super(nome, cpf);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno:" + "\nCurso: " + curso + "\nMatricula: " + matricula + 
                "\nNome: "+getNome()+"\nCPF:"+getCpf();
    }
    
    
}
