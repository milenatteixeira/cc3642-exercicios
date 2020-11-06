/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Agente> pessoas = new ArrayList<>();
        
        while(true){
            System.out.println("\n >>> MENU <<<\n [1]. Criar Empresário\n"
                    + " [2]. Criar Professor \n [3]. Criar Advogado \n"
                    + " [4]. Apresentar todos \n [0]. Sair\n"
                    + "Escolha uma opção: ");
            String escolha = input.nextLine();
            if(escolha.equals("1")){
                String nome, empresa;
                System.out.println("Digite o nome: ");
                nome = input.nextLine();
                System.out.println("Digite a empresa: ");
                empresa = input.nextLine();
                pessoas.add(new Empresario(nome, empresa));
            }else if(escolha.equals("2")){
                String nome, escola;
                System.out.println("Digite o nome: ");
                nome = input.nextLine();
                System.out.println("Digite a escola: ");
                escola = input.nextLine();
                pessoas.add(new Professor(nome, escola));
            }else if(escolha.equals("3")){
                String nome, oab;
                System.out.println("Digite o nome: ");
                nome = input.nextLine();
                System.out.println("Digite o OAB: ");
                oab = input.nextLine();
                pessoas.add(new Advogado(nome, oab));
            }else if(escolha.equals("4")){
                for(int i = 0; i<pessoas.size(); i++){
                    pessoas.get(i).apresentacao();
                }
                
                Random rand = new Random();                
                for(int i = 0; i<pessoas.size(); i++){
                    int r = rand.nextInt(10);
                    if(r<3){
                        pessoas.get(i).modo_agente_on();
                    }
                    pessoas.get(i).apresentacao();
                }
            }else
                break;
        }
    }
}
