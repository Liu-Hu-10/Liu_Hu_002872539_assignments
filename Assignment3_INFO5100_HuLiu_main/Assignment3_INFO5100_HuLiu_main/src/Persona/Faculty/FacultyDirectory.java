/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Faculty;

import Persona.*;
import Department.Department;
import java.util.ArrayList;
import java.util.Scanner;

import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;

/**
 *
 * @author kal bugrara
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

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
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
