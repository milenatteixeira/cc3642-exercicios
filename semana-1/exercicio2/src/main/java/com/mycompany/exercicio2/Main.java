package com.mycompany.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2, n3, aux;
        
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        
        if(n1>n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1>n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n2>n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        
        System.out.printf("%d %d %d", n1, n2, n3);
    }
    
}
