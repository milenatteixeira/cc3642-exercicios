package com.mycompany.exercicio5;

/**
 *
 * @author milena
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <=31){
            this.dia = dia;
        }        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0 && mes<13){
            this.mes = mes;
        }
        if(mes==2 && (dia==31 || dia==30)){
            this.dia = 29;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibeData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }    
}
