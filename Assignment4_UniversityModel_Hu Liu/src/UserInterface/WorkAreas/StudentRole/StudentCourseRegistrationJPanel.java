/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;
import Business.Business;
import Business.Profiles.StudentProfile;
import University.CourseSchedule.CourseLoad;
import University.CourseSchedule.SeatAssignment;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author HU
 */
public class StudentCourseRegistrationJPanel extends javax.swing.JPanel {
    private Business business;
    private StudentProfile studentProfile;
    private JPanel CardSequencePanel;

    /**
     * Creates new form StudentCourseRegistrationJPanel
     */
    public StudentCourseRegistrationJPanel(Business business, StudentProfile studentProfile, JPanel CardSequencePanel) {
        initComponents();
        this.business = business;
        this.studentProfile = studentProfile;
        this.CardSequencePanel = CardSequencePanel;
        populateStudentRegistrationsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentRegistrations = new javax.swing.JTable();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 155, 155));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("My Registration Information");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CourseRegistered");

        tblStudentRegistrations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course 1 ID", "Course 1 Name", "Course 1 Professor", "Course 2 ID", "Course 2 Name", "Course 2 Professor"
            }
        ));
        jScrollPane1.setViewportView(tblStudentRegistrations);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateStudentRegistrationsTable() {
        DefaultTableModel model = (DefaultTableModel) tblStudentRegistrations.getModel();
        model.setRowCount(0);

        CourseLoad currentCourseLoad = studentProfile.getCurrentCourseLoad();
        if (currentCourseLoad != null) {
            ArrayList<SeatAssignment> seatAssignments = currentCourseLoad.getSeatAssignments();

            Object[] row = new Object[6];
            for (int i = 0; i < 2; i++) {
                if (i < seatAssignments.size()) {
                    SeatAssignment seatAssignment = seatAssignments.get(i);
                    row[i * 3] = seatAssignment.getAssociatedCourse().getCourseNumber();
                    row[i * 3 + 1] = seatAssignment.getAssociatedCourse().getCourseName();
                    row[i * 3 + 2] = seatAssignment.getCourseOffer().getFacultyProfile().getName();
                } else {
                    row[i * 3] = "";
                    row[i * 3 + 1] = "";
                    row[i * 3 + 2] = "";
                }
            }
            model.addRow(row);
        }
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        // Directly switch back to the FacultyWorkAreaJPanel
        CardSequencePanel.remove(this);
        StudentWorkAreaJPanel studentWorkAreaJPanel = new StudentWorkAreaJPanel(business, studentProfile, CardSequencePanel);
        CardSequencePanel.add(studentWorkAreaJPanel);
        CardSequencePanel.revalidate();
        CardSequencePanel.repaint();
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
    
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentRegistrations;
    // End of variables declaration//GEN-END:variables
}