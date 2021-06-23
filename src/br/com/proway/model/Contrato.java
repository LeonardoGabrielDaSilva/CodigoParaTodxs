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

    public float calculaValorParcelaSemJuros() {
        return (float) Math.round((valor / parcelas)*100)/100;
    }

    public float calculaValorParcelaComJuros() {
        return (float) Math.round((calculaJurosPorParcela() + calculaValorParcelaSemJuros())*100)/100;
    }

    public float calculaJurosPorParcela() {
        return (float) Math.round((valor * JUROS)*100)/100;
    }

    public float calculaJurosTotal() {
        return (float) Math.round((calculaJurosPorParcela() * parcelas)*100)/100;
    }

    public float getPorcentagemJuros() {
        return JUROS * 100;
    }

    public float calculaTotalDivida() {
        return (float) Math.round((calculaJurosTotal() + valor)*100)/100;
    }

}
