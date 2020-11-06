/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nome, sobrenome, curso;
        int idade;
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome: ", "Título", JOptionPane.INFORMATION_MESSAGE);
        sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: ");
        curso = JOptionPane.showInputDialog("Digite o curso: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        
        Aluno a1 = new Aluno(curso, nome, sobrenome, idade);
        
        JOptionPane.showMessageDialog(null, "a1");
        
        Aluno a2 = new Aluno();
        System.out.println(a2);
        
    }
}
