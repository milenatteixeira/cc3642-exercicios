package com.mycompany.exercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5, i, j, valor = 0;
        
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        
        for(i = 1; i <= 5; i++){
            switch(i){
                case 1: valor = n1;
                break;
                case 2: valor = n2;
                break;
                case 3: valor = n3;
                break;
                case 4: valor = n4;
                break;
                case 5: valor = n5;
                break;
            }
            
            for(j = 0; j < valor; j++){
                System.out.printf("*");
            }System.out.println("");
        }
            
    }
}
