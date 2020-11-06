package com.mycompany.exercicio2;

public class ContaComum {
    private int numero;
    private int situacao;
    private int senha;
    private double saldo;

    public ContaComum() {
        situacao = 1;
    }    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nNúmero = " + numero + "\nSituação = " + situacao + 
                "\nSenha = " + senha + "\nSaldo = " + saldo;
    }
    
    
}
