/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy;

public class Main {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(550);
        
        Calculadora calc = new Calculadora();
        
        Imposto imposto;
        imposto = new ISS();
        calc.realizaCalculo(imposto, orcamento);
        
        imposto = new ICMS();
        calc.realizaCalculo(imposto, orcamento);
    }
}
