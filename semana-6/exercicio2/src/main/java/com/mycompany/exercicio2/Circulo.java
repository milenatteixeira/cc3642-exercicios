package com.mycompany.exercicio2;

import javax.swing.JOptionPane;

public class Circulo extends Formas{
    private double raio;
    private final double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double perimetro() {
        return (2*pi*raio);
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Perímetro: " + perimetro());
        JOptionPane.showMessageDialog(null,"Area: " + area());
    }
    
    public double area(){
        return(pi*Math.pow(raio,2));
    }
    
}
