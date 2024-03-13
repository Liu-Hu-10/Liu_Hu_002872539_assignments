/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.Faculty;

import Business.Person.*;
import University.Department.Department;
import University.CourseSchedule.CourseOffer;
import University.CourseSchedule.CourseSchedule;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HU
 */
public class FacultyDirectory {
    Department department;
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        return sp;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(ArrayList<FacultyProfile> teacherlist) {
        this.teacherlist = teacherlist;
    }
    
    public FacultyProfile getTopProfessor(){
        
        double bestratingsofar = 0.0;
        FacultyProfile BestProfSofar = null;
        for(FacultyProfile fp: teacherlist)
           if(fp.getProfAverageOverallRating()>bestratingsofar){
           bestratingsofar = fp.getProfAverageOverallRating();
           BestProfSofar = fp;
           }
        return BestProfSofar;
        
    }
    
    public FacultyProfile findTeachingFaculty(String id) {
        for (FacultyProfile fp : teacherlist) {
            if (fp.getPerson().getPersonId().equals(id)) {
                return fp;
            }
        }
        return null; // not found after going through the whole list
    }
    
       public static void assignProfessorToCourse(Scanner scanner, CourseSchedule schedule, FacultyDirectory directory) {
    System.out.print("Enter course number to assign professor: ");
    String courseNum = scanner.nextLine();
    CourseOffer offer = schedule.getCourseOfferByNumber(courseNum);
    if (offer != null) {
        System.out.print("Enter professor ID: ");
        String profId = scanner.nextLine();
        FacultyProfile professor = directory.findTeachingFaculty(profId);
        if (professor != null) {
            offer.AssignAsTeacher(professor);
            System.out.println("Professor assigned.");
        } else {
            System.out.println("Professor not found.");
        }
    } else {
        System.out.println("Course offering not found.");
    }
}  

    public void printFacultyList(){
        for(FacultyProfile fp: teacherlist){
            System.out.println(fp.getName());
        }
    }

    public FacultyProfile findFacultyByName(String professorName){
        for(FacultyProfile fp: teacherlist){
            if(fp.getName().equals(professorName)){
                return fp;
            }
        
        
        }
        return null;
    }
}
