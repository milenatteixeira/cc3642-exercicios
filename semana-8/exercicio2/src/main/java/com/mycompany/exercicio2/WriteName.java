/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author milena
 */
public class WriteName extends Name{
    
    private static WriteName object;
    private WriteName(){}
    
    public static WriteName getInstance(){
        if(object == null){
            object = new WriteName();
        }
        return object;
    }    
    
    public void readName(String name){
        try{
            FileWriter file = new FileWriter("output.txt");
            PrintWriter printFile = new PrintWriter(file);
            
            printFile.print(name);
            file.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
