package com.mycompany.exercicio2;

/**
 *
 * @author milena
 */
public class Trapezio extends Quadrilatero{

    public Trapezio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double getAltura(){
        if(getPonto1().getY() == getPonto2().getY()){
            return Math.abs(getPonto2().getY() - getPonto3().getY());
        }else{
            return Math.abs(getPonto2().getY() - getPonto1().getY());
        }
    }
    
    public double getSomatoriaBases(){
        if(getPonto1().getY() == getPonto2().getY()){
            return Math.abs(getPonto1().getX() - getPonto2().getX()) + 
                   Math.abs(getPonto3().getX() - getPonto4().getX());
        }else{
            return Math.abs(getPonto2().getX() - getPonto3().getX()) + 
                   Math.abs(getPonto1().getX() - getPonto4().getX());
        }
    }
    
    public double getArea(){
        return getAltura() * getSomatoriaBases() / 2;
    }

    public String toString() {
        return getCoordenadas() + "\nAltura = " + getAltura() + "\nArea = " + getArea();
    }
    
    
}
