package com.mycompany.exercicio7;

/**
 *
 * @author milena
 */
public class Invoice {
    private String id;
    private String descricao;
    private int quantidade;
    private double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade<0){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0){
            this.preco = 0;
        }else{
            this.preco = preco;
        }
    }
    
    public double getInvoiceAmount(){
        return quantidade*preco;
    }

    @Override
    public String toString() {
        return "\nId = " + id + "\nDescrição = " + descricao + 
                "\nQuantidade = " + quantidade + "\nPreço=" + preco + 
                "\nPreço total = " + getInvoiceAmount();
    }
    
    
}
