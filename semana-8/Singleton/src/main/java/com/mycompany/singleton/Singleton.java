/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton;

/**
 *
 * @author milena
 */
public class Singleton {
    private static Singleton objetoUnico;

    private Singleton() {
    }
    
    public static Singleton getInstance(){
        if(objetoUnico == null){
            objetoUnico = new Singleton();
        }
        return objetoUnico;            
    }
    
    public void print(){
        System.out.println("teste.");
    }
}
