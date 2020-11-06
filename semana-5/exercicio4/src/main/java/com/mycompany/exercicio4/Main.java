/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

public class Main {

    public static void main(String[] args) {
        NavioDeGuerra navioGuerra = new NavioDeGuerra(100.4, 2000, 100, "Perola Negra");
        NavioMercante navioMercante = new NavioMercante(1000, 600, 100, "Negra Perola");
        PortaAvioes portaAvioes = new PortaAvioes(10, 100, 50, 100, "no name");
        Cruzador cruzador = new Cruzador(8, 2000, 5000, 25, "Bombastico");
        
        navioGuerra.exibirArmas();
        navioMercante.carregamento();
        portaAvioes.poderDeFogo();
        cruzador.poderDeFogo();
    }
}
