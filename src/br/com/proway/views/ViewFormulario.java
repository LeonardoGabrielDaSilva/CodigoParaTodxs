/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.views;

import br.com.proway.model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Gabriel
 */
public class ViewFormulario extends javax.swing.JFrame {

    private Pessoa pessoa;
    private ViewEntrada telaPai;
    private ViewEndereco telaFilha;

    public ViewFormulario() {
        initComponents();
    }

    public ViewFormulario(ViewEntrada telaPai, Pessoa pessoa) {
        this.pessoa = pessoa;
        this.telaPai = telaPai;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxEmprestimo = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        boxQntdFilhos = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boxCpfNegativado = new javax.swing.JComboBox<>();
        boxOcupacao = new javax.swing.JComboBox<>();
        boxEscolaridade = new javax.swing.JComboBox<>();
        boxIdade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        boxRenda = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Renda Mensal");

        jLabel5.setText("Motivo do Empréstimo");

        boxEmprestimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Viagens", "Estudos", "Dívidas", "Compras", "Comprar uma casa", "Comprar um carro", "Casamento", "Investimento", "Outro(s)" }));
        boxEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEmprestimoActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnContinuar.setMinimumSize(new java.awt.Dimension(85, 25));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF Negativado");

        boxQntdFilhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "0", "1", "2", "3+" }));
        boxQntdFilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxQntdFilhosActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnVoltar.setMinimumSize(new java.awt.Dimension(85, 25));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Qntd. de Filhos");

        boxCpfNegativado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));
        boxCpfNegativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCpfNegativadoActionPerformed(evt);
            }
        });

        boxOcupacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Autônomo", "Estudante", "Aposentado ou Pensionista", "Funcionário Público", "Empresário", "Assalariado" }));
        boxOcupacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOcupacaoActionPerformed(evt);
            }
        });

        boxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fundamendal Incompleto", "Fundamental Completo", "Ensino Médio Incompleto", "Ensino Médio Completo", "Ensino Superior Incompleto", "Ensino Superior Completo" }));
        boxEscolaridade.setBorder(null);
        boxEscolaridade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boxEscolaridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEscolaridadeActionPerformed(evt);
            }
        });

        boxIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "18-25 Anos", "26-40 Anos", "41-64 Anos", "+65 Anos" }));
        boxIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIdadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Escolaridade");

        jLabel3.setText("Ocupação");

        jLabel12.setText("Idade");

        boxRenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Até R$1200", "Entre R$1200 e R$2500", "Entre R$2500 e R$4000", "Entre R$4000 e R$5000", "Mais de R$5000" }));
        boxRenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRendaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Informe suas informações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxQntdFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(boxEscolaridade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxOcupacao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxRenda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxCpfNegativado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxQntdFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCpfNegativado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEmprestimoActionPerformed

    private void boxQntdFilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxQntdFilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxQntdFilhosActionPerformed

    private void boxCpfNegativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCpfNegativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCpfNegativadoActionPerformed

    private void boxOcupacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOcupacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxOcupacaoActionPerformed

    private void boxEscolaridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEscolaridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEscolaridadeActionPerformed

    private void boxRendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRendaActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (verificaCampos()) {
            PopulaPessoa();
            CriaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        telaPai.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void boxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIdadeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCpfNegativado;
    private javax.swing.JComboBox<String> boxEmprestimo;
    private javax.swing.JComboBox<String> boxEscolaridade;
    private javax.swing.JComboBox<String> boxIdade;
    private javax.swing.JComboBox<String> boxOcupacao;
    private javax.swing.JComboBox<String> boxQntdFilhos;
    private javax.swing.JComboBox<String> boxRenda;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    /**
     * Verifica se os campes estão preenchidos
     * @return 
     */
    private boolean verificaCampos() {
        if (boxIdade.getSelectedIndex() != 0
                && boxQntdFilhos.getSelectedIndex() != 0
                && boxEscolaridade.getSelectedIndex() != 0
                && boxOcupacao.getSelectedIndex() != 0
                && boxRenda.getSelectedIndex() != 0
                && boxEmprestimo.getSelectedIndex() != 0
                && boxCpfNegativado.getSelectedIndex() != 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Dados Inválidos!\nPor favor, verifique os campos e tente novamente!");
            return false;
        }
    }

    /**
     * Cria a próxima tela e a empilha. Caso já haja uma tela empilhada acima,
     * apenas realiza a chamada dela.
     *
     * @param pessoa
     */
    private void CriaTelaFilha(Pessoa pessoa) {
        if (telaFilha == null) {
            telaFilha = new ViewEndereco(this, pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        } else {
            telaFilha.setPessoa(pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        }
    }

    /**
     * Popula a pessoa com as informações recebidas
     */
    private void PopulaPessoa() {
        pessoa.setIdade(boxIdade.getSelectedItem().toString());
        if (boxQntdFilhos.getSelectedItem().toString().equals("3+")) 
            pessoa.setQntdFilhos(3);
        else 
            pessoa.setQntdFilhos(Integer.parseInt(boxQntdFilhos.getSelectedItem().toString()));
        pessoa.setEscolaridade(boxEscolaridade.getSelectedItem().toString());
        pessoa.setOcupacao(boxOcupacao.getSelectedItem().toString());
        pessoa.setRendaMensal(boxRenda.getSelectedItem().toString());
        pessoa.setMotivoEmprestimo(boxEmprestimo.getSelectedItem().toString());
        if(boxCpfNegativado.getSelectedIndex() == 1)
            pessoa.setCpfNegativado(true);
        else
            pessoa.setCpfNegativado(false);
        
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
