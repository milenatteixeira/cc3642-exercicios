/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        int lado1, lado12, lado2, lado22;
        
        System.out.println("Digite o lado 1 do retangulo 1: ");
        lado1 = input.nextInt();
        System.out.println("Digite o lado 2 do retangulo 1: ");
        lado12 = input.nextInt();
        System.out.println("Digite o lado 1 do retangulo 2: ");
        lado2 = input.nextInt();
        System.out.println("Digite o lado 2 do retangulo 2: ");
        lado22 = input.nextInt();
        
        ret1.setLado1(lado1);
        ret1.setLado2(lado12);
        ret2.setLado1(lado2);
        ret2.setLado2(lado22);
        
        System.out.println("\nRetangulo 1: \nLado 1: " + ret1.getLado1() + " Lado 2: " + ret1.getLado2());
        System.out.println("Area: " + ret1.area() + " Perimetro: "+ ret1.perimetro());
        System.out.println("\nRetangulo 2: \nLado 1: " + ret2.getLado1() + " Lado 2: " + ret2.getLado2());
        System.out.println("Area: " + ret2.area() + " Perimetro: "+ ret2.perimetro());
    }
}
