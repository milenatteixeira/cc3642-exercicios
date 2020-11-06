
package com.mycompany.exercicio2;

public abstract class Formas {
    private String tipo;
    
    public abstract double perimetro();
    
    public abstract void print();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}