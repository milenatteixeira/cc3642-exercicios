package com.mycompany.exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cont = 0, i = 0, num;
        
        do{
            num = input.nextInt();
            
            if(num%2==0){
                cont++;
            }
            
            i++;            
        }while(i<20);
        
        System.out.printf("%d", cont);
    }    
}
