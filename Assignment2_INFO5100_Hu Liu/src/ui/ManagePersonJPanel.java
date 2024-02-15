/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author HU
 */
public class ManagePersonJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    
    /**
     * Creates new form ManagePersonJPanel
     */


    public ManagePersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
    
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        
    addComponentListener(new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            populateTable();
        }
    });
        
        
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblPersons.getModel();
        dtm.setRowCount(0);
        for(Person person : personDirectory.getPersonList()){
            Object[] row = new Object[6];
            row[0] = person;
            row[1] = person.getLastName();
            row[2] = person.getHomeAddress().getCity();
            row[3] = person.getHomeAddress().getZipCode();
            row[4] = person.getWorkAddress().getCity();
            row[5] = person.getWorkAddress().getZipCode();

            dtm.addRow(row);
            
            
            
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtFirstNameSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtWorkStreetSearch = new javax.swing.JTextField();
        txtLastNameSearch = new javax.swing.JTextField();
        txtHomeStreetSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Zip", "Work City", "Work Zip"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersons);
        if (tblPersons.getColumnModel().getColumnCount() > 0) {
            tblPersons.getColumnModel().getColumn(0).setResizable(false);
            tblPersons.getColumnModel().getColumn(1).setResizable(false);
            tblPersons.getColumnModel().getColumn(2).setResizable(false);
            tblPersons.getColumnModel().getColumn(3).setResizable(false);
            tblPersons.getColumnModel().getColumn(4).setResizable(false);
            tblPersons.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnSearch.setText("Search Person Profile");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnView.setText("View Profile");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete Profile");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Input person's first name:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Input person's last name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Input person's work street address:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Input person's home street address:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel5.setText("If you want to search a profile, please follow the instructions below:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtWorkStreetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHomeStreetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnView)
                        .addComponent(btnDelete))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkStreetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeStreetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnSearch)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       initComponents();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPersons.getSelectedRow();
        
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the person profile?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_NO_OPTION){
            Person person = (Person) tblPersons.getValueAt(selectedRow, 0);
            personDirectory.deletePerson(person);
            populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
               
        int selectedRow = tblPersons.getSelectedRow(); 
        if(selectedRow < 0){
                        JOptionPane.showMessageDialog(null, "Please select a row from the table to view first", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        else{
            Person person = (Person)tblPersons.getValueAt(selectedRow, 0);
            ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, person);
            userProcessContainer.add("ViewPersonJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    String firstName = txtFirstNameSearch.getText().trim();
    String lastName = txtLastNameSearch.getText().trim();
    String workStreet = txtWorkStreetSearch.getText().trim();
    String homeStreet = txtHomeStreetSearch.getText().trim();

    // Ensure at least one address field is filled along with the name fields
    if (firstName.isEmpty() || lastName.isEmpty() || (workStreet.isEmpty() && homeStreet.isEmpty())) {
        JOptionPane.showMessageDialog(null, "Please enter the first name, last name, and at least one address to search.", "Incomplete Data", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    Person result = personDirectory.newSearchPerson(firstName, lastName, workStreet, homeStreet);
    if(result == null) {
        JOptionPane.showMessageDialog(null, "No matching profile found.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
    } else {
        ViewPersonJPanel viewPanel = new ViewPersonJPanel(userProcessContainer, result);
        userProcessContainer.add("ViewPersonJPanel", viewPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txtFirstNameSearch;
    private javax.swing.JTextField txtHomeStreetSearch;
    private javax.swing.JTextField txtLastNameSearch;
    private javax.swing.JTextField txtWorkStreetSearch;
    // End of variables declaration//GEN-END:variables
}
