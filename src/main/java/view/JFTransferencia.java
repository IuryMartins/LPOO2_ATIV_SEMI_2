/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conta;

/**
 *
 * @author iuryi
 */
public class JFTransferencia extends javax.swing.JFrame {
ArrayList<Conta> Contas;
    /**
     * Creates new form JFTransferencia
     */
    public JFTransferencia() {
        initComponents();
        Contas  = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTranferencia = new javax.swing.JPanel();
        LabelNumContaOrigemTransferencia = new javax.swing.JLabel();
        TextFieldInserirNumContaDestinoTransferencia = new javax.swing.JTextField();
        LabelValorTransferencia = new javax.swing.JLabel();
        TextFieldInserirValorTransferencia = new javax.swing.JTextField();
        LabelNumContaDestinoTransferencia = new javax.swing.JLabel();
        TextFieldInserirNumContaOrigemTransferencia = new javax.swing.JTextField();
        ButtonConfirmarTransferencia = new javax.swing.JButton();
        ButtonCancelarTransferencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTranferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Transferência"));

        LabelNumContaOrigemTransferencia.setText("N° da Conta de Origem:");

        TextFieldInserirNumContaDestinoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldInserirNumContaDestinoTransferenciaActionPerformed(evt);
            }
        });

        LabelValorTransferencia.setText("Valor da Transferência:");

        TextFieldInserirValorTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldInserirValorTransferenciaActionPerformed(evt);
            }
        });

        LabelNumContaDestinoTransferencia.setText("N° da Conta de Destino:");

        TextFieldInserirNumContaOrigemTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldInserirNumContaOrigemTransferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTranferenciaLayout = new javax.swing.GroupLayout(PanelTranferencia);
        PanelTranferencia.setLayout(PanelTranferenciaLayout);
        PanelTranferenciaLayout.setHorizontalGroup(
            PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTranferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTranferenciaLayout.createSequentialGroup()
                        .addComponent(LabelNumContaOrigemTransferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldInserirNumContaOrigemTransferencia))
                    .addGroup(PanelTranferenciaLayout.createSequentialGroup()
                        .addComponent(LabelValorTransferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldInserirValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTranferenciaLayout.createSequentialGroup()
                        .addComponent(LabelNumContaDestinoTransferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldInserirNumContaDestinoTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTranferenciaLayout.setVerticalGroup(
            PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTranferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumContaOrigemTransferencia)
                    .addComponent(TextFieldInserirNumContaOrigemTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNumContaDestinoTransferencia)
                    .addComponent(TextFieldInserirNumContaDestinoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PanelTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValorTransferencia)
                    .addComponent(TextFieldInserirValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonConfirmarTransferencia.setText("Confirmar");
        ButtonConfirmarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmarTransferenciaActionPerformed(evt);
            }
        });

        ButtonCancelarTransferencia.setText("Cancelar");
        ButtonCancelarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarTransferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTranferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonConfirmarTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCancelarTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonConfirmarTransferencia)
                    .addComponent(ButtonCancelarTransferencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldInserirNumContaOrigemTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldInserirNumContaOrigemTransferenciaActionPerformed
        // TODO add your handling code here:
        TextFieldInserirNumContaOrigemTransferencia.getText();
    }//GEN-LAST:event_TextFieldInserirNumContaOrigemTransferenciaActionPerformed

    private void TextFieldInserirNumContaDestinoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldInserirNumContaDestinoTransferenciaActionPerformed
        // TODO add your handling code here:
        TextFieldInserirNumContaDestinoTransferencia.getText();
    }//GEN-LAST:event_TextFieldInserirNumContaDestinoTransferenciaActionPerformed

    private void TextFieldInserirValorTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldInserirValorTransferenciaActionPerformed
        // TODO add your handling code here:
        TextFieldInserirValorTransferencia.getText();
    }//GEN-LAST:event_TextFieldInserirValorTransferenciaActionPerformed

    private void ButtonConfirmarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmarTransferenciaActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<Contas.size();i++){
            if(TextFieldInserirNumContaOrigemTransferencia.getText().equals(Contas.get(i).getNumero())&& TextFieldInserirNumContaDestinoTransferencia.getText().equals(Contas.get(i).getNumero())){
            
        //    TextFieldInserirValorTransferencia.getText(); Precisa ser numero somar a conta de destino E subtrair da conta de origem
            JOptionPane.showMessageDialog(this,"Saldo transferido com sucesso.");
            TextFieldInserirNumContaOrigemTransferencia.setText("");
            TextFieldInserirNumContaDestinoTransferencia.setText("");
            }
                   else{
            JOptionPane.showMessageDialog(this,"Transferencia falhou");
            TextFieldInserirNumContaOrigemTransferencia.setText("");
            TextFieldInserirNumContaDestinoTransferencia.setText("");
            
        }
        }
    }//GEN-LAST:event_ButtonConfirmarTransferenciaActionPerformed

    private void ButtonCancelarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarTransferenciaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarTransferenciaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarTransferencia;
    private javax.swing.JButton ButtonConfirmarTransferencia;
    private javax.swing.JLabel LabelNumContaDestinoTransferencia;
    private javax.swing.JLabel LabelNumContaOrigemTransferencia;
    private javax.swing.JLabel LabelValorTransferencia;
    private javax.swing.JPanel PanelTranferencia;
    private javax.swing.JTextField TextFieldInserirNumContaDestinoTransferencia;
    private javax.swing.JTextField TextFieldInserirNumContaOrigemTransferencia;
    private javax.swing.JTextField TextFieldInserirValorTransferencia;
    // End of variables declaration//GEN-END:variables
}
