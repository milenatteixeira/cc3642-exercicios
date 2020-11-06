package com.mycompany.exercicio3;

/**
 *
 * @author milena
 */
public class Vereador extends Politico{
    private String municipio;

    public Vereador(String nome, String partido, String municipio, String estado) {
        setNome(nome);
        setPartido(partido);
        this.municipio = municipio;
        setEstado(estado);
        setFuncao("Vereador");
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String toString() {
        return getImprimir()+ "\nMunicipio: " + municipio;
    }

}
