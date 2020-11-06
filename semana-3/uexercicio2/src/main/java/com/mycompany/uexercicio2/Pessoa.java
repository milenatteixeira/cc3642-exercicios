
package com.mycompany.uexercicio2;

public class Pessoa {
    private String nome;
    private String endereco;
    private double renda;
    private ContaComum conta;

    public Pessoa() {
        this.conta = new ContaComum();
    }

    public ContaComum getConta() {
        return conta;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
        
}
