/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = null;
        int dia, mes, ano;
        
        System.out.println("Digite como quer fazer a entrada do mês.");
        System.out.println("[1]: DD/MM/AAAA\n[2]: Mês DD, AAAA\n[3]: DDD AAAA\n");
        int op = Integer.parseInt(input.nextLine());
        
        switch(op){
            case 1:
                System.out.println("Digite o dia:");
                dia = Integer.parseInt(input.nextLine());
                System.out.println("Digite o mês:");
                mes = Integer.parseInt(input.nextLine());
                System.out.println("Digite o ano:");
                ano = Integer.parseInt(input.nextLine());
                
                data = new Data(dia, mes, ano);
                System.out.println(data);
            break;
            case 2:
                System.out.println("Digite o dia:");
                dia = Integer.parseInt(input.nextLine());
                System.out.println("Digite o mês:");
                String stringMes = input.nextLine();
                System.out.println("Digite o ano:");
                ano = Integer.parseInt(input.nextLine());
                
                data = new Data(dia, ano, stringMes.toLowerCase());
                System.out.println(stringMes.toLowerCase());
                System.out.println(data);
            break;
            case 3:
                System.out.println("Digite o dia:");
                dia = Integer.parseInt(input.nextLine());
                System.out.println("Digite o ano:");
                ano = Integer.parseInt(input.nextLine());
                
                data = new Data(dia, ano);
                System.out.println(data);
            break;
            default:
                System.out.println("Valor incorreto.");
            break;
        }
    }
}
