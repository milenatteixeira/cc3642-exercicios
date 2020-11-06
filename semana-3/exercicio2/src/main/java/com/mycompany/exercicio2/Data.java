package com.mycompany.exercicio2;

import java.util.Calendar;

public class Data {
    private int dia, mes, ano;
    private String toStringMes;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int ano, String mes) {
        this.dia = dia;
        
        this.mes = mes.equals("janeiro") ? 1 : mes.equals("fevereiro") ? 2 :
                mes.equals("marco") ? 3 : mes.equals("abril") ? 4 : 
                mes.equals("maio") ? 5 : mes.equals("junho") ? 6 : 
                mes.equals("julho") ? 7 : mes.equals("agosto") ? 8 : 
                mes.equals("setembro") ? 9 : mes.equals("outubro") ? 10 : 
                mes.equals("novembro") ? 11 : mes.equals("dezembro") ? 12 : 0;
        
        this.ano = ano;        
    }
    
    public Data(int dia, int ano){
        Calendar data = Calendar.getInstance();
        
        data.set(Calendar.YEAR, ano);
        data.set(Calendar.DAY_OF_YEAR, dia);
        this.dia = data.get(Calendar.DAY_OF_MONTH);
        this.mes = data.get(Calendar.MONTH)+1;
        this.ano = ano;
    }

    public String getToStringMes() {
        return toStringMes;
    }

    public void setToStringMes(String toStringMes) {
        this.toStringMes = toStringMes;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
}
