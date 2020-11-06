/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

public class Main {

    public static void main(String[] args) {
        Televisao tev1 = new Televisao();
        Televisao tev2 = new Televisao();
        
        tev1.setLigada(true);
        tev1.setVolume(50);
        tev1.setCanal(20);
        tev1.setModelo("LG");
        tev1.setPreco(2000);
        
        tev2.setLigada(true);
        tev2.setVolume(10);
        tev2.setCanal(30);
        tev2.setModelo("SAMSUNG");
        tev2.setPreco(3000);
        
        System.out.println(tev1);
        System.out.println(tev2);
        
        tev1.alteraCanal(true);
        tev2.alteraCanal(false);
        
        tev1.alteraVolume(60);
        tev2.alteraVolume(0);
        
        System.out.println(tev1);
        System.out.println(tev2);
    }
}
