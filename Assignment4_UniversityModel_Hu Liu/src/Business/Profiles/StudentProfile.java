/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.*;
import University.CourseSchedule.CourseLoad;
import University.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import University.College.College;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    Person person;
    Transcript transcript;


    public StudentProfile(Person p) {
        super(p);
        person = p;
        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {
        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {
        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {
        return transcript.getCourseList();
    }


    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
    
    public Person getPerson() {
        return person;
    }


    public void printStudentNameAndID() {
        System.out.println("Student name, id: " + person.getName() + ", " + person.getPersonId());
    }
    
    public void printTranscript() {
        printStudentNameAndID();
        transcript.print();
    }
    
    

    @Override
    public String getRole() {
        return "Student";
    }
}
