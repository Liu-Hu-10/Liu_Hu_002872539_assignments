/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.StudentDirectory;
import Business.UserAccounts.UserAccountDirectory;
import University.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    ArrayList<Department> departments;
    
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    


    public Business(String n) {
        name = n;
        departments = new ArrayList();
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();

    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }
//
//
    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }

        public String getName() {
        return name;
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
}
