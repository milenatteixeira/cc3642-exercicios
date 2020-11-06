package com.mycompany.exercicio1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        double n1, n2, n3;

        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        
        System.out.printf("%.2f", n1*n2*n3);
    }
    
}
