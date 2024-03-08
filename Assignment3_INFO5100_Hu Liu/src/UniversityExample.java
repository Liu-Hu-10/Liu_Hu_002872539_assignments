/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseOfferDirectory;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Degree.Degree;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Transcript;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;
import College.College;

/**
 *
 * @author Hu Liu
 */
public class UniversityExample {
        
    private static void addNewCourse(Scanner scanner, CourseCatalog courseCatalog) {

        System.out.print("Enter course number: ");
        String number = scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course credits: ");
        int credits = scanner.nextInt();

        courseCatalog.newCourse(number, name, credits);
        System.out.println("Course added successfully.");

    }
   


    
     public static void viewCourseOfferings(Department department) {
    System.out.println("---------------------------------");
    System.out.println("Course Offerings:");
    
    CourseOfferDirectory directory = department.getCourseOfferDirectory();
    
    if (directory.getCourseOfferList().isEmpty()) {
        System.out.println("Please continue if you want to create course offerings.");
        return;
    }
    
    for (CourseOffer offer : directory.getCourseOfferList()) {
        System.out.println("-------------------------");
        System.out.println("Course Number: " + offer.getCourseNumber());
        System.out.println("Course Name: " + offer.getCourseName());
        System.out.println("Seats Available: " + offer.getRemainingSeats());
        System.out.println("Total Seats: " + offer.getTotalSeats());
        if (offer.getFacultyProfile() != null) {
            System.out.println("Instructor: " + offer.getFacultyProfile().getName());
        } else {
            System.out.println("Instructor: Not Assigned");
        }
    }
    System.out.println("---------------------------------");
}





    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // We need a user Interaction to start the system
        Scanner scanner = new Scanner(System.in);

        // Create a college
        College college = new College("College of Engineering");
        
        // Create a department
        Department department = new Department("Information Systems");
        college.addDepartment(department);
        CourseCatalog courseCatalog = department.getCourseCatalog();

        
        StudentDirectory sd = department.getStudentDirectory();
        PersonDirectory pd = department.getPersonDirectory();
        FacultyDirectory fd = new FacultyDirectory(department);
        Degree degree = department.getDegree();

        // Course side
        // Initialize 10 courses
        Course info5001 = courseCatalog.newCourse("info5001", "Application Design & Modeling", 4);
        Course info5100 = courseCatalog.newCourse("info5100", "Application Engineering Development", 4);
        Course info5002 = courseCatalog.newCourse("info5002", "Python Introduction", 4);
        Course info6215 = courseCatalog.newCourse("info6215", "Web Design", 4);
        Course info6200 = courseCatalog.newCourse("info6200", "Database Management", 4);
        Course damg6105 = courseCatalog.newCourse("damg6105", "Data Mining", 4);
        Course damg6103 = courseCatalog.newCourse("damg6103", "Data Warehousing", 4);
        Course damg6101 = courseCatalog.newCourse("damg6101", "Big Data", 4);
        Course csye6200 = courseCatalog.newCourse("csye6200", "Object Oriented Design", 4);
        Course csye6202 = courseCatalog.newCourse("csye6202", "Advanced Cloud Computing", 4);

        // Adding core courses
            degree.addCoreCourse(info5001);
            degree.addCoreCourse(info5100);
            degree.addCoreCourse(info5002);
            degree.addCoreCourse(csye6200);

        // Adding elective courses
            degree.addElectiveCourse(info6215);
            degree.addElectiveCourse(info6200);
            degree.addElectiveCourse(damg6105);
            degree.addElectiveCourse(damg6103);
            degree.addElectiveCourse(damg6101);
            degree.addElectiveCourse(csye6202);


        //Create a course schedule for Spring2024 semester
        CourseSchedule isSpring2024 = department.newCourseSchedule("Spring2024");
        // Create 10 course offers for each course in Spring2024 semester

