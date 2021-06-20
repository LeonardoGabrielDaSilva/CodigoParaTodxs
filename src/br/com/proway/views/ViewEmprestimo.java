/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.views;

import br.com.proway.model.Contrato;
import br.com.proway.model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Gabriel
 */
public class ViewEmprestimo extends javax.swing.JFrame {

    private ViewEntrada telaFilha;
    private Pessoa pessoa;

    public ViewEmprestimo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraValor = new javax.swing.JSlider();
        labelValor = new javax.swing.JLabel();
        labelParcelas = new javax.swing.JLabel();
        barraParcela = new javax.swing.JSlider();
        labelTotal = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraValor.setMaximum(24);
        barraValor.setValue(0);
        barraValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraValorStateChanged(evt);
            }
        });

        labelValor.setText("VALOR DO EMPRÉSTIMO: R$1000");

        labelParcelas.setText("PARCELAS: 6x ");

        barraParcela.setMaximum(30);
        barraParcela.setValue(0);
        barraParcela.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraParcelaStateChanged(evt);
            }
        });

        labelTotal.setText("PARCELAS DE R$201,0 EM 6 VEZES");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Empréstimo Serasa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Selecione o empréstimo desejado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(barraValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelValor))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelParcelas)
                                        .addComponent(barraParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelParcelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContinuar)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja continuar?", "Confirmação de Dados", JOptionPane.YES_NO_OPTION) == 0) {
            PopulaPessoa();
            CriaTelaFilha();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void barraValorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraValorStateChanged
        labelValor.setText("VALOR DO EMPRÉSTIMO: R$" + (barraValor.getValue() + 1) * 1000);
        double valor = calculaValor();
        labelTotal.setText("PARCELAS DE R$" + valor + " EM " + (barraParcela.getValue() + 6) + " VEZES");
    }//GEN-LAST:event_barraValorStateChanged

    private void barraParcelaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraParcelaStateChanged
        labelParcelas.setText("PARCELAS: " + (barraParcela.getValue() + 6) + "x");
        int valor = calculaValor();
        labelTotal.setText("PARCELAS DE R$" + valor + " EM " + (barraParcela.getValue() + 6) + " VEZES");
    }//GEN-LAST:event_barraParcelaStateChanged

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
            java.util.logging.Logger.getLogger(ViewEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraParcela;
    private javax.swing.JSlider barraValor;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelParcelas;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables

    /**
     * Cria a próxima tela e a empilha. Caso já haja uma tela empilhada acima,
     * apenas realiza a chamada dela.
     *
     * @param pessoa
     */
    private void CriaTelaFilha() {
        if (telaFilha == null) {
            telaFilha = new ViewEntrada(this, pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        } else {
            telaFilha.setPessoa(pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        }
    }

    /**
     * Faz os cálculos para saber o valor de cada parcela
     * @return 
     */
    private int calculaValor() {
        double valorEmprestimo = (barraValor.getValue() + 1) * 1000;
        double juros = 0.035 * valorEmprestimo;
        int parcelas = barraParcela.getValue() + 6;
        int valor = (int) ((valorEmprestimo + (juros * parcelas)) / parcelas);
        return valor;
    }

    /**
     * Popula a pessoa com um contrato, com as informações recebidas
     */
    private void PopulaPessoa() {
        Contrato contrato = new Contrato();
        contrato.setParcelas(barraParcela.getValue() + 6);
        contrato.setValor((barraValor.getValue() + 1) * 1000);
        Pessoa pessoa = new Pessoa();
        pessoa.setContrato(contrato);
        this.pessoa=pessoa;
        
    }

}
