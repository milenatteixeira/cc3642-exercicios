/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PhoneBook> contatos = new ArrayList<>();
        String op, nome;
        Integer telefone;
        
        try{
            FileReader read = new FileReader("contatos.txt");
            BufferedReader buffReader = new BufferedReader(read);
            String str;
            
            while((str = buffReader.readLine())!=null){
                String arr[] = new String[20];
                arr = str.split(" ");
                contatos.add(new PhoneBook(arr[0], Integer.parseInt(arr[1])));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        while(true){
            System.out.println("\n\nDigite uma das seguintes opções:\n"
                    + "n. [nova entrada]\n"
                    + "d. [apaga registro da agenda]\n"
                    + "p. [imprime toda a agenda]\n"
                    + "q. [sai do programa]\n");
            op = input.nextLine();
            
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
                case "q":
                    try{
                        FileWriter file = new FileWriter("contatos.txt");
                        PrintWriter writeFile = new PrintWriter(file);
                        
                        for(int i = 0; i < contatos.size(); i++){
                            writeFile.println(contatos.get(i).getNome()+" "+contatos.get(i).getTelefone());
                        }
                        file.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
                            
            }
            if(op.equals("q")){
                break;
            }
        }
    }
}
