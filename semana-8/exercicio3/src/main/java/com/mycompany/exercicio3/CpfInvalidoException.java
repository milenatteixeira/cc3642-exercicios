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
public class CpfInvalidoException extends RuntimeException{
    public CpfInvalidoException(String mensagem){
        super(mensagem);
    }
}
