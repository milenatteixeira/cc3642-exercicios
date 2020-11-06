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
public class PortaAvioes extends NavioDeGuerra{
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    @Override
    public void poderDeFogo(){
        System.out.println("\nValor do ataque: "+getAtaque()*(Math.pow(getNumAvioes(), 2)));
    }
}
