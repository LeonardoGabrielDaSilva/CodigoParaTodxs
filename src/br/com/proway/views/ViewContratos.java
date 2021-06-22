/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.views;

import br.com.proway.model.Contrato;
import br.com.proway.model.Pessoa;
import br.com.proway.util.CalculosUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Gabriel
 */
public class ViewContratos extends javax.swing.JFrame {

    private Pessoa pessoa;
    private ViewRevisao telaFilha;
    private List<Contrato> lista = new ArrayList<>();

    public ViewContratos() {
        initComponents();
    }

    public ViewContratos(Pessoa pessoa) {
        initComponents();
        this.pessoa = pessoa;
        CalculosUtil util = new CalculosUtil();

        if (util.calculaRisco(pessoa)) {
            criaContratos();
        } else {
            finalizaPrograma();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        areaContrato2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaContrato0 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaContrato4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaContrato5 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaContrato3 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        areaContrato1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        areaContrato2.setEditable(false);
        areaContrato2.setColumns(20);
        areaContrato2.setRows(5);
        areaContrato2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(areaContrato2);

        areaContrato0.setEditable(false);
        areaContrato0.setColumns(20);
        areaContrato0.setRows(5);
        areaContrato0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato0MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(areaContrato0);

        areaContrato4.setEditable(false);
        areaContrato4.setColumns(20);
        areaContrato4.setRows(5);
        areaContrato4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(areaContrato4);

        areaContrato5.setEditable(false);
        areaContrato5.setColumns(20);
        areaContrato5.setRows(5);
        areaContrato5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(areaContrato5);

        areaContrato3.setEditable(false);
        areaContrato3.setColumns(20);
        areaContrato3.setRows(5);
        areaContrato3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato3MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(areaContrato3);

        areaContrato1.setEditable(false);
        areaContrato1.setColumns(20);
        areaContrato1.setRows(5);
        areaContrato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaContrato1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(areaContrato1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Selecione o contrato desejado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void areaContrato0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato0MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(0).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(0).getParcelas()
                + "\nValor das Parcelas: " + lista.get(0).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(0));
            criaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_areaContrato0MouseClicked

    private void areaContrato1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato1MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(1).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(1).getParcelas()
                + "\nValor das Parcelas: " + lista.get(1).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(1));
            criaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_areaContrato1MouseClicked

    private void areaContrato2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato2MouseClicked

        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(2).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(2).getParcelas()
                + "\nValor das Parcelas: " + lista.get(2).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(2));
            criaTelaFilha(pessoa);

        }
    }//GEN-LAST:event_areaContrato2MouseClicked

    private void areaContrato3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato3MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(3).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(3).getParcelas()
                + "\nValor das Parcelas: " + lista.get(3).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(3));
            criaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_areaContrato3MouseClicked

    private void areaContrato4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato4MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(4).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(4).getParcelas()
                + "\nValor das Parcelas: " + lista.get(4).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(4));
            criaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_areaContrato4MouseClicked

    private void areaContrato5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrato5MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Valor do Empréstimo: R$" + lista.get(5).getValor()
                + "\nQuantidade de Parcelas: " + lista.get(5).getParcelas()
                + "\nValor das Parcelas: " + lista.get(5).calculaValorParcelaComJuros()
                + "\n\n Deseja confirmar este contrato?", "Confirmação de Contrato", JOptionPane.YES_NO_OPTION) == 0) {
            pessoa.setContrato(lista.get(5));
            criaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_areaContrato5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaContrato0;
    private javax.swing.JTextArea areaContrato1;
    private javax.swing.JTextArea areaContrato2;
    private javax.swing.JTextArea areaContrato3;
    private javax.swing.JTextArea areaContrato4;
    private javax.swing.JTextArea areaContrato5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * Finaliza o programa
     */
    private void finalizaPrograma() {

        System.exit(0);

    }

    /**
     * Popula as áreas de texto que se referem aos contratos
     */
    private void criaContratos() {
        int valor = (int) pessoa.getContrato().getValor();
        int parcelas = pessoa.getContrato().getParcelas();

        Contrato contrato = new Contrato();
        contrato.setValor(valor);
        contrato.setParcelas(parcelas);
        areaContrato0.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato0.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato0.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato0.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

        contrato = new Contrato();
        contrato.setValor(valor);
        contrato.setParcelas(parcelas + 6);
        areaContrato1.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato1.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato1.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato1.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

        contrato = new Contrato();
        contrato.setValor(valor + 5000);
        contrato.setParcelas(parcelas + 6);
        areaContrato2.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato2.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato2.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato2.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

        contrato = new Contrato();
        contrato.setValor(valor + 5000);
        contrato.setParcelas(parcelas + 12);
        areaContrato3.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato3.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato3.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato3.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

        contrato = new Contrato();
        contrato.setValor(valor + 2500);
        contrato.setParcelas(parcelas + 6);
        areaContrato4.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato4.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato4.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato4.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

        contrato = new Contrato();
        contrato.setValor(valor + 2500);
        contrato.setParcelas(parcelas + 12);
        areaContrato5.append("Valor de Empréstimo: R$" + contrato.getValor());
        areaContrato5.append("\nQuantidade de parcelas: " + contrato.getParcelas());
        areaContrato5.append("\nValor das parcelas: R$" + contrato.calculaJurosPorParcela());
        areaContrato5.append("\nValor de juros mensal: " + contrato.getPorcentagemJuros() + "%");
        lista.add(contrato);

    }

    /**
     * Cria a próxima tela e a empilha. Caso já haja uma tela empilhada acima,
     * apenas realiza a chamada dela.
     *
     * @param pessoa
     */
    private void criaTelaFilha(Pessoa pessoa) {

        if (telaFilha == null) {
            telaFilha = new ViewRevisao(this, pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        } else {
            telaFilha.setPessoa(pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        }

    }

}
