/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

/**
 *
 * @author milena
 */
public class Empresario extends Agente{
    private String empresa;

    public Empresario(String nome, String empresa) {
        setNome(nome);
        setProfissao("Empresário");
        this.empresa = empresa;
        setModo_agente(false);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public void apresentacao(){
        if(isModo_agente()){
            System.out.println("AGENTE SMITH\n");
        }else{
            System.out.println("Nome: "+ getNome()+"\nProfissão: "+getProfissao()+
                "\nEmpresa: "+ empresa);
        }
    }
}
