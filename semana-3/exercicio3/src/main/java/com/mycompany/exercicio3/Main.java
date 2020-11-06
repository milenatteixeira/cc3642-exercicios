/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

public class Main {

    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("Milena", "Teixeira", 22, 3, 1999);
        System.out.println(heartRates.getIdade());
        System.out.println(heartRates.frequenciaMaxima());
        System.out.println(heartRates.frequenciaAlvoMinima());
        System.out.println(heartRates.frequenciaAlvoMaxima());
    }
}
