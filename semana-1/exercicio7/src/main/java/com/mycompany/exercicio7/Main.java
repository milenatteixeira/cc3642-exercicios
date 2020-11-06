/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double salario = input.nextDouble();
        
        if(salario>0&&salario<=400.00){
            System.out.printf("Novo salario: %.2f\n"
                    + "Reajuste ganho: %.2f\n"
                    + "Em percentual: 15 %%", salario*1.15, salario*0.15);
        }else if(salario>400.00&&salario<=800.00){
            System.out.printf("Novo salario: %.2f\n"
                    + "Reajuste ganho: %.2f\n"
                    + "Em percentual: 12 %%", salario*1.12, salario*0.12);
        }else if(salario>800.00&&salario<=1200.00){
            System.out.printf("Novo salario: %.2f\n"
                    + "Reajuste ganho: %.2f\n"
                    + "Em percentual: 10 %%", salario*1.10, salario*0.10);
        }else if(salario>1200.00&&salario<=2000.00){
            System.out.printf("Novo salario: %.2f\n"
                    + "Reajuste ganho: %.2f\n"
                    + "Em percentual: 7 %%", salario*1.07, salario*0.07);
        }else{
            System.out.printf("Novo salario: %.2f\n"
                    + "Reajuste ganho: %.2f\n"
                    + "Em percentual: 4 %%", salario*1.04, salario*0.04);
        }
    }
}
