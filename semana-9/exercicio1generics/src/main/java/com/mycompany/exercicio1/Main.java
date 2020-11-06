/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

public class Main {

    public static void main(String[] args) {
        GenericPair<Integer, Integer> parUm = new GenericPair<>();
        parUm.setPrimeiroElemento(7);
        parUm.setSegundoElemento(9);
        
        System.out.println(parUm);
        
        GenericPair<Double, Double> parDois = new GenericPair<>();
        parDois.setPrimeiroElemento(7.1);
        parDois.setSegundoElemento(9.9);
        
        System.out.println(parDois);
    }
}
