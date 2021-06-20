/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.views;

import br.com.proway.model.Endereco;
import br.com.proway.model.Pessoa;
import br.com.proway.util.ConsultasUtil;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Gabriel
 */
public class ViewEndereco extends javax.swing.JFrame {

    private Pessoa pessoa;
    private ViewFormulario telaPai;
    private ViewContratos telaFilha;

    public ViewEndereco() {
        initComponents();
    }

    public ViewEndereco(ViewFormulario telaPai, Pessoa pessoa) {
        this.pessoa = pessoa;
        this.telaPai = telaPai;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        boxEstado = new javax.swing.JComboBox<>();
        btnCep = new javax.swing.JButton();
        txtNumeroCasa = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CEP");

        jLabel2.setText("Estado");

        jLabel3.setText("Cidade");

        jLabel4.setText("Bairro");

        jLabel5.setText("Logradouro");

        jLabel6.setText("Número");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        btnCep.setText("Buscar CEP");
        btnCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCepActionPerformed(evt);
            }
        });

        txtNumeroCasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Informe seu endereço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCep))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLogradouro, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar)
                    .addComponent(btnVoltar))
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (verificaCampos()
                && JOptionPane.showConfirmDialog(this, "Tem certeza que suas informações estão corretas?", "Confirmação de Dados", JOptionPane.YES_NO_OPTION) == 0) {
            PopulaPessoa();
            CriaTelaFilha(pessoa);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        telaPai.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCepActionPerformed
        popularCamposCep();
    }//GEN-LAST:event_btnCepActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JButton btnCep;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JFormattedTextField txtNumeroCasa;
    // End of variables declaration//GEN-END:variables

    /**
     * Cria a próxima tela e a empilha. Caso já haja uma tela empilhada acima,
     * apenas realiza a chamada dela.
     *
     * @param pessoa
     */
    private void CriaTelaFilha(Pessoa pessoa) {
        if (telaFilha == null) {
            telaFilha = new ViewContratos(pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        } else {
            telaFilha.setPessoa(pessoa);
            telaFilha.setVisible(true);
            this.setVisible(false);
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    private boolean verificaCampos() {
        if (boxEstado.getSelectedIndex() != 0
                && !txtCep.getText().endsWith(" ")
                && !txtCidade.getText().isEmpty()
                && !txtBairro.getText().isEmpty()
                && !txtLogradouro.getText().isEmpty()
                && !txtNumeroCasa.getText().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos inválidos");
            return false;
        }
    }

    /**
     * Popula a pessoa com as informações de endereço
     */
    private void PopulaPessoa() {
        Endereco endereco = new Endereco();
        endereco.setCep(txtCep.getText());
        endereco.setCidade(txtCidade.getText());
        endereco.setBairro(txtBairro.getText());
        endereco.setLogradouro(txtLogradouro.getText());
        endereco.setEstado(boxEstado.getSelectedItem().toString());
        endereco.setNumeroCasa(Integer.parseInt(txtNumeroCasa.getText()));
        pessoa.setEndereco(endereco);
    }

    /**
     * Realiza a busca do Cep e popula os campos com base no resultado
     */
    private void popularCamposCep() {
        ConsultasUtil consulta = new ConsultasUtil();
        Endereco endereco;
        try {
            endereco = consulta.buscarCep(txtCep.getText());
            if (endereco != null) {
                txtCidade.setText(endereco.getCidade());
                txtBairro.setText(endereco.getBairro());
                txtLogradouro.setText(endereco.getLogradouro());
                boxEstado.setSelectedItem(endereco.getEstado());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "CEP Inválido");
        }
    }
    

}
