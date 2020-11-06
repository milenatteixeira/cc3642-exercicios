/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9;

public class Main {

    public static void main(String[] args) {
        int cont = 0;
        
        for(int i = 1; i <= 500; i++){
            for(int j = 1; j <= 500; j++){
                for(int k = 1; k <= 500; k++){
                    if(Math.pow(k, 2)==(Math.pow(i, 2)+Math.pow(j, 2))){
                        cont++;
                    }
                }
            }
        }
        
        System.out.printf("%d", cont/2);
    }
}
