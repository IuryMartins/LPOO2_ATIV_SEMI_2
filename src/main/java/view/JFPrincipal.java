/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author iuryi
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        JMArquivo = new javax.swing.JMenu();
        JMSair = new javax.swing.JMenuItem();
        JMCadastro = new javax.swing.JMenu();
        JMCliente = new javax.swing.JMenu();
        JMItemNovoCliente = new javax.swing.JMenuItem();
        JMItemAtualizaCliente = new javax.swing.JMenuItem();
        JMItemDeletaCliente = new javax.swing.JMenuItem();
        JMConta = new javax.swing.JMenu();
        JMItemNovaConta = new javax.swing.JMenuItem();
        JMItemAtualizaConta = new javax.swing.JMenuItem();
        JMItemDeletaConta = new javax.swing.JMenuItem();
        JMOperaçoes = new javax.swing.JMenu();
        JMItemDeposito = new javax.swing.JMenuItem();
        JMItemSaque = new javax.swing.JMenuItem();
        JMItemTransferencia = new javax.swing.JMenuItem();
        JMRelatorio = new javax.swing.JMenu();
        JMItemRelatorioUmCliente = new javax.swing.JMenuItem();
        JMItemRelatorioTodosClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JMArquivo.setText("Arquivo");

        JMSair.setText("Sair");
        JMSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMSairActionPerformed(evt);
            }
        });
        JMArquivo.add(JMSair);

        jMenuBar1.add(JMArquivo);

        JMCadastro.setText("Cadastro");

        JMCliente.setText("Cliente");

        JMItemNovoCliente.setText("Novo");
        JMItemNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemNovoClienteActionPerformed(evt);
            }
        });
        JMCliente.add(JMItemNovoCliente);

        JMItemAtualizaCliente.setText("Atualizar");
        JMItemAtualizaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemAtualizaClienteActionPerformed(evt);
            }
        });
        JMCliente.add(JMItemAtualizaCliente);

        JMItemDeletaCliente.setText("Deletar");
        JMItemDeletaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemDeletaClienteActionPerformed(evt);
            }
        });
        JMCliente.add(JMItemDeletaCliente);

        JMCadastro.add(JMCliente);

        JMConta.setText("Conta");

        JMItemNovaConta.setText("Novo");
        JMItemNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemNovaContaActionPerformed(evt);
            }
        });
        JMConta.add(JMItemNovaConta);

        JMItemAtualizaConta.setText("Atualizar");
        JMItemAtualizaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemAtualizaContaActionPerformed(evt);
            }
        });
        JMConta.add(JMItemAtualizaConta);

        JMItemDeletaConta.setText("Deletar");
        JMItemDeletaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemDeletaContaActionPerformed(evt);
            }
        });
        JMConta.add(JMItemDeletaConta);

        JMCadastro.add(JMConta);

        jMenuBar1.add(JMCadastro);

        JMOperaçoes.setText("Operações");

        JMItemDeposito.setText("Depósito");
        JMItemDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemDepositoActionPerformed(evt);
            }
        });
        JMOperaçoes.add(JMItemDeposito);

        JMItemSaque.setText("Saque");
        JMItemSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemSaqueActionPerformed(evt);
            }
        });
        JMOperaçoes.add(JMItemSaque);

        JMItemTransferencia.setText("Transferência");
        JMItemTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemTransferenciaActionPerformed(evt);
            }
        });
        JMOperaçoes.add(JMItemTransferencia);

        jMenuBar1.add(JMOperaçoes);

        JMRelatorio.setText("Relatório");

        JMItemRelatorioUmCliente.setText("Um Cliente");
        JMItemRelatorioUmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemRelatorioUmClienteActionPerformed(evt);
            }
        });
        JMRelatorio.add(JMItemRelatorioUmCliente);

        JMItemRelatorioTodosClientes.setText("Todos os Clientes");
        JMItemRelatorioTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemRelatorioTodosClientesActionPerformed(evt);
            }
        });
        JMRelatorio.add(JMItemRelatorioTodosClientes);

        jMenuBar1.add(JMRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_JMSairActionPerformed

    private void JMItemNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemNovoClienteActionPerformed
        new JFNovoCliente().setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_JMItemNovoClienteActionPerformed

    private void JMItemAtualizaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemAtualizaClienteActionPerformed
        new JFAtualizaCliente().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemAtualizaClienteActionPerformed

    private void JMItemDeletaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemDeletaClienteActionPerformed
        new JFDeletaCliente().setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_JMItemDeletaClienteActionPerformed

    private void JMItemNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemNovaContaActionPerformed
        new JFNovaConta().setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_JMItemNovaContaActionPerformed

    private void JMItemAtualizaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemAtualizaContaActionPerformed
        new JFAtualizaConta().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemAtualizaContaActionPerformed

    private void JMItemDeletaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemDeletaContaActionPerformed
        new JFDeletaConta().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemDeletaContaActionPerformed

    private void JMItemDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemDepositoActionPerformed
        new JFDeposito().setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_JMItemDepositoActionPerformed

    private void JMItemSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemSaqueActionPerformed
        new JFSaque().setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_JMItemSaqueActionPerformed

    private void JMItemTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemTransferenciaActionPerformed
        new JFTransferencia().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemTransferenciaActionPerformed

    private void JMItemRelatorioUmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemRelatorioUmClienteActionPerformed
        new JFRelatorioUmCliente().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemRelatorioUmClienteActionPerformed

    private void JMItemRelatorioTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemRelatorioTodosClientesActionPerformed
        new JFRelatorioTodosClientes().setVisible(true);
      //  this.setEnabled(false);
    }//GEN-LAST:event_JMItemRelatorioTodosClientesActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMArquivo;
    private javax.swing.JMenu JMCadastro;
    private javax.swing.JMenu JMCliente;
    private javax.swing.JMenu JMConta;
    private javax.swing.JMenuItem JMItemAtualizaCliente;
    private javax.swing.JMenuItem JMItemAtualizaConta;
    private javax.swing.JMenuItem JMItemDeletaCliente;
    private javax.swing.JMenuItem JMItemDeletaConta;
    private javax.swing.JMenuItem JMItemDeposito;
    private javax.swing.JMenuItem JMItemNovaConta;
    private javax.swing.JMenuItem JMItemNovoCliente;
    private javax.swing.JMenuItem JMItemRelatorioTodosClientes;
    private javax.swing.JMenuItem JMItemRelatorioUmCliente;
    private javax.swing.JMenuItem JMItemSaque;
    private javax.swing.JMenuItem JMItemTransferencia;
    private javax.swing.JMenu JMOperaçoes;
    private javax.swing.JMenu JMRelatorio;
    private javax.swing.JMenuItem JMSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}