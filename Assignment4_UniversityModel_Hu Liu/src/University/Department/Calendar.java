/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.Department;

import University.CourseSchedule.CourseSchedule;
import java.lang.*;
import java.util.HashMap;

/**
 *
 * @author HU
 */
public class Calendar {
        HashMap<String, CourseSchedule> mastercatalog; 
    
    public Calendar(){
    mastercatalog = new HashMap<String, CourseSchedule>();    
    }
    
    public void addCourseSchedule(String semester, CourseSchedule cs){
        
        mastercatalog.put(semester, cs);
        
    }
    
    
    
}