        CourseOffer info5001offerSpring2024 = isSpring2024.newCourseOffer("info5001");
        CourseOffer info5100offerSpring2024 = isSpring2024.newCourseOffer("info5100");
        CourseOffer info5002offerSpring2024 = isSpring2024.newCourseOffer("info5002");
        CourseOffer info6215offerSpring2024 = isSpring2024.newCourseOffer("info6215");
        CourseOffer info6200offerSpring2024 = isSpring2024.newCourseOffer("info6200");
        CourseOffer damg6105offerSpring2024 = isSpring2024.newCourseOffer("damg6105");
        CourseOffer damg6103offerSpring2024 = isSpring2024.newCourseOffer("damg6103");
        CourseOffer damg6101offerSpring2024 = isSpring2024.newCourseOffer("damg6101");
        CourseOffer csye6200offerSpring2024 = isSpring2024.newCourseOffer("csye6200");
        CourseOffer csye6202offerSpring2024 = isSpring2024.newCourseOffer("csye6202");
        


        // Create 25 seats for each course offering:

                info5001offerSpring2024.generateSeats(25);
                info5100offerSpring2024.generateSeats(25);
                info5002offerSpring2024.generateSeats(25);
                info6215offerSpring2024.generateSeats(25);
                info6200offerSpring2024.generateSeats(25);
                damg6105offerSpring2024.generateSeats(25);
                damg6103offerSpring2024.generateSeats(25);
                damg6101offerSpring2024.generateSeats(25);
                csye6200offerSpring2024.generateSeats(25);
                csye6202offerSpring2024.generateSeats(25);


        // Create 10 faculty
                Person faculty1Person = pd.newPerson("FacultyID1", "Tommy Shelby");
                FacultyProfile faculty1 = fd.newFacultyProfile(faculty1Person);
                Person faculty2Person = pd.newPerson("FacultyID2", "Thomas Muller");
                FacultyProfile faculty2 = fd.newFacultyProfile(faculty2Person);
                Person faculty3Person = pd.newPerson("FacultyID3", "Arjen Robben");
                FacultyProfile faculty3 = fd.newFacultyProfile(faculty3Person);
                Person faculty4Person = pd.newPerson("FacultyID4", "Philipp Lahm");
                FacultyProfile faculty4 = fd.newFacultyProfile(faculty4Person);
                Person faculty5Person = pd.newPerson("FacultyID5", "Robert Lewandowski");
                FacultyProfile faculty5 = fd.newFacultyProfile(faculty5Person);
                Person faculty6Person = pd.newPerson("FacultyID6", "Manuel Neuer");
                FacultyProfile faculty6 = fd.newFacultyProfile(faculty6Person);
                Person faculty7Person = pd.newPerson("FacultyID7", "David Alaba");
                FacultyProfile faculty7 = fd.newFacultyProfile(faculty7Person);
                Person faculty8Person = pd.newPerson("FacultyID8", "Franck Ribery");
                FacultyProfile faculty8 = fd.newFacultyProfile(faculty8Person);
                Person faculty9Person = pd.newPerson("FacultyID9", "Harry Kane");
                FacultyProfile faculty9 = fd.newFacultyProfile(faculty9Person);
                Person faculty10Person = pd.newPerson("FacultyID10", "Hu Tiger Liu");
                FacultyProfile faculty10 = fd.newFacultyProfile(faculty10Person);

        //Assign faculties to each course offer
        info5001offerSpring2024.AssignAsTeacher(faculty1);
        info5100offerSpring2024.AssignAsTeacher(faculty2);
        info5002offerSpring2024.AssignAsTeacher(faculty3);
        info6215offerSpring2024.AssignAsTeacher(faculty4);
        info6200offerSpring2024.AssignAsTeacher(faculty5);
        damg6105offerSpring2024.AssignAsTeacher(faculty6);
        damg6103offerSpring2024.AssignAsTeacher(faculty7);
        damg6101offerSpring2024.AssignAsTeacher(faculty8);
        csye6200offerSpring2024.AssignAsTeacher(faculty9);
        csye6202offerSpring2024.AssignAsTeacher(faculty10);


        // Student side process
        
        // Create ten students
        Person HuLiuPerson = pd.newPerson("1010", "HuLiu");
        StudentProfile HuLiu = sd.newStudentProfile(HuLiuPerson);

