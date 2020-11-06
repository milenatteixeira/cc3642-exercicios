package com.mycompany.exercicio3;

/**
 *
 * @author milena
 */
public class HeartRates {
    private String nome, sobrenome;
    private int dia, mes, ano; //data de nascimento.

    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int calculaIdade(int ano){
        return 2020-ano;
    }
    
    public int frequenciaMaxima(){
        return 220-getIdade();
    }

    public int getIdade() {
        return calculaIdade(this.ano);
    }
    
    public double frequenciaAlvoMinima(){
        return 0.5 * frequenciaMaxima();
    }
    
    public double frequenciaAlvoMaxima(){
        return 0.85 * frequenciaMaxima();
    }
}
