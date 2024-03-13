/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.College;
import University.Department.Department;
import java.util.ArrayList;
/**
 *
 * @author HU
 */
public class College {
        public String name;
    ArrayList<Department> departments;
    
    public College(String name){
        this.name = name;
        departments = new ArrayList();
    }

    public String getName() {
        return name;
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
}
