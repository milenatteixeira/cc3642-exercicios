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
public class NameFactory {
    public Name getName(String nameType){
        if(nameType == null){
            return null;
        }
        if(nameType.equalsIgnoreCase("PRINT")){
            return PrintName.getInstance();
        }else if(nameType.equalsIgnoreCase("WRITE")){
            return WriteName.getInstance();
        }
        return null;
    }
}
