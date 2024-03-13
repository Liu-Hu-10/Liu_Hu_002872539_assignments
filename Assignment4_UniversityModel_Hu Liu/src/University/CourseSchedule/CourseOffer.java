/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.CourseSchedule;

import University.CourseCatalog.Course;
import University.CourseCatalog.CourseCatalog;
import University.Faculty.FacultyAssignment;
import University.Faculty.FacultyProfile;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HU
 */
public class CourseOffer {
    
    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
     
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return (facultyassignment != null) ? facultyassignment.getFacultyProfile() : null;
    }

    public String getCourseName() {
        return course.getCourseName();
    }
    public String getCourseNumber() {
        return course.getCourseNumber();
    }

    public void generateSeats(int n) {
        for (int i = 0; i < n; i++) {
            seatlist.add(new Seat(this, i));
        }

    }

    public Seat getEmptySeat() {
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }


    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        Seat anEmptySeat = getEmptySeat();
        if (anEmptySeat == null) {
            return null;
        }

        SeatAssignment sa = anEmptySeat.newSeatAssignment(cl); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    public Course getSubjectCourse(){
        return course;
    }
    public int getCreditHours(){
        return course.getCredits();
    }

    public int getRemainingSeats() {
        int count = 0;
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                count++;
            }
        }
        return count;
    }


    public int getTotalSeats() {
        return seatlist.size();
    } 

    public int getTakenSeats() {
        return seatlist.size() - getRemainingSeats();
    }

    public void addCourseOffering(Scanner scanner, CourseSchedule schedule, CourseCatalog catalog) {
        System.out.print("Enter course number to offer: ");
        String courseNum = scanner.nextLine();
        if (schedule.getCourseOfferByNumber(courseNum) == null) {
            Course course = catalog.getCourseByNumber(courseNum);
            if (course != null) {
                CourseOffer offer = schedule.newCourseOffer(courseNum);
                System.out.print("Enter number of seats: ");
                int seats = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                offer.generateSeats(seats);
                System.out.println("Course offering added.");
            } else {
                System.out.println("Course not found in catalog.");
            }
        } else {
            System.out.println("Course already offered this semester.");
        }
    }
}
