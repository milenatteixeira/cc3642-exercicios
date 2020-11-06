/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

public class Main {

    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(2, 8);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.somar(r2));
        System.out.println(r1.subtrair(r2));
    }
}
