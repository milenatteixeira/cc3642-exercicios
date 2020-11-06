package com.mycompany.exercicio1;

public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("fulano", "beltrano", "m", 30, 123456789, 2500);
        Funcionario f2 = new Funcionario();
        
        System.out.println(f1);
        System.out.println(f2);
    }
}
