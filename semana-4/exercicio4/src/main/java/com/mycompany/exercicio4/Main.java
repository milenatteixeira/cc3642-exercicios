/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PhoneBook> contatos = new ArrayList<>();
        String op, nome;
        Integer telefone;
        
        while(true){
            System.out.println("\n\nDigite uma das seguintes opções:\n"
                    + "n. [nova entrada]\n"
                    + "d. [apaga registro da agenda]\n"
                    + "p. [imprime toda a agenda]\n"
                    + "q. [sai do programa]\n");
            op = input.nextLine();
            
            if(op.equals("q")){
                break;
            }
            
            switch(op){
                case "n":
                    System.out.println("\nDigite o nome: ");
                    nome = input.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = Integer.parseInt(input.nextLine());
                    PhoneBook contato = new PhoneBook(nome, telefone);
                    contatos.add(contato);
                    break;
                case "d":
                    System.out.println("\nDigite o nome: ");
                    nome = input.nextLine();
                    for(int i = 0; i < contatos.size(); i++){
                        if(contatos.get(i).getNome().equals(nome)){
                            contatos.remove(i);
                        }
                    }
                    break;
                case "p":
                    for(int i = 0; i < contatos.size(); i++){
                        System.out.println("\nContato "+(i+1)+":\nNome: "+contatos.get(i).getNome()+
                               "\nTelefone: "+contatos.get(i).getTelefone());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
