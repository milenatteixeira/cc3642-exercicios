/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        NameFactory fabrica = new NameFactory();
        Scanner input = new Scanner(System.in);        
        Name name = null;
        
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        Integer numero = random.nextInt(2);
        
        if(numero == 0){
            name = fabrica.getName("PRINT");            
        }else if(numero == 1){
            name = fabrica.getName("WRITE");
        }
        
        name.readName(nome);
    }
}
