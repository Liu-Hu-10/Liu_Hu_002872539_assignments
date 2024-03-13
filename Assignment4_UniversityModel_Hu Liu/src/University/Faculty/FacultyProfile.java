/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.Faculty;
import Business.Person.*;
import Business.Profiles.*;
import University.CourseSchedule.CourseOffer;
import University.Department.Department;
import java.util.ArrayList;
/**
 *
 * @author HU
 */
public class FacultyProfile extends Profile { // I changed FacultyProfile class into subclass of Profile class to align with the whole structure

    ArrayList<FacultyAssignment> facultyassignments;
    private Department department;
    
    public FacultyProfile(Person p) {

        super(p);
        facultyassignments = new ArrayList();
    }
    
    public  double getProfAverageOverallRating(){
        
        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
        for(FacultyAssignment fa: facultyassignments){
            
            sum = sum + fa.getRating();
            
        }
        //divide by the total number of faculty assignments
        
        return sum/(facultyassignments.size()*1.0); //this ensure we have double/double
        
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

        public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
    
    public String getName() {
        return person.getName();
    }
    @Override
    public String getRole() {
        return "Faculty";
    }
}