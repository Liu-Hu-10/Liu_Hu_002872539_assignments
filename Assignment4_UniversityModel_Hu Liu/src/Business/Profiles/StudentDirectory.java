/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import University.Department.Department;
import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;
    
// Provided default constructor
    public StudentDirectory() {

     studentlist = new ArrayList();

    }
    // Old project's constructor
    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList<StudentProfile>();

    }



    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
            //getter for studentlist
        public ArrayList<StudentProfile> getStudentList() {
            return studentlist;
        }

}
