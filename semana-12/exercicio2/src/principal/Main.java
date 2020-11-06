/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controller.ControleController;
import view.ControleTelevisao;

public class Main {

    public static void main(String[] args) {
        ControleTelevisao controleTelevisao = new ControleTelevisao();
        ControleController controller = new ControleController(controleTelevisao);
        controller.control();
        controleTelevisao.setLocationRelativeTo(null);
        controleTelevisao.setVisible(true);
    }
}
