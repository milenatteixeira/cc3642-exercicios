package com.mycompany.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i;
        
        for(i = 1; i <= 1000; i++){
            if(i%2!=0){
                System.out.printf("%d\n", i);
            }
        }
    }
}
