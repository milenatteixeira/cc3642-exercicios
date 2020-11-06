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
public class Soma implements Operacao{
    @Override
    public double calcula(double x, double y){
        return x+y;
    }
}
