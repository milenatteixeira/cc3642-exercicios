/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory fabrica = new ShapeFactory();
        
        Shape forma;
        
        forma = fabrica.getShape("CIRCLE");
        forma.draw();
        
        forma = fabrica.getShape("RECTANGLE");
        forma.draw();
    }
}
