/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy;

/**
 *
 * @author milena
 */
public class Calculadora {
    public void realizaCalculo(Imposto imposto, Orcamento orcamento){
        double imp = imposto.calcula(orcamento);
        System.out.println(imp);
    }
}
