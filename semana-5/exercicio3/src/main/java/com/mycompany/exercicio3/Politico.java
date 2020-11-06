package com.mycompany.exercicio3;

/**
 *
 * @author milena
 */
public class Politico {
    private String nome;
    private String partido;
    private String estado;
    private String funcao;

    public Politico() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String getImprimir(){
        return "Nome: " + nome + "\nPartido: " + partido + "\nEstado: " + estado + "\nFunção: " + funcao;
    }

    public String toString() {
        return getImprimir();
    }
    
}
