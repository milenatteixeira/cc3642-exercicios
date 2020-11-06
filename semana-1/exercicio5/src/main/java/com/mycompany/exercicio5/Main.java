/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int numeroProduto, op;
        int quantidadeProduto;
        
        do{
            System.out.println("");
            
            System.out.println("Digite o número do produto:");
            numeroProduto = input.nextInt();
            
            System.out.println("Digite a quantidade vendida:");
            quantidadeProduto = input.nextInt();
            
            System.out.println("");
            
            switch(numeroProduto){
                case 1: System.out.printf("Produto 1\nQuantidade: %d\n"
                        + "Valor total: %.2f\n", quantidadeProduto, 2.98*quantidadeProduto);
                break;
                case 2: System.out.printf("Produto 2\nQuantidade: %d\n"
                        + "Valor total: %.2f\n", quantidadeProduto, 4.5*quantidadeProduto);
                break;
                case 3: System.out.printf("Produto 3\nQuantidade: %d\n"
                        + "Valor total: %.2f\n", quantidadeProduto, 3.98*quantidadeProduto);
                break;
                case 4: System.out.printf("Produto 4\nQuantidade: %d\n"
                        + "Valor total: %.2f\n", quantidadeProduto, 4.49*quantidadeProduto);
                break;
                case 5: System.out.printf("Produto 5\nQuantidade: %d\n"
                        + "Valor total: %.2f\n", quantidadeProduto, 6.78*quantidadeProduto);
                break;
                
            }
            
            
            System.out.println("\nDigite 0 para sair, 1 para continuar: ");
            op = input.nextInt();
        }while(op!=0);
            
    }
}
