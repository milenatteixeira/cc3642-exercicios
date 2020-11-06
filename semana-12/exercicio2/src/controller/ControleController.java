/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.ControleTelevisao;

/**
 *
 * @author milena
 */
public class ControleController implements ActionListener, ChangeListener{
    private ControleTelevisao controleTelevisao;

    public ControleController(ControleTelevisao controleTelevisao) {
        this.controleTelevisao = controleTelevisao;
    }
    
    public void control(){
        controleTelevisao.getCanalDown().addActionListener(this);
        controleTelevisao.getCanalUp().addActionListener(this);
        controleTelevisao.getLigar().addActionListener(this);
        controleTelevisao.getVolumeBar().addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent evt){
        int volume = controleTelevisao.getVolumeBar().getValue();
        controleTelevisao.getVolume().setText("Volume: "+volume);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource()==controleTelevisao.getCanalUp()){
            int canal = Integer.parseInt(controleTelevisao.getCanal().getText().replace("Canal: ", ""));
            canal += 1;
            controleTelevisao.getCanal().setText("Canal: "+ String.valueOf(canal));
        }else if (evt.getSource()==controleTelevisao.getCanalDown()){
            int canal = Integer.parseInt(controleTelevisao.getCanal().getText().replace("Canal: ", ""));
            canal -= 1;
            controleTelevisao.getCanal().setText("Canal: "+ String.valueOf(canal));
        }else if(evt.getSource()==controleTelevisao.getLigar()){
                if(controleTelevisao.getIsON().getText().equals("OFF")){
                    new Thread(){
                        @Override
                        public void run(){
                            for(int i = 0; i <= 100; i++){
                                controleTelevisao.getProgress().setValue(i);
                                try{
                                    sleep(50);
                                }catch(Exception e){
                                    e.printStackTrace();
                                }
                            }
                            controleTelevisao.getIsON().setText("ON");
                            controleTelevisao.getLigar().setText("DESLIGAR");
                        }
                    }.start();
                }else{
                    new Thread(){
                        @Override
                        public void run(){
                            for(int i = 100; i >= 0; i--){
                                controleTelevisao.getProgress().setForeground(Color.red);
                                controleTelevisao.getProgress().setValue(i);
                                try{
                                    sleep(30);
                                }catch(Exception e){
                                    e.printStackTrace();
                                }
                            }
                            controleTelevisao.getIsON().setText("OFF");
                            controleTelevisao.getLigar().setText("LIGAR");
                        }
                    }.start();
                }
            }
    }
}
