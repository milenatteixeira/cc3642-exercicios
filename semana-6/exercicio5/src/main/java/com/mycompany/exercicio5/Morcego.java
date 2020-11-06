package com.mycompany.exercicio5;

/**
 *
 * @author milena
 */
public class Morcego extends Animal implements IFlyable, IWalkable{

    public Morcego() {
    }

    public Morcego(String nome) {
        super(nome);
    }
    
    @Override
    public void andar(){
        System.out.println("Andando...");
    }
    
    @Override
    public void voar(){
        System.out.println("Voando...");
    }
}
