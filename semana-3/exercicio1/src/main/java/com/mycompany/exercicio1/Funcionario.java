package com.mycompany.exercicio1;

/**
 *
 * @author milena
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int idade;
    private int numero;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String sexo, int idade, int numero, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.numero = numero;
        this.salario = salario;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Nome = " + nome + "\nSobrenome = " + sobrenome + "\nSexo = " + sexo + 
                "\nIdade = " + idade + "Numero = " + numero + "\nSalário = " + salario;
    }
    
}
