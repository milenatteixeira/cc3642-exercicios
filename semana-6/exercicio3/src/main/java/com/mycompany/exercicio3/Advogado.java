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
public class Advogado extends Agente{
    private String oab;

    public Advogado(String nome, String oab) {
        setNome(nome);
        setProfissao("Advogado");
        this.oab = oab;
        setModo_agente(false);
    }
    
    @Override
    public void apresentacao(){
        if(isModo_agente()){
            System.out.println("AGENTE SMITH\n");
        }else{
            System.out.println("Nome: "+ getNome()+"\nProfissão: "+getProfissao()+
                "\nOAB: "+ oab);
        }
    }
}
