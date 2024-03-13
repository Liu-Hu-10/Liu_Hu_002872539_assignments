/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.AdminRole;

import Business.Business;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import University.CourseSchedule.CourseOffer;
import University.CourseSchedule.*;
import University.Department.Department;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Person.*;

/**
 *
 * @author HU
 */
public class AdminMngStudentCourseOffer extends javax.swing.JPanel {
    private Business business;
    private String selectedSemester;
    private JPanel CardSequencePanel;
    /**
     * Creates new form AdminMngStudentCourseOffer
     */
    public AdminMngStudentCourseOffer(Business business, String selectedSemester, JPanel CardSequencePanel) {
        initComponents();
        this.business = business;
        this.selectedSemester = selectedSemester;
        this.CardSequencePanel = CardSequencePanel;
        populateCourseOffersTable();
        populateStudentListTable();
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
        tblCourseOffers = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        btnRegisterCourse1 = new javax.swing.JButton();
        btnRegisterCourse2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 155, 155));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Admin Manage Course Offerings: Student Registration");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CourseOffering");

        tblCourseOffers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Number", "Course Name", "Seat Available", "Total Seat", "Faculty Name"
            }
        ));
        jScrollPane1.setViewportView(tblCourseOffers);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("StudentList");

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Course1", "Course2"
            }
        ));
        jScrollPane2.setViewportView(tblStudentList);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        btnRegisterCourse1.setText("Register for Course 1");
        btnRegisterCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourse1ActionPerformed(evt);
            }
        });

        btnRegisterCourse2.setText("Register for Course 2");
        btnRegisterCourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourse2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnRegisterCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(btnRegisterCourse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(8, 8, 8)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRegisterCourse1)
                .addGap(18, 18, 18)
                .addComponent(btnRegisterCourse2)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    // Navigate back to the AdminRoleWorkAreaJPanel
    CardSequencePanel.remove(this);
    AdminRoleWorkAreaJPanel adminRoleWorkAreaJPanel = new AdminRoleWorkAreaJPanel(business, CardSequencePanel);
    CardSequencePanel.add(adminRoleWorkAreaJPanel);
    CardSequencePanel.revalidate();
    CardSequencePanel.repaint();
    ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void btnRegisterCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourse1ActionPerformed
        // TODO add your handling code here:
                int selectedStudentRow = tblStudentList.getSelectedRow();
        int selectedCourseRow = tblCourseOffers.getSelectedRow();

        if (selectedStudentRow >= 0 && selectedCourseRow >= 0) {
            String studentId = (String) tblStudentList.getValueAt(selectedStudentRow, 0);
            String courseNumber = (String) tblCourseOffers.getValueAt(selectedCourseRow, 0);

            Department department = retrieveDepartmentFromBusiness(business);
            if (department != null) {
                StudentDirectory studentDirectory = department.getStudentDirectory();
                CourseSchedule courseSchedule = department.getCourseSchedule(selectedSemester);

                StudentProfile studentProfile = studentDirectory.findStudent(studentId);
                CourseOffer courseOffer = courseSchedule.getCourseOfferByNumber(courseNumber);

                if (studentProfile != null && courseOffer != null) {
                    CourseLoad currentCourseLoad = studentProfile.getCurrentCourseLoad();
                    courseOffer.assignEmptySeat(currentCourseLoad);
                    JOptionPane.showMessageDialog(this, "Student registered for Course 1 successfully.");
                    populateStudentListTable();
                    populateCourseOffersTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid student or course selection.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student and a course.");
        }
    }//GEN-LAST:event_btnRegisterCourse1ActionPerformed

    private void btnRegisterCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourse2ActionPerformed
        // TODO add your handling code here:
                int selectedStudentRow = tblStudentList.getSelectedRow();
        int selectedCourseRow = tblCourseOffers.getSelectedRow();

        if (selectedStudentRow >= 0 && selectedCourseRow >= 0) {
            String studentId = (String) tblStudentList.getValueAt(selectedStudentRow, 0);
            String courseNumber = (String) tblCourseOffers.getValueAt(selectedCourseRow, 0);

            Department department = retrieveDepartmentFromBusiness(business);
            if (department != null) {
                StudentDirectory studentDirectory = department.getStudentDirectory();
                CourseSchedule courseSchedule = department.getCourseSchedule(selectedSemester);

                StudentProfile studentProfile = studentDirectory.findStudent(studentId);
                CourseOffer courseOffer = courseSchedule.getCourseOfferByNumber(courseNumber);

                if (studentProfile != null && courseOffer != null) {
                    CourseLoad currentCourseLoad = studentProfile.getCurrentCourseLoad();
                    courseOffer.assignEmptySeat(currentCourseLoad);
                    JOptionPane.showMessageDialog(this, "Student registered for Course 2 successfully.");
                    populateStudentListTable();
                    populateCourseOffersTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid student or course selection.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student and a course.");
        }
    }//GEN-LAST:event_btnRegisterCourse2ActionPerformed

    
        private void populateCourseOffersTable() {
        // Retrieve the course schedule for the selected semester
        CourseSchedule courseSchedule = retrieveCourseSchedule(selectedSemester);
        if (courseSchedule != null) {
            // Retrieve the course offers for the selected semester
            ArrayList<CourseOffer> courseOffers = courseSchedule.getSchedule();
            // Populate the table with course offers
            DefaultTableModel model = (DefaultTableModel) tblCourseOffers.getModel();
            model.setRowCount(0);
            for (CourseOffer offer : courseOffers) {
                Object[] row = new Object[]{
                    offer.getCourseNumber(),
                    offer.getCourseName(),
                    offer.getRemainingSeats(),
                    offer.getTotalSeats(),
                    offer.getFacultyProfile() != null ? offer.getFacultyProfile().getName() : "Not Assigned"
                };
                model.addRow(row);
            }
        }
    }
        private void populateStudentListTable() {
    DefaultTableModel model = (DefaultTableModel) tblStudentList.getModel();
    model.setRowCount(0);

    Department department = retrieveDepartmentFromBusiness(business);
    if (department != null) {
        StudentDirectory studentDirectory = department.getStudentDirectory();
        for (StudentProfile studentProfile : studentDirectory.getStudentList()) {
            CourseLoad currentCourseLoad = studentProfile.getCurrentCourseLoad();

            String course1 = "Unregistered";
            String course2 = "Unregistered";

            if (currentCourseLoad != null) {
                ArrayList<SeatAssignment> seatAssignments = currentCourseLoad.getSeatAssignments();

                if (seatAssignments.size() > 0) {
                    course1 = seatAssignments.get(0).getAssociatedCourse().getCourseNumber();
                }
                if (seatAssignments.size() > 1) {
                    course2 = seatAssignments.get(1).getAssociatedCourse().getCourseNumber();
                }
            }

            String studentId = studentProfile.getPerson().getPersonId();
            String studentName = studentProfile.getPerson().getName();

            // Extract the student ID from the combined string
            String[] idParts = studentId.split(",");
            if (idParts.length > 0) {
                studentId = idParts[0].trim();
            }

            // Extract the student name from the combined string if it's not null
            if (studentName != null) {
                String[] nameParts = studentName.split(",");
                if (nameParts.length > 1) {
                    studentName = nameParts[1].trim();
                }
            } else {
                studentName = ""; // Set a default value if the name is null
            }

            Object[] row = new Object[]{
                studentId,
                studentName,
                course1,
                course2
            };
            model.addRow(row);
        }
    }
        
    }
       private CourseSchedule retrieveCourseSchedule(String semester) {
        Department department = retrieveDepartmentFromBusiness(business);
        if (department != null) {
            return department.getCourseSchedule(semester);
        }
        return null;
    }

    private Department retrieveDepartmentFromBusiness(Business business) {
        String departmentName = "Information Systems";
        for (Department department : business.getDepartments()) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }     
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnRegisterCourse1;
    private javax.swing.JButton btnRegisterCourse2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCourseOffers;
    private javax.swing.JTable tblStudentList;
    // End of variables declaration//GEN-END:variables
}
