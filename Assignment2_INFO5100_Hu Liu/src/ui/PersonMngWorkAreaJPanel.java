/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;

/**
 *
 * @author HU
 */
public class PersonMngWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    
    /**
     * Creates new form ManagePersonJPanel
     */

    public PersonMngWorkAreaJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePerson = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();

        btnCreatePerson.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnCreatePerson.setText("Add Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnManagePerson.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnManagePerson.setText("List Persons");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(801, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(680, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        
        CreatePersonJPanel panel = new CreatePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("CreatePersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        
        ManagePersonJPanel panel = new ManagePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("ManagePersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManagePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnManagePerson;
    // End of variables declaration//GEN-END:variables
}
