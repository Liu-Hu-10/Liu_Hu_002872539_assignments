/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.Department;
import University.CourseCatalog.Course;
import University.CourseCatalog.CourseCatalog;
import University.CourseSchedule.CourseLoad;
import University.CourseSchedule.CourseOffer;
import University.CourseSchedule.CourseOfferDirectory;
import University.CourseSchedule.CourseSchedule;
import University.CourseSchedule.SeatAssignment;
import University.Degree.Degree;
import Business.Profiles.EmployeeDirectory;
import University.Faculty.FacultyDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.Transcript;

import java.util.HashMap;
/**
 *
 * @author HU
 */
public class Department {

    public String name;
    public CourseCatalog coursecatalog;
    public PersonDirectory persondirectory;
    public StudentDirectory studentdirectory;
    public EmployeeDirectory employeedirectory;
    public Degree degree;
    public FacultyDirectory facultydirectory;

    public HashMap<String, CourseSchedule> mastercoursecatalog; // very similar to ArrayList but with String used as indexes
    public CourseOfferDirectory courseOfferDirectory = new CourseOfferDirectory();

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        degree = new Degree("MSIS");
        facultydirectory = new FacultyDirectory(this);
        
    }
    public void addCoreCourse(Course c){
        degree.addCoreCourse(c);
        
    }
public void addElectiveCourse(Course c){
        degree.addElectiveCourse(c);
        
    }
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public Degree getDegree() {
        return degree;
    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }

    public EmployeeDirectory getEmployeeDirectory(){
        return employeedirectory;
    }
    
    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseOfferDirectory getCourseOfferDirectory() {
        return courseOfferDirectory;
    }


    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public String getName(){
        return name;
    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    public void printCourseSchedule() {
        System.out.println("Course Schedule for this semester:");
        // for (Course course : courses) {
        //     System.out.println("Course: " + course.getCourseName());
        //     System.out.println("Teacher(s): " + course.getFacultyList());
        //     System.out.println("Number of registered students: " + course.getNumberOfRegisteredStudents());
        //     System.out.println("Remaining empty seats: " + course.getRemainingEmptySeats());
        //     System.out.println();
        // }
        coursecatalog.printCourseCatalog();
    }

    public int calculateTuitionFeeForStudent(StudentProfile student, String semester) {
        Transcript transcript = student.getTranscript();
        CourseLoad courseLoad = transcript.getCourseLoadBySemester(semester);
        int totalTuitionFee = 0;
        if (courseLoad != null) {
            for (SeatAssignment seatAssignment : courseLoad.getSeatAssignments()) {
                Course course = seatAssignment.getAssociatedCourse();
                totalTuitionFee += course.getCoursePrice();
            }
        }
        return totalTuitionFee;
    }


        

    }
    
