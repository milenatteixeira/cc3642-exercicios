package main;

import controller.Controller;
import view.Janela;

public class Main {
    public static void main(String[] args) {
        Janela janela = new Janela();
        Controller controle = new Controller(janela);
        controle.control();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
