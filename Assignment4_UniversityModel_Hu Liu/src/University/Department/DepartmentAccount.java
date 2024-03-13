/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.Department;

import University.CourseSchedule.CourseSchedule;

/**
 *
 * @author HU
 */
public class DepartmentAccount {
  Department department;
    public DepartmentAccount(Department d){
        department = d;
    }
        
    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = department.getCourseSchedule(semester);

        return css.calculateTotalRevenues();

    }
}
