/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uexercicio3;

/**
 *
 * @author milena
 */
public class Aluno {
    private String nome;
    private String ra;
    private String curso;

    public Aluno(String nome, String ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Nome = " + nome + ", RA = " + ra + ", Curso = " + curso;
    }
    
}
