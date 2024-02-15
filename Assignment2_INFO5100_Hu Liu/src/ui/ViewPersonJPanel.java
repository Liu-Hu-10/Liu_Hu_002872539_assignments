/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author HU
 */
public class ViewPersonJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Person person;
    
    /**
     * Creates new form ViewPersonJPanel
     */


    ViewPersonJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        populatePersonProfile();
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
    }
    
    private void populatePersonProfile(){
        // Person Details
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtssn.setText(person.getSsn());
        txtLicenseNumber.setText(person.getLicenseNumber());
        
        // Work Address
        txtStreetAddress.setText(person.getWorkAddress().getStreetAddress());
        txtUnitNumber.setText(person.getWorkAddress().getUnitNumber());
        txtCity.setText(person.getWorkAddress().getCity());
        txtState.setText(person.getWorkAddress().getState());
        txtZipCode.setText(person.getWorkAddress().getZipCode());
        
        // Home Address
        
        txtStreetAddressHome.setText(person.getHomeAddress().getStreetAddress());
        txtUnitNumberHome.setText(person.getHomeAddress().getUnitNumber());
        txtCityHome.setText(person.getHomeAddress().getCity());
        txtStateHome.setText(person.getHomeAddress().getState());
        txtZipCodeHome.setText(person.getHomeAddress().getZipCode());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtssn = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtLicenseNumber = new javax.swing.JTextField();
        txtStreetAddress = new javax.swing.JTextField();
        txtUnitNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtStreetAddressHome = new javax.swing.JTextField();
        lblUnitNumber = new javax.swing.JLabel();
        txtCityHome = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtUnitNumberHome = new javax.swing.JTextField();
        lblStreetAddress2 = new javax.swing.JLabel();
        txtStateHome = new javax.swing.JTextField();
        lblCity2 = new javax.swing.JLabel();
        txtZipCodeHome = new javax.swing.JTextField();
        lblUnitNumber2 = new javax.swing.JLabel();
        lblState2 = new javax.swing.JLabel();
        lblPersonProfile = new javax.swing.JLabel();
        lblWorkAddress = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        lblStreetAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZipCode2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        txtssn.setEditable(false);
        txtssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtssnActionPerformed(evt);
            }
        });

        txtFirstName.setEditable(false);

        txtLastName.setEditable(false);

        txtLicenseNumber.setEditable(false);

        txtStreetAddress.setEditable(false);

        txtUnitNumber.setEditable(false);

        txtCity.setEditable(false);

        txtState.setEditable(false);

        txtZipCode.setEditable(false);

        txtStreetAddressHome.setEditable(false);

        lblUnitNumber.setText("Unit Number:");

        txtCityHome.setEditable(false);
        txtCityHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityHomeActionPerformed(evt);
            }
        });

        lblState.setText("State:");

        txtUnitNumberHome.setEditable(false);

        lblStreetAddress2.setText("Street Address:");

        txtStateHome.setEditable(false);

        lblCity2.setText("City:");

        txtZipCodeHome.setEditable(false);

        lblUnitNumber2.setText("Unit Number:");

        lblState2.setText("State:");

        lblPersonProfile.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblPersonProfile.setText("Person profile:");

        lblWorkAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblWorkAddress.setText("Work Address:");

        lblHomeAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblHomeAddress.setText("Home Address:");

        lblZipCode.setText("Zip Code:");

        lblFirstName.setText("First Name:");

        lblssn.setText("Social Security Number:");

        lblLastName.setText("Last Name:");

        lblLicenseNumber.setText("License Number:");

        lblStreetAddress.setText("Street Address:");

        lblCity.setText("City:");

        lblZipCode2.setText("Zip Code:");

        btnBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Person Profile");

        btnUpdate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
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
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWorkAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblssn)
                                .addComponent(lblFirstName)
                                .addComponent(lblPersonProfile)
                                .addComponent(lblStreetAddress)
                                .addComponent(lblStreetAddress2)
                                .addComponent(lblCity2)
                                .addComponent(lblZipCode2))
                            .addComponent(lblHomeAddress)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCity)
                            .addComponent(txtZipCode)
                            .addComponent(txtStreetAddressHome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCityHome)
                            .addComponent(txtZipCodeHome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtssn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLicenseNumber)
                            .addComponent(lblLastName)
                            .addComponent(lblUnitNumber)
                            .addComponent(lblState)
                            .addComponent(lblUnitNumber2)
                            .addComponent(lblState2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtUnitNumberHome)
                                    .addComponent(txtStateHome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPersonProfile)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(btnUpdate)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblWorkAddress)
                                            .addComponent(btnSave))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblStreetAddress)
                                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFirstName)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblssn)
                                            .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btnBack))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZipCode)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(lblHomeAddress)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStreetAddress2)
                            .addComponent(txtStreetAddressHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity2)
                            .addComponent(txtCityHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUnitNumber)
                                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLicenseNumber)
                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnitNumber2)
                            .addComponent(txtUnitNumberHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState2)
                            .addComponent(txtStateHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode2)
                    .addComponent(txtZipCodeHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityHomeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        initComponents();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastName.getText().trim();
        String ssn = txtssn.getText().trim();
        String licenseNumber = txtLicenseNumber.getText().trim();
        
        // Work Address and Home adddress create
        
        String streetAddress = txtStreetAddress.getText().trim();
        String unitNumber = txtUnitNumber.getText().trim();
        String city = txtCity.getText().trim();
        String state = txtState.getText().trim();
        String zipCode = txtZipCode.getText().trim();
        String streetAddressHome = txtStreetAddressHome.getText().trim();
        String unitNumberHome = txtUnitNumberHome.getText().trim();
        String cityHome = txtCityHome.getText().trim();
        String stateHome = txtStateHome.getText().trim();
        String zipCodeHome = txtZipCodeHome.getText().trim();
        
            // Check if any field is empty
        if (firstName.isEmpty() || lastName.isEmpty() || ssn.isEmpty() || licenseNumber.isEmpty() ||
        streetAddress.isEmpty() || unitNumber.isEmpty() || city.isEmpty() || state.isEmpty() || zipCode.isEmpty() ||
        streetAddressHome.isEmpty() || unitNumberHome.isEmpty() || cityHome.isEmpty() || stateHome.isEmpty() || zipCodeHome.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return; // Stop the method execution if validation fails
    }
        Address workAddress = new Address(streetAddress, unitNumber, city, state, zipCode);
        Address homeAddress = new Address(streetAddressHome, unitNumberHome, cityHome, stateHome, zipCodeHome);
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSsn(ssn);
        person.setLicenseNumber(licenseNumber);
        person.setWorkAddress(workAddress);
        person.setHomeAddress(homeAddress);
        
        
        // Make text fields non-editable again
        txtFirstName.setEditable(false);
        txtLastName.setEditable(false);
        txtssn.setEditable(false);
        txtLicenseNumber.setEditable(false);
        txtStreetAddress.setEditable(false);
        txtUnitNumber.setEditable(false);
        txtCity.setEditable(false);
        txtState.setEditable(false);
        txtZipCode.setEditable(false);
        txtStreetAddressHome.setEditable(false);
        txtUnitNumberHome.setEditable(false);
        txtCityHome.setEditable(false);
        txtStateHome.setEditable(false);
        txtZipCodeHome.setEditable(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        JOptionPane.showMessageDialog(null, "Person profile updated successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        // Person Details
        txtFirstName.setEditable(true);
        txtLastName.setEditable(true);
        txtssn.setEditable(true);
        txtLicenseNumber.setEditable(true);
        
        // Work Address
        txtStreetAddress.setEditable(true);
        txtUnitNumber.setEditable(true);
        txtCity.setEditable(true);
        txtState.setEditable(true);
        txtZipCode.setEditable(true);
        
        // Home Address
        
        txtStreetAddressHome.setEditable(true);
        txtUnitNumberHome.setEditable(true);
        txtCityHome.setEditable(true);
        txtStateHome.setEditable(true);
        txtZipCodeHome.setEditable(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtssnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblPersonProfile;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblState2;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblStreetAddress2;
    private javax.swing.JLabel lblUnitNumber;
    private javax.swing.JLabel lblUnitNumber2;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblZipCode2;
    private javax.swing.JLabel lblssn;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCityHome;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStateHome;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtStreetAddressHome;
    private javax.swing.JTextField txtUnitNumber;
    private javax.swing.JTextField txtUnitNumberHome;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtZipCodeHome;
    private javax.swing.JTextField txtssn;
    // End of variables declaration//GEN-END:variables
}