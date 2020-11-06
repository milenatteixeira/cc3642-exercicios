package com.mycompany.exercicio1;

import java.util.Scanner;
public class TestePessoa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome = input.next();
        p1.setNome(nome);
        System.out.println("Digite o cpf da primeira pessoa: ");
        String cpf = input.next();
        p1.setCpf(cpf);
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade = input.nextInt();
        p1.setIdade(idade);
        
        System.out.println("\nDigite o nome da segunda pessoa: ");
        String nome2 = input.next();
        p2.setNome(nome2);
        System.out.println("Digite o cpf da segunda pessoa: ");
        String cpf2 = input.next();
        p2.setCpf(cpf2);
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = input.nextInt();
        p2.setIdade(idade2);
        
        System.out.println("Digite o nome da terceira pessoa: ");
        String nome3 = input.next();
        p3.setNome(nome3);
        System.out.println("Digite o cpf da terceira pessoa: ");
        String cpf3 = input.next();
        p3.setCpf(cpf3);
        System.out.println("\nDigite a idade da terceira pessoa: ");
        int idade3 = input.nextInt();
        p3.setIdade(idade3);
        
        
        System.out.printf("\n\n1° Pessoa\nNome: %s\nCPF:%s\nIdade:%d\n\n", p1.getNome(), p1.getCpf(), p1.getIdade());
        System.out.printf("2° Pessoa\nNome: %s\nCPF:%s\nIdade:%d\n\n", p2.getNome(), p2.getCpf(), p2.getIdade());
        System.out.printf("3° Pessoa\nNome: %s\nCPF:%s\nIdade:%d\n", p3.getNome(), p3.getCpf(), p3.getIdade());

    }
}
