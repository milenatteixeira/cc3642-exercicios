/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uexercicio2;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        System.out.println(p1.getConta());
        
        p1.getConta().setNumero(100);
        p1.getConta().setSaldo(20);
        
        System.out.println(p1.getConta());
        
    }
}