        Person archilPerson = pd.newPerson("0121", "Archil");
        StudentProfile archil = sd.newStudentProfile(archilPerson);

        Person ChrisPerson = pd.newPerson("0122", "Chris");
        StudentProfile Chris = sd.newStudentProfile(ChrisPerson);

        Person LouisPerson = pd.newPerson("0123", "Louis");
        StudentProfile Louis = sd.newStudentProfile(LouisPerson);     

        Person MaithiliPerson = pd.newPerson("0124", "Maithili");
        StudentProfile Maithili = sd.newStudentProfile(MaithiliPerson);

        Person HYZhouPerson = pd.newPerson("0125", "HYZhou");
        StudentProfile HYZhou = sd.newStudentProfile(HYZhouPerson);   

        Person AvisPerson = pd.newPerson("0126", "Avis");
        StudentProfile Avis = sd.newStudentProfile(AvisPerson);

        Person CherriePerson = pd.newPerson("0127", "Cherrie");
        StudentProfile Cherrie = sd.newStudentProfile(CherriePerson);

        Person ronaldoPerson = pd.newPerson("0128", "ronaldo");
        StudentProfile ronaldo = sd.newStudentProfile(ronaldoPerson);

        Person messiPerson = pd.newPerson("0129", "messi");
        StudentProfile messi = sd.newStudentProfile(messiPerson);

        



                // Assign transcript to students
                Transcript archilsTranscript = archil.getTranscript();
                Transcript ChrisTranscript = Chris.getTranscript();
                Transcript LouisTranscript = Louis.getTranscript();
                Transcript MaithiliTranscript = Maithili.getTranscript();
                Transcript HYZhouTranscript = HYZhou.getTranscript();
                Transcript AvisTranscript = Avis.getTranscript();
                Transcript CherrieTranscript = Cherrie.getTranscript();
                Transcript ronaldoTranscript = ronaldo.getTranscript();
                Transcript messiTranscript = messi.getTranscript();
                Transcript HuLiuTranscript = HuLiu.getTranscript();


        
                // Courseloadsw
                CourseLoad archilsSpring2024 = archilsTranscript.newCourseLoad("Spring2024");
                CourseLoad archilsCurrentCourseLoad = archil.getCurrentCourseLoad();
                CourseLoad ChrisSpring2024 = ChrisTranscript.newCourseLoad("Spring2024");
                CourseLoad ChrisCurrentCourseLoad = Chris.getCurrentCourseLoad();
                CourseLoad LouisSpring2024 = LouisTranscript.newCourseLoad("Spring2024");
                CourseLoad LouisCurrentCourseLoad = Louis.getCurrentCourseLoad();
                CourseLoad MaithiliSpring2024 = MaithiliTranscript.newCourseLoad("Spring2024");
                CourseLoad MaithiliCurrentCourseLoad = Maithili.getCurrentCourseLoad();
                CourseLoad HYZhouSpring2024 = HYZhouTranscript.newCourseLoad("Spring2024");
                CourseLoad HYZhouCurrentCourseLoad = HYZhou.getCurrentCourseLoad();
                CourseLoad AvisSpring2024 = AvisTranscript.newCourseLoad("Spring2024");
                CourseLoad AvisCurrentCourseLoad = Avis.getCurrentCourseLoad();
                CourseLoad CherrieSpring2024 = CherrieTranscript.newCourseLoad("Spring2024");
                CourseLoad CherrieCurrentCourseLoad = Cherrie.getCurrentCourseLoad();
                CourseLoad ronaldoSpring2024 = ronaldoTranscript.newCourseLoad("Spring2024");
                CourseLoad ronaldoCurrentCourseLoad = ronaldo.getCurrentCourseLoad();
                CourseLoad messiSpring2024 = messiTranscript.newCourseLoad("Spring2024");
                CourseLoad messiCurrentCourseLoad = messi.getCurrentCourseLoad();
                CourseLoad HuLiuSpring2024 = HuLiuTranscript.newCourseLoad("Spring2024");
                CourseLoad HuLiuCurrentCourseLoad = HuLiu.getCurrentCourseLoad();

                 // Register students for 2 courses each
                
