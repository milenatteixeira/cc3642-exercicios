package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import model.Adiciona;
import view.Janela;

/**
 *
 * @author milena
 */
public class Controller implements ActionListener{
    private Janela janela;
    
    public Controller(Janela janela){
        this.janela = janela;
    }
    
    public void control(){
        janela.getSoma().addActionListener(this);
        janela.getClear().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){        
        if(evt.getSource()==janela.getSoma()){
            Adiciona obj = new Adiciona();
            try{
                double a = Double.parseDouble(janela.getPrimeiro().getText());
                double b = Double.parseDouble(janela.getSegundo().getText());
                double soma = obj.calcula(a, b);
                janela.getResultado().setText(String.valueOf(soma));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entradas numéricas!", "Erro", JOptionPane.ERROR_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Entradas vazias!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else if(evt.getSource()==janela.getClear()){
            janela.getPrimeiro().setText("");
            janela.getSegundo().setText("");
            janela.getResultado().setText("");
        }
        
    }
}
