/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 *
 * @author iuryi
 */
public class JFNovaConta extends javax.swing.JFrame {
ArrayList<Conta> Contas;
ArrayList<Cliente> ListaCliente;
double saldo;
    /**
     * Creates new form JFNovaConta
     */
    
    private void groupButton( ) {

ButtonGroup bg1 = new ButtonGroup( );

bg1.add(RadioButtonSelecionaTipoContaCorrenteNovaConta);
bg1.add(RadioButtonSelecionaTipoContaPoupancaNovaConta);
}
    public void CarregaTabelaCliente(){
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF","Nome","Sexo","Data de Nascimento","Endereço"},0);
    for(int i=0;i<ListaCliente.size();i++){
        modelo.addRow(new Object[]{ListaCliente.get(i).getCPF(),ListaCliente.get(i).getNome(),ListaCliente.get(i).getSexo(),ListaCliente.get(i).getDataNascimento(),ListaCliente.get(i).getEndereco()});
    }    
    TableSelecionaClienteNovaConta.setModel(modelo);
    }
    
    public JFNovaConta() {
      Contas  = new ArrayList();
      ListaCliente  = new ArrayList();
        initComponents();
        groupButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSelecionaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSelecionaClienteNovaConta = new javax.swing.JTable();
        RadioButtonSelecionaTipoContaCorrenteNovaConta = new javax.swing.JRadioButton();
        RadioButtonSelecionaTipoContaPoupancaNovaConta = new javax.swing.JRadioButton();
        LabelSaldoInicialNovaConta = new javax.swing.JLabel();
        TextFildInserirSaldoInicialNovaConta = new javax.swing.JTextField();
        ButtonSalvarNovaConta = new javax.swing.JButton();
        ButtonCancelarNovaConta = new javax.swing.JButton();
        LabelTipoNovaConta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelSelecionaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Cliente"));

        TableSelecionaClienteNovaConta.setAutoCreateRowSorter(true);
        TableSelecionaClienteNovaConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Sexo", "Data de Nascimento", "Endereço"
            }
        ));
        TableSelecionaClienteNovaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSelecionaClienteNovaContaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSelecionaClienteNovaConta);

        javax.swing.GroupLayout PanelSelecionaClienteLayout = new javax.swing.GroupLayout(PanelSelecionaCliente);
        PanelSelecionaCliente.setLayout(PanelSelecionaClienteLayout);
        PanelSelecionaClienteLayout.setHorizontalGroup(
            PanelSelecionaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelecionaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSelecionaClienteLayout.setVerticalGroup(
            PanelSelecionaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelecionaClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        RadioButtonSelecionaTipoContaCorrenteNovaConta.setText("Conta Corrente");
        RadioButtonSelecionaTipoContaCorrenteNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSelecionaTipoContaCorrenteNovaContaActionPerformed(evt);
            }
        });

        RadioButtonSelecionaTipoContaPoupancaNovaConta.setText("Conta Poupança");
        RadioButtonSelecionaTipoContaPoupancaNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSelecionaTipoContaPoupancaNovaContaActionPerformed(evt);
            }
        });

        LabelSaldoInicialNovaConta.setText("Saldo Inicial:");

        TextFildInserirSaldoInicialNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFildInserirSaldoInicialNovaContaActionPerformed(evt);
            }
        });

        ButtonSalvarNovaConta.setText("Salvar");
        ButtonSalvarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarNovaContaActionPerformed(evt);
            }
        });

        ButtonCancelarNovaConta.setText("Cancelar");
        ButtonCancelarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarNovaContaActionPerformed(evt);
            }
        });

        LabelTipoNovaConta.setText("Tipo de Conta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSelecionaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSalvarNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCancelarNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelSaldoInicialNovaConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFildInserirSaldoInicialNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTipoNovaConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioButtonSelecionaTipoContaCorrenteNovaConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioButtonSelecionaTipoContaPoupancaNovaConta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelSelecionaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoNovaConta)
                    .addComponent(RadioButtonSelecionaTipoContaCorrenteNovaConta)
                    .addComponent(RadioButtonSelecionaTipoContaPoupancaNovaConta))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelSaldoInicialNovaConta)
                    .addComponent(TextFildInserirSaldoInicialNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelarNovaConta)
                    .addComponent(ButtonSalvarNovaConta))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableSelecionaClienteNovaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSelecionaClienteNovaContaMouseClicked
        // TODO add your handling code here:
        TableSelecionaClienteNovaConta.getSelectedRow();
    }//GEN-LAST:event_TableSelecionaClienteNovaContaMouseClicked

    private void RadioButtonSelecionaTipoContaCorrenteNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSelecionaTipoContaCorrenteNovaContaActionPerformed
        // TODO add your handling code here:
        RadioButtonSelecionaTipoContaCorrenteNovaConta.isSelected();
        // ainda não descobri como implementar
        
    }//GEN-LAST:event_RadioButtonSelecionaTipoContaCorrenteNovaContaActionPerformed

    private void RadioButtonSelecionaTipoContaPoupancaNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSelecionaTipoContaPoupancaNovaContaActionPerformed
        // TODO add your handling code here:
        RadioButtonSelecionaTipoContaPoupancaNovaConta.isSelected();
        // ainda não descobri como implementar
        
    }//GEN-LAST:event_RadioButtonSelecionaTipoContaPoupancaNovaContaActionPerformed

    private void TextFildInserirSaldoInicialNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFildInserirSaldoInicialNovaContaActionPerformed
        // TODO add your handling code here:
        saldo = Double.parseDouble(TextFildInserirSaldoInicialNovaConta.getText());
        // ainda não descobri como implementar
    }//GEN-LAST:event_TextFildInserirSaldoInicialNovaContaActionPerformed

    private void ButtonSalvarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarNovaContaActionPerformed
        // TODO add your handling code here:
       
        
        
        Cliente c = new Cliente();
        Conta cb = RadioButtonSelecionaTipoContaCorrenteNovaConta.isSelected() 
                ? new ContaCorrente(c,saldo) 
                : new ContaPoupanca(c,saldo);
        c.adicionarConta(cb); 
        
        Conta cb = new Conta(/*?????*/,saldo);
       Contas.add(cb);
      // c.adicionarConta(cb);
        
        
        
        //if(RadioButtonSelecionaTipoContaCorrenteNovaConta.isSelected()){// ainda não esta certo
        //   Conta cb = new Conta();
       // Contas.add(cb);
       // }
      // else if(RadioButtonSelecionaTipoContaPoupancaNovaConta.isSelected()){ // ainda não esta certo
      //  Conta cb = new Conta();
      //  Contas.add(cb);
      //  }
       
       // ainda não descobri como implementar
       
    }//GEN-LAST:event_ButtonSalvarNovaContaActionPerformed

    private void ButtonCancelarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarNovaContaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarNovaContaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarNovaConta;
    private javax.swing.JButton ButtonSalvarNovaConta;
    private javax.swing.JLabel LabelSaldoInicialNovaConta;
    private javax.swing.JLabel LabelTipoNovaConta;
    private javax.swing.JPanel PanelSelecionaCliente;
    private javax.swing.JRadioButton RadioButtonSelecionaTipoContaCorrenteNovaConta;
    private javax.swing.JRadioButton RadioButtonSelecionaTipoContaPoupancaNovaConta;
    private javax.swing.JTable TableSelecionaClienteNovaConta;
    private javax.swing.JTextField TextFildInserirSaldoInicialNovaConta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
