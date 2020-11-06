
package com.mycompany.exercicio2;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        ContaComum c = new ContaComum();
        
        p1.setConta(c);
        p1.conta.setNumero(10);
        
        System.out.println(p1.conta);
        
        c.setNumero(90);
        
        System.out.println(p1.conta);
    }
}
