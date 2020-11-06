/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

/**
 *
 * @author milena
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String cpf;

    public Pessoa(String nome, String sobrenome, Integer idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        if(cpf.contains("-")){
            if(cpf.contains(".")){
                throw new CpfInvalidoException("\nHá caracteres inválidos no CPF (ponto e hífen). Por favor, ajuste.");
            }else{
                throw new CpfInvalidoException("\nHá caracteres inválidos no CPF (hífen). Por favor, ajuste.");
            }
        }else if(cpf.contains(".")){
            if(cpf.contains("-")){
                throw new CpfInvalidoException("\nHá caracteres inválidos no CPF (ponto e hífen). Por favor, ajuste.");
            }else{
                throw new CpfInvalidoException("\nHá caracteres inválidos no CPF (ponto). Por favor, ajuste.");
            }
        }else{
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nCpf: " + cpf;
    }    
}