                // Archil
                SeatAssignment archilRegisteredForInfo5001inSpring2024 = info5001offerSpring2024.assignEmptySeat(archil.getCurrentCourseLoad());
                SeatAssignment archilRegisteredForInfo5100 = info5100offerSpring2024.assignEmptySeat(archil.getCurrentCourseLoad());
                // Chris
                SeatAssignment ChrisRegisteredForInfo5001inSpring2024 = info5001offerSpring2024.assignEmptySeat(Chris.getCurrentCourseLoad());
                SeatAssignment ChrisRegisteredForInfo5100 = info5100offerSpring2024.assignEmptySeat(Chris.getCurrentCourseLoad());
                // Louis
                SeatAssignment LouisRegisteredForInfo5002inSpring2024 = info5002offerSpring2024.assignEmptySeat(Louis.getCurrentCourseLoad());
                SeatAssignment LouisRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(Louis.getCurrentCourseLoad());
                // Maithili
                SeatAssignment MaithiliRegisteredForInfo5002inSpring2024 = info5002offerSpring2024.assignEmptySeat(Maithili.getCurrentCourseLoad());
                SeatAssignment MaithiliRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(Maithili.getCurrentCourseLoad());
                // HYZhou
                SeatAssignment HYZhouRegisteredForInfo5001inSpring2024 = info5001offerSpring2024.assignEmptySeat(HYZhou.getCurrentCourseLoad());
                SeatAssignment HYZhouRegisteredForInfo5100 = info5100offerSpring2024.assignEmptySeat(HYZhou.getCurrentCourseLoad());
                // Avis
                SeatAssignment AvisRegisteredForInfo5002inSpring2024 = info5002offerSpring2024.assignEmptySeat(Avis.getCurrentCourseLoad());
                SeatAssignment AvisRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(Avis.getCurrentCourseLoad());
                // Cherrie
                SeatAssignment CherrieRegisteredForInfo50021inSpring2024 = info5002offerSpring2024.assignEmptySeat(Cherrie.getCurrentCourseLoad());
                SeatAssignment CherrieRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(Cherrie.getCurrentCourseLoad());
                // ronaldo
                SeatAssignment ronaldoRegisteredForInfo6200inSpring2024 = info6200offerSpring2024.assignEmptySeat(ronaldo.getCurrentCourseLoad());
                SeatAssignment ronaldoRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(ronaldo.getCurrentCourseLoad());
                // messi
                SeatAssignment messiRegisteredForInfo6200inSpring2024 = info6200offerSpring2024.assignEmptySeat(messi.getCurrentCourseLoad());
                SeatAssignment messiRegisteredForInfo6215 = info6215offerSpring2024.assignEmptySeat(messi.getCurrentCourseLoad());
                // HuLiu
                SeatAssignment HuLiuRegisteredForInfo5100inSpring2024 = info5100offerSpring2024.assignEmptySeat(HuLiu.getCurrentCourseLoad());
                SeatAssignment HuLiuRegisteredForInfo6200 = info6200offerSpring2024.assignEmptySeat(HuLiu.getCurrentCourseLoad());


