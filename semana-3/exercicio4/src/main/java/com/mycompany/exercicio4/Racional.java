/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

/**
 *
 * @author milena
 */
public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        if(numerador==1){
            this.numerador = numerador;
            this.denominador = denominador;
        }else{
            if(denominador%numerador==0){
                this.numerador = numerador/numerador;
                this.denominador = denominador/numerador;
            }
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Numerador = " + numerador + "\nDenominador = " + denominador;
    }
    
    public double somar(Racional racional){
        double r1 = (double) this.numerador/this.denominador;
        double r2 = (double) racional.getNumerador()/racional.getDenominador();
        
        return r1+r2;
    }
    
    public double subtrair(Racional racional){
        double r1 = (double) this.numerador/this.denominador;
        double r2 = (double) racional.getNumerador()/racional.getDenominador();
        
        return (r1 > r2 ? r1 - r2 : r2 - r1);
    }
}
