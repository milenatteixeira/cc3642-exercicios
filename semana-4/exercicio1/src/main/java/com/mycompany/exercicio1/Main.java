/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

public class Main {

    public static void main(String[] args) {
        Laser l[] = new Laser[12];
        
        for(int i = 0; i < l.length; i++){
            l[i] = new Laser("Tesla", 10*i, Math.pow(0.1, i), 0);
        }
        
        for(int i = 0; i < l.length; i++){
            System.out.println(l[i]);
        }
    }
}
