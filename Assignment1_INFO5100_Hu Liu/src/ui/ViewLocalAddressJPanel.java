/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LocalAddressDirectory;
import model.LocalAddress;

/**
 *
 * @author HU
 */
public class ViewLocalAddressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonJPanel
     */
    LocalAddressDirectory localAddressList;
    
    
    public ViewLocalAddressJPanel(LocalAddressDirectory localAddressList) {
        initComponents();
        this.localAddressList = localAddressList;
        
        
        populateTable();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLocalAddressTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocalAddress = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtLine = new javax.swing.JTextField();
        lblPersonName = new javax.swing.JLabel();
        txtZIPCode = new javax.swing.JTextField();
        lblLine = new javax.swing.JLabel();
        lblZIPCode = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();

        lbLocalAddressTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLocalAddressTitle.setText("View Local Address");

        tblLocalAddress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Line", "ZIP Code", "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLocalAddress);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineActionPerformed(evt);
            }
        });

        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name:");

        txtZIPCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZIPCodeActionPerformed(evt);
            }
        });

        lblLine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLine.setText("Line:");

        lblZIPCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZIPCode.setText("ZIP Code:");

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

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblState.setText("State:");

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLocalAddressTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblState)
                            .addComponent(lblCity)
                            .addComponent(lblZIPCode)
                            .addComponent(lblLine)
                            .addComponent(lblPersonName))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLine, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZIPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbLocalAddressTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(45, 45, 45)
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
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblLocalAddress.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblLocalAddress.getModel();        
        LocalAddress selectedLocalAddress = (LocalAddress) model.getValueAt(selectedRowIndex, 0);
        
        txtPersonName.setText(selectedLocalAddress.getPersonName());
        txtLine.setText(selectedLocalAddress.getLine());
        txtZIPCode.setText(selectedLocalAddress.getZipCode());
        txtCity.setText(selectedLocalAddress.getCity());
        txtState.setText(selectedLocalAddress.getState());        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblLocalAddress.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblLocalAddress.getModel();        
        LocalAddress selectedLocalAddress = (LocalAddress) model.getValueAt(selectedRowIndex, 0);
        
        localAddressList.deleteLocalAddress(selectedLocalAddress);
        JOptionPane.showMessageDialog(this, "Local Address deleted"); 
        
        populateTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLocalAddressTitle;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblZIPCode;
    private javax.swing.JTable tblLocalAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLine;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZIPCode;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblLocalAddress.getModel();
        model.setRowCount(0);
        
        for (LocalAddress la : localAddressList.getLocalAddressList()){
            Object[] row = new Object[5];
            row[0] = la;
            row[1] = la.getLine();
            row[2] = la.getZipCode();
            row[3] = la.getCity();
            row[4] = la.getState();
            
            model.addRow(row);
            
        }
        
        
    }
}
