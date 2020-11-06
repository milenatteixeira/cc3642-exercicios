/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();
        
        System.out.println("Digite o dia: ");
        int dia = Integer.parseInt(input.nextLine());
        System.out.println("Digite o mes: ");
        int mes = Integer.parseInt(input.nextLine());
        System.out.println("Digite o ano: ");
        int ano = Integer.parseInt(input.nextLine());
        
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        
        data.exibeData();
    }
}
