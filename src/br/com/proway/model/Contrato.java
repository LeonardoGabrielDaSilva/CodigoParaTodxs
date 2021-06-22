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
public class Contrato {
    
    private final float JUROS = 0.035f;
    private float valor;
    private int parcelas;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float getJuros() {
        return JUROS;
    }
    
    public float calculaValorParcelaSemJuros(){
        return (float) valor / parcelas;
    }
    
    public float calculaValorParcelaComJuros(){
        return (float) calculaJurosPorParcela() + calculaValorParcelaSemJuros();
    }
    
    public float calculaJurosPorParcela(){
        return (float) valor * JUROS;
    }
    
    public float calculaJurosTotal(){
        return (float) calculaJurosPorParcela() * parcelas;
    }
    
    public float getPorcentagemJuros(){
        return JUROS*100;
    }
    
    public float calculaTotalDivida(){
        return calculaJurosTotal() + valor;
    }
    
    
}
