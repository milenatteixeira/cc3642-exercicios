/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class SwapperDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Swapper troca = new Swapper();
        
        float x, y;
        
        System.out.println("Digite o valor de X: ");
        x = input.nextFloat();
        System.out.println("Digite o valor de Y: ");
        y = input.nextFloat();
        
        troca.setX(x);
        troca.setY(y);
        
        System.out.println("X = " + troca.getX() + " Y = " + troca.getY());
        
        troca.swap();
        
        System.out.println("X = " + troca.getX() + " Y = " + troca.getY());
    }
}
