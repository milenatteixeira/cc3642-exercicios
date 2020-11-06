/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p, r;
        
        p = input.nextInt();
        r = input.nextInt();
        
        if(p==0){
            System.out.println("C");
        }else if(r==0){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        
    }
}
