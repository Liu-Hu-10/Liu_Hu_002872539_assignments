/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author HU
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    
    /**
     * Creates new form AddPersonJPanel
     */
    public CreatePersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
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

        lblHeader = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        lblStreetAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblUnitNumber = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblStreetAddress2 = new javax.swing.JLabel();
        lblCity2 = new javax.swing.JLabel();
        lblUnitNumber2 = new javax.swing.JLabel();
        lblState2 = new javax.swing.JLabel();
        lblPersonProfile = new javax.swing.JLabel();
        lblWorkAddress = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblZipCode2 = new javax.swing.JLabel();
        btnAddPerson = new javax.swing.JButton();
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
        txtCityHome = new javax.swing.JTextField();
        txtUnitNumberHome = new javax.swing.JTextField();
        txtStateHome = new javax.swing.JTextField();
        txtZipCodeHome = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Add Person Profile");

        lblFirstName.setText("First Name:");

        lblssn.setText("Social Security Number:");

        lblLastName.setText("Last Name:");

        lblLicenseNumber.setText("License Number:");

        lblStreetAddress.setText("Street Address:");

        lblCity.setText("City:");

        lblUnitNumber.setText("Unit Number:");

        lblState.setText("State:");

        lblStreetAddress2.setText("Street Address:");

        lblCity2.setText("City:");

        lblUnitNumber2.setText("Unit Number:");

        lblState2.setText("State:");

        lblPersonProfile.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblPersonProfile.setText("Person profile:");

        lblWorkAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblWorkAddress.setText("Work Address:");

        lblHomeAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblHomeAddress.setText("Home Address:");

        lblZipCode.setText("Zip Code:");

        lblZipCode2.setText("Zip Code:");

        btnAddPerson.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        txtCityHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityHomeActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                            .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(156, 156, 156))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonProfile)
                            .addComponent(btnBack))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lblWorkAddress)
                                .addGap(34, 34, 34)
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
                                    .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(51, 51, 51)
                .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityHomeActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
// Collect personal details from the user and trim spaces
    String firstName = txtFirstName.getText().trim();
    String lastName = txtLastName.getText().trim();
    String ssn = txtssn.getText().trim();
    String licenseNumber = txtLicenseNumber.getText().trim();
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
    
    // Proceed to create and add the person since all fields are filled
    Address workAddress = new Address(streetAddress, unitNumber, city, state, zipCode);
    Address homeAddress = new Address(streetAddressHome, unitNumberHome, cityHome, stateHome, zipCodeHome);
    personDirectory.addNewPerson(firstName, lastName, ssn, licenseNumber, homeAddress, workAddress);

    JOptionPane.showMessageDialog(null, "Person successfully added!");

    // Clearing input fields after the user complete adding a person
    clearFields();
}

private void clearFields() {
    txtFirstName.setText("");
    txtLastName.setText("");
    txtssn.setText("");
    txtLicenseNumber.setText("");
    txtStreetAddress.setText("");
    txtUnitNumber.setText("");
    txtCity.setText("");
    txtState.setText("");
    txtZipCode.setText("");
    txtStreetAddressHome.setText("");
    txtUnitNumberHome.setText("");
    txtCityHome.setText("");
    txtStateHome.setText("");
    txtZipCodeHome.setText("");

    }//GEN-LAST:event_btnAddPersonActionPerformed

    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
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