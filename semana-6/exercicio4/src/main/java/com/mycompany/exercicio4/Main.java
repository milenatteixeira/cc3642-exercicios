/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

public class Main {

    public static void main(String[] args) {
        Movable movel;
        int x = 10;
        int y = 20;
        int xSpeed = 1;
        int ySpeed = 2;
        
        movel = new MovablePoint(x, y, xSpeed, ySpeed);
        
        System.out.println(movel);
        movel.moveDown();
        movel.moveLeft();
        System.out.println(movel);
        
        movel = new MovableCircle(x, y, xSpeed, ySpeed, 5);
        
        System.out.println(movel);
        movel.moveUp();
        movel.moveRight();
        System.out.println(movel);
    }
}
