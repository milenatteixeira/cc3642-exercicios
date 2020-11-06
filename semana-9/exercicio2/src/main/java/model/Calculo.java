/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author milena
 */
public class Calculo {
    public double calculo(Operacao operacao, double x, double y){
        return operacao.calcula(x, y);
    }
}
