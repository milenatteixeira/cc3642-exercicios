/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.println("Digite o nome do funcionário 1: ");
        String nome = input.nextLine();        
        System.out.println("Digite o sobrenome do funcionario 1: ");
        String sobrenome = input.nextLine();
        System.out.println("Digite o salário do funcionário 1: ");
        double salario = Double.parseDouble(input.nextLine());
        
        f1.setNome(nome);
        f1.setSobrenome(sobrenome);
        f1.setSalarioMensal(salario);
        
        System.out.println("Digite o nome do funcionário 2: ");
        nome = input.nextLine();        
        System.out.println("Digite o sobrenome do funcionario 1: ");
        sobrenome = input.nextLine();
        System.out.println("Digite o salário do funcionário 1: ");
        salario = Double.parseDouble(input.nextLine());
        
        f2.setNome(nome);
        f2.setSobrenome(sobrenome);
        f2.setSalarioMensal(salario);
        
        System.out.printf("\nSalário anual 1 pré incrementado: %.2f\n", f1.salarioAnual());
        System.out.printf("Salário anual 2 pré incrementado: %.2f\n", f2.salarioAnual());
        
        f1.setSalarioMensal(f1.getSalarioMensal() * 1.1);
        f2.setSalarioMensal(f2.getSalarioMensal() * 1.1);
        
        System.out.printf("\nSalário anual 1 pós incrementado: %.2f\n", f1.salarioAnual());
        System.out.printf("Salário anual 2 pós incrementado: %.2f\n", f2.salarioAnual());
    }
}
