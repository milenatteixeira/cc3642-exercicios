
package com.mycompany.exercicio2;

public class Pessoa {
    private String nome;
    private String endereco;
    private double renda;
    public ContaComum conta;

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
    
    public void setConta(ContaComum conta) {
        this.conta = conta;
    }
            
}
