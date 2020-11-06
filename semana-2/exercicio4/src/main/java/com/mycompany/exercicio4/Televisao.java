package com.mycompany.exercicio4;

/**
 *
 * @author milena
 */
public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal<1 || canal>150){
            canal = 1;
        }
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void alteraVolume(int volume){
        this.volume += volume;
    }
    
    public void alteraCanal(boolean isUp){
        if(isUp){
            canal += 1;
        }else{
            canal -=1;
        }
    }

    @Override
    public String toString() {
        return "\nModelo = " + modelo + "\nPreco = " + preco + "\nTamanho = " + tamanho + 
                "\nVolume = " + volume + "\nCanal = " + canal + "\nLigada = " + ligada;
    }
    
    
}
