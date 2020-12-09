package principal;

import model.Ponto;

public class Main {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(10, 7);
        Ponto p2 = new Ponto(1, 2);
        
        Ponto p3 = p1.soma(p2);
        
        System.out.println(p3);
    }
}