                // Print college name and department name
                System.out.println("College: " + college.getName());
                System.out.println("Department: " + department.getName());
        
        
                // Assign grades to students
                archilRegisteredForInfo5001inSpring2024.setGrade(3.7f);
                archilRegisteredForInfo5100.setGrade(3.3f);
                ChrisRegisteredForInfo5001inSpring2024.setGrade(3.7f);
                ChrisRegisteredForInfo5100.setGrade(3.3f);
                LouisRegisteredForInfo5002inSpring2024.setGrade(3.7f);
                LouisRegisteredForInfo6215.setGrade(3.3f);
                MaithiliRegisteredForInfo5002inSpring2024.setGrade(3.7f);
                MaithiliRegisteredForInfo6215.setGrade(3.3f);
                HYZhouRegisteredForInfo5001inSpring2024.setGrade(3.7f);
                HYZhouRegisteredForInfo5100.setGrade(3.3f);
                AvisRegisteredForInfo5002inSpring2024.setGrade(3.7f);
                AvisRegisteredForInfo6215.setGrade(3.3f);
                CherrieRegisteredForInfo50021inSpring2024.setGrade(3.7f);
                CherrieRegisteredForInfo6215.setGrade(3.3f);
                ronaldoRegisteredForInfo6200inSpring2024.setGrade(3.7f);
                ronaldoRegisteredForInfo6215.setGrade(3.3f);
                messiRegisteredForInfo6200inSpring2024.setGrade(3.7f);
                messiRegisteredForInfo6215.setGrade(3.3f);
                HuLiuRegisteredForInfo5100inSpring2024.setGrade(4.0f);
                HuLiuRegisteredForInfo6200.setGrade(4.0f);

                



        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. Browse Course Catalog");
            System.out.println("2. Add New Course");
            System.out.println("3. View Course Offerings");
            System.out.println("4. Add Course Offering for Spring 2024");
            System.out.println("5. Print student's reports");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            
            switch (option) {
                case 1:
                    department.getCourseCatalog().printCourseCatalog();
                    break;
                case 2:
                    addNewCourse(scanner, courseCatalog);
                    break;
                case 3:
                    isSpring2024.printEachCourseOffer();    
                    viewCourseOfferings(department);
                    break;
                case 4:
                    addCourseOffering(scanner, department, "Spring2024");
                    break;
                case 5:
                    generateStudentReport(department, "Spring2024");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }



        

 

    



        

        // Print transcripts
        //  archil.printTranscript();
    //     Chris.printTranscript();
    //     Louis.printTranscript();
    //     Maithili.printTranscript();
    //     HYZhou.printTranscript();
    //     Avis.printTranscript();
    //     Cherrie.printTranscript();
    //     ronaldo.printTranscript();
    //     messi.printTranscript();
    //     HuLiu.printTranscript();
        
    //     // Print course schedule
    //     isSpring2024.printEachCourseOffer();
        
    //     // Implement a method to calculate Department revenue
    //     isSpring2024.printEachCourseRevenue();
    //     System.out.println("Department revenue: " + department.calculateRevenuesBySemester("Spring2024") + "$");
     }


    }

                // Method of adding course offering
                public static void addCourseOffering(Scanner scanner, Department department, String semester) {
                    System.out.print("Enter course number to offer: ");
                    String courseNum = scanner.nextLine();
                    
                    // Retrieve the course from the CourseCatalog
                    Course course = department.getCourseCatalog().getCourseByNumber(courseNum);
                    if (course == null) {
                        System.out.println("Course not found.");
                        return;
                    }
                    
                    // Check if the offering already exists in the CourseOfferDirectory
                    if (department.getCourseOfferDirectory().getCourseOfferByNumber(courseNum) != null) {
                        System.out.println("Course offering already exists.");
                        return;
                    }
                    
                    // Create a new CourseOffer and add it to the CourseOfferDirectory
                    CourseOffer newOffer = new CourseOffer(course);
                    System.out.print("Enter number of seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    newOffer.generateSeats(seats);
                    department.getCourseOfferDirectory().addCourseOffer(newOffer);
                    System.out.println("Course offering added successfully.");
                }

                public static void generateStudentReport(Department department, String semester) {
                    StudentDirectory studentDirectory = department.getStudentDirectory();
                    for (StudentProfile student : studentDirectory.getStudentList()) {
                        // Print student information and transcript
                        student.printTranscript();
                        
                        // Calculate and print the average GPA for the semester
                        float averageGPA = student.getTranscript().calculateAverageGPAForSemester(semester);
                        System.out.println("Average GPA for " + semester + ": " + averageGPA);
                        
                        // Calculate the tuition fee for the student for the specified semester
                        // Assuming calculateTuitionFeeForStudent is the new method that calculates tuition fee and returns it
                        int totalTuitionFee = calculateTuitionFeeForStudent(student, semester);
                        System.out.println("Tuition Fee for " + semester + ": $" + totalTuitionFee);
                        
                        System.out.println("-----------------------------------------");
                    }
                }

                
            public static int calculateTuitionFeeForStudent(StudentProfile student, String semester) {
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