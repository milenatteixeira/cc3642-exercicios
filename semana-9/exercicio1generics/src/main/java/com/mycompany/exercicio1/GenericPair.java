/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

/**
 *
 * @author milena
 * @param <F>
 * @param <S>
 */
public class GenericPair<F, S> {
    private F primeiroElemento;
    private S segundoElemento;

    public GenericPair() {
    }

    public GenericPair(F primeiroElemento, S segundoElemento) {
        this.primeiroElemento = primeiroElemento;
        this.segundoElemento = segundoElemento;
    }

    public F getPrimeiroElemento() {
        System.out.println(primeiroElemento);
        return primeiroElemento;
    }

    public void setPrimeiroElemento(F primeiroElemento) {
        this.primeiroElemento = primeiroElemento;
    }

    public S getSegundoElemento() {
        System.out.println(segundoElemento);
        return segundoElemento;
    }

    public void setSegundoElemento(S segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    @Override
    public String toString() {
        return "\nPrimeiro elemento: " + primeiroElemento + "\nSegundo elemento: " + segundoElemento;
    }
    
    
}
