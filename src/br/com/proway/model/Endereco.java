/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.model;

/**
 *
 * @author Leonardo Gabriel
 */
public class Endereco {
    
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private int numeroCasa;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String cidade) {
        this.localidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String estado) {
        this.uf = estado;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    
    
}
