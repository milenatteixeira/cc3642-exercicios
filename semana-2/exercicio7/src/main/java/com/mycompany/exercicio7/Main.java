/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice();
        
        System.out.println("Digite o identificador do produto: ");
        String id = input.nextLine();
        System.out.println("Digite a descrição do produto: ");
        String descricao = input.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = Integer.parseInt(input.nextLine());
        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(input.nextLine());
        
        invoice.setId(id);
        invoice.setDescricao(descricao);
        invoice.setQuantidade(quantidade);
        invoice.setPreco(preco);
        
        System.out.println(invoice);
    }
}
