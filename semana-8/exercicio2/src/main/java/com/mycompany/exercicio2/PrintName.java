/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

/**
 *
 * @author milena
 */
public class PrintName extends Name{
    
    private static PrintName object;
    private PrintName(){}
    
    public static PrintName getInstance(){
        if(object == null){
            object = new PrintName();
        }
        return object;
    }
    
    public void readName(String name){
        System.out.println(name);
    }
}
