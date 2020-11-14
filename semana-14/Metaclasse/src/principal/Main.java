/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import model.Pessoa;
import model.Veiculo;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add(new Pessoa("Fulano", 21));
        lista.add(new Veiculo("VW", "Fusca"));
        
        System.out.println(lista.get(0).getClass().getName());
        
//        ArrayList<Object> lista = new ArrayList<>();
//        lista.add(new Pessoa("Fulano", 21));
//        lista.add(new Veiculo("VW", "Fusca"));
//        
//        System.out.println(((Pessoa)lista.get(0)).getNome()); //downcasting para poder usar o get da classe especificada
//        System.out.println(lista.get(1));
    }
}
