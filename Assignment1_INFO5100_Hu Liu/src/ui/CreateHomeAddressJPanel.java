/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.HomeAddress;
import model.HomeAddressDirectory;

/**
 *
 * @author HU
 */
public class CreateHomeAddressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    HomeAddressDirectory homeAddressList;
    
    
    public CreateHomeAddressJPanel(HomeAddressDirectory homeAddressList) {
        initComponents();
        this.homeAddressList = homeAddressList;
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
        lblHomeAddressTitle = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblLine = new javax.swing.JLabel();
        lblZIPCode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        txtLine = new javax.swing.JTextField();
        txtZIPCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        lblHomeAddressTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeAddressTitle.setText("Create Home Address");

        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name:");

        lblLine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLine.setText("Line:");

        lblZIPCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZIPCode.setText("ZIP Code:");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblState.setText("State:");

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        txtLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineActionPerformed(evt);
            }
        });

        txtZIPCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZIPCodeActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
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
                .addComponent(lblHomeAddressTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblState)
                    .addComponent(lblCity)
                    .addComponent(lblZIPCode)
                    .addComponent(lblLine)
                    .addComponent(lblPersonName))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLine, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZIPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblLine, lblPersonName, lblState, lblZIPCode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblHomeAddressTitle)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLine)
                    .addComponent(txtLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZIPCode)
                    .addComponent(txtZIPCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSave)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCity, lblLine, lblPersonName, lblState, lblZIPCode});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void txtLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLineActionPerformed

    private void txtZIPCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZIPCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZIPCodeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String personName = txtPersonName.getText();
        String line = txtLine.getText();
        String zipCode = txtZIPCode.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        
        HomeAddress ha = homeAddressList.addNewHomeAddress();
        
        ha.setPersonName(personName);
        ha.setLine(line);
        ha.setZipCode(zipCode);
        ha.setCity(city);
        ha.setState(state);
        
        JOptionPane.showMessageDialog(this, "New Home Address Added");
        txtPersonName.setText("");
        txtLine.setText("");        
        txtZIPCode.setText("");
        txtCity.setText("");
        txtState.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblHomeAddressTitle;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblZIPCode;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLine;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZIPCode;
    // End of variables declaration//GEN-END:variables
}
