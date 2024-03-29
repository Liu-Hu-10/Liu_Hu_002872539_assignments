/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CourseSchedule.CourseLoad;
import CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;

    CourseLoad currentcourseload;

    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap();
    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public StudentProfile getStudentProfile() {
        return student;
    }

    public CourseLoad newCourseLoad(String semester) {

        currentcourseload = new CourseLoad(semester);
        courseloadlist.put(semester, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {

        return currentcourseload;

    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return courseloadlist.get(semester);

    }

    public float getStudentTotalScore() {

        float sum = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            sum = sum + cl.getSemesterScore();

        }
        return sum;
    }
    //sat index means student rated their courses with likes;
    public int getStudentSatifactionIndex() {
        ArrayList<SeatAssignment> courseregistrations = getCourseList();
        int sum = 0;
        for (SeatAssignment sa : courseregistrations) {

            if (sa.getLike()) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers

    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList temp2;
        temp2 = new ArrayList();

        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
        }

        return temp2;

    }

    public void print(){
        System.out.println("------- Student transcript --------- ");
        for (CourseLoad eachCourseload : courseloadlist.values()) {
            eachCourseload.print();
        }   
    }

    

    public float calculateAverageGPAForSemester(String semester) {
        CourseLoad courseLoad = courseloadlist.get(semester);
        if (courseLoad == null || courseLoad.getSeatAssignments().isEmpty()) {
            return 0; // No courses found for the semester
        }
        
        float sumGrades = 0;
        int count = 0;
        
        for (SeatAssignment sa : courseLoad.getSeatAssignments()) {
            sumGrades += sa.getGrade(); //  this returns a float representing the grade
            count++;
        }
        
        return count > 0 ? sumGrades / count : 0; // Calculate average if there are courses
    }


}
