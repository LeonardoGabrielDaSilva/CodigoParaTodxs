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
public class Pessoa {
    
    private String cpf;
    private String nome;
    private String email;
    private String celular;
    private String escolaridade;
    private String ocupacao;
    private String motivoEmprestimo;
    private String idade;
    private String rendaMensal;
    private boolean cpfNegativado;
    private int qntdFilhos;
    private Endereco endereco;
    private Contrato contrato;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String telefone) {
        this.celular = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getMotivoEmprestimo() {
        return motivoEmprestimo;
    }

    public void setMotivoEmprestimo(String motivoEmprestimo) {
        this.motivoEmprestimo = motivoEmprestimo;
    }

    public boolean getCpfNegativado() {
        return cpfNegativado;
    }

    public void setCpfNegativado(boolean cpfNegativado) {
        this.cpfNegativado = cpfNegativado;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public int getQntdFilhos() {
        return qntdFilhos;
    }

    public void setQntdFilhos(int qntdFilhos) {
        this.qntdFilhos = qntdFilhos;
    }

    public String getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(String rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
    
}
