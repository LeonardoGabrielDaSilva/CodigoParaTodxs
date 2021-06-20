/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.util;

import br.com.proway.model.Contrato;
import br.com.proway.model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Gabriel
 */
public class CalculosUtil {

    /**
     * Calcula se é arriscado o contrato com os dados informados pelo usuário
     * @param pessoa
     * @return 
     */
    public boolean calculaRisco(Pessoa pessoa) {
        try {
            calculaConfiabilidade(pessoa);
            calcularParcelaIdeal(pessoa);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Desculpe, não há nenhuma oferta para você");
            JOptionPane.showMessageDialog(null, "Desculpe, não há nenhuma oferta para você", "Sem Ofertas", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    /**
     * Calcula pontuação da escolaridade do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaEscolaridade(String escolaridade) {
        int valor = 0;
        switch (escolaridade) {
            case "Fundamental Incompleto":
                valor = 0;
                break;
            case "Fundamental Completo":
                valor = 10;
                break;
            case "Ensino Médio Incompleto":
                valor = 10;
                break;
            case "Ensino Médio Completo":
                valor = 15;
                break;
            case "Ensino Superior Incompleto":
                valor = 20;
                break;
            case "Ensino Superior Completo":
                valor = 30;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula pontuação do cpf negativado do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaCpfNegativado(boolean negativado) {
        if (negativado == true) {
            return 2;
        } else {
            return 1;
        }
    }

    /**
     * Calcula pontuação da idade do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaIdade(String idade) {
        int valor = 0;
        switch (idade) {
            case "18-25 Anos":
                valor = 10;
                break;
            case "26-40 Anos":
                valor = 20;
                break;
            case "41-64 Anos":
                valor = 30;
                break;
            case "+65 Anos":
                valor = 0;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula pontuação do motivo de empréstimo do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaMotivoEmprestimo(String motivoEmprestimo) {
        int valor = 0;
        switch (motivoEmprestimo) {
            case "Viagens":
                valor = 20;
                break;
            case "Estudos":
                valor = 40;
                break;
            case "Dívidas":
                valor = 0;
                break;
            case "Compras":
                valor = 10;
                break;
            case "Comprar uma casa":
                valor = 30;
                break;
            case "Comprar um carro":
                valor = 20;
                break;
            case "Casamento":
                valor = 30;
                break;
            case "Investimento":
                valor = 40;
                break;
            case "Outro(s)":
                valor = 10;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula pontuação da ocupação do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaOcupacao(String ocupacao) {
        int valor = 0;
        switch (ocupacao) {
            case "Autônomo":
                valor = 30;
                break;
            case "Estudante":
                valor = 10;
                break;
            case "Aposentado ou Pensionista":
                valor = 0;
                break;
            case "Funcionário Público":
                valor = 40;
                break;
            case "Empresário":
                valor = 50;
                break;
            case "Assalariado":
                valor = 20;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula pontuação da quantidade de filhos do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaQntdFilhos(int qntdFilhos) {
        int valor = 0;
        switch (qntdFilhos) {
            case 0:
                valor = 30;
                break;
            case 1:
                valor = 20;
                break;
            case 2:
                valor = 10;
                break;
            case 3:
                valor = 0;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula pontuação da renda mensal do usuário
     * @param escolaridade
     * @return 
     */
    private int calculaRendaMensal(String rendaMensal) {
        int valor = 0;
        switch (rendaMensal) {
            case "Até R$1200":
                valor = 1000;
                break;
            case "Entre R$1200 e R$2500":
                valor = 2000;
                break;
            case "Entre R$2500 e R$4000":
                valor = 3000;
                break;
            case "Entre R$4000 e R$5000":
                valor = 4500;
                break;
            case "Mais de R$5000":
                valor = 6000;
                break;
            default:
                break;
        }
        return valor;
    }

    /**
     * Calcula a confiabilidade do usuário
     * @param escolaridade
     * @return 
     */
    private void calculaConfiabilidade(Pessoa pessoa) throws Exception {
        int escolaridade = calculaEscolaridade(pessoa.getEscolaridade());
        int negativado = calculaCpfNegativado(pessoa.getCpfNegativado());
        int idade = calculaIdade(pessoa.getIdade());
        int motivoEmprestimo = calculaMotivoEmprestimo(pessoa.getMotivoEmprestimo());
        int ocupacao = calculaOcupacao(pessoa.getOcupacao());
        int qntdFilhos = calculaQntdFilhos(pessoa.getQntdFilhos());
        int pontuacao = ((escolaridade * 2) + idade + (motivoEmprestimo * 4) + (ocupacao * 2) + qntdFilhos) / negativado;
        int valorMaximo;

        if (pontuacao > 400) {
            valorMaximo = 50000;
        } else if (pontuacao > 320) {
            valorMaximo = 30000;
        } else if (pontuacao > 200) {
            valorMaximo = 15000;
        } else if (pontuacao > 100) {
            valorMaximo = 7500;
        } else {
            valorMaximo = 0;
        }

        if (valorMaximo < pessoa.getContrato().getValor()) {
            System.out.println(valorMaximo);
            System.out.println(pessoa.getContrato().getValor());
            throw new Exception("Valor máximo superior ao solicitado");
        } 
    }

    /**
     * Calcula a parcela ideal do usuário, com base de ser o 1/3 do valor do salário do mesmo.
     * @param escolaridade
     * @return 
     */
    private void calcularParcelaIdeal(Pessoa pessoa) throws Exception {
        Contrato contrato = pessoa.getContrato();
        int renda = calculaRendaMensal(pessoa.getRendaMensal());
        boolean flag = true;
        double juros = contrato.getValor() * contrato.getJuros();
        int parcela = (int) (contrato.getValor() + (juros * contrato.getParcelas())) / contrato.getParcelas();
        int i = 0;
        do {
            if (parcela > renda / 3) {
                parcela = (int) (contrato.getValor() + (juros * contrato.getParcelas() + i)) / (contrato.getParcelas() + i);
                i++;
            } else {
                contrato.setParcelas(contrato.getParcelas()+i);
                flag = false;
            }
        } while (flag);
        if (contrato.getParcelas() > 48) {
            throw new Exception("Valor de parcelas excedeu o limite");
        } else {
            contrato.setParcelas(contrato.getParcelas());
            pessoa.setContrato(contrato);
        }

    }

    

}
