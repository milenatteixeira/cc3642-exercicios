package com.mycompany.exercicio2;

import javax.swing.JOptionPane;

public class Retangulo extends Formas{
    double comprimento, largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double perimetro() {
        return (2*largura + 2*comprimento);
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Perímetro: " + perimetro());
    }    
}
