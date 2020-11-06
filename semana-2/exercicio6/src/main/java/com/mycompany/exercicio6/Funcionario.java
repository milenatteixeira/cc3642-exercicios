package com.mycompany.exercicio6;

/**
 *
 * @author milena
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

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

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal<0){
            this.salarioMensal = 0;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }
    
    public double salarioAnual(){
        return salarioMensal*12;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome + "\nSobrenome = " + sobrenome + 
                "\nSalario Mensal = " + salarioMensal + "\nSalário Anual = " + salarioAnual();
    }
    
    
}
