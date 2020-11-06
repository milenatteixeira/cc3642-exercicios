package com.mycompany.uexercicio3;

public class Disciplina {
    private String codigo;
    private String nome;
    private Professor professor;
    private Aluno aluno1, aluno2;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno1 = aluno;
    }
    
    public void setAluno2(Aluno aluno){
        this.aluno2 = aluno;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public String toString() {
        return "Codigo = " + codigo + ", Nome = " + nome + "\nProfessor: " + professor + "\nAluno 1: " + aluno1 + "\nAluno 2: " + aluno2;
    }
    
}
