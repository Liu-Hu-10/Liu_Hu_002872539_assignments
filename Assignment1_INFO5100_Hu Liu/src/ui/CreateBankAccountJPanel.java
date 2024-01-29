/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.BankAccount;
import model.BankAccountDirectory;

/**
 *
 * @author HU
 */
public class CreateBankAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    BankAccountDirectory bankAccountList;
    
    
    public CreateBankAccountJPanel(BankAccountDirectory bankAccountList) {
        initComponents();
        this.bankAccountList = bankAccountList;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        lblBankAccountTitle = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        lblDebtAmount = new javax.swing.JLabel();
        lblCreditAmount = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtAccountType = new javax.swing.JTextField();
        txtDebtAmount = new javax.swing.JTextField();
        txtCreditAmount = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        lblBankAccountTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBankAccountTitle.setText("Create Bank Account");

        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name:");

        lblOccupation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOccupation.setText("Occupation:");

        lblAccountType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAccountType.setText("Account Type:");

        lblDebtAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDebtAmount.setText("Debt Amount:");

        lblCreditAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCreditAmount.setText("Credit Amount:");

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        txtAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountTypeActionPerformed(evt);
            }
        });

        txtDebtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDebtAmountActionPerformed(evt);
            }
        });

        txtCreditAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditAmountActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBankAccountTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreditAmount)
                    .addComponent(lblDebtAmount)
                    .addComponent(lblAccountType)
                    .addComponent(lblOccupation)
                    .addComponent(lblPersonName))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDebtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreditAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAccountType, lblCreditAmount, lblDebtAmount, lblOccupation, lblPersonName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblBankAccountTitle)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOccupation)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDebtAmount)
                    .addComponent(txtDebtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreditAmount)
                    .addComponent(txtCreditAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSave)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountType, lblCreditAmount, lblDebtAmount, lblOccupation, lblPersonName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountTypeActionPerformed

    private void txtDebtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDebtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDebtAmountActionPerformed

    private void txtCreditAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditAmountActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String personName = txtPersonName.getText();
        String occupation = txtOccupation.getText();
        String acountType = txtAccountType.getText();
        String debitAmount = txtDebtAmount.getText();
        String creditAmount = txtCreditAmount.getText();
        
        BankAccount ba = bankAccountList.addNewBankAccount();
        
        ba.setPersonName(personName);
        ba.setOccupation(occupation);
        ba.setAccountType(acountType);
        ba.setDebtAmount(debitAmount);
        ba.setCreditAmount(creditAmount);
        
        JOptionPane.showMessageDialog(this, "New Bank Account Added");
        txtPersonName.setText("");
        txtOccupation.setText("");        
        txtAccountType.setText("");
        txtDebtAmount.setText("");
        txtCreditAmount.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblBankAccountTitle;
    private javax.swing.JLabel lblCreditAmount;
    private javax.swing.JLabel lblDebtAmount;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPersonName;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtCreditAmount;
    private javax.swing.JTextField txtDebtAmount;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPersonName;
    // End of variables declaration//GEN-END:variables
}
