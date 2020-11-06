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
public class Cruzador extends NavioDeGuerra{
    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
    @Override
    public void poderDeFogo(){
        System.out.println("\nValor de ataque: "+getAtaque()*(Math.sqrt(getNumCanhoes())));
    }
}
