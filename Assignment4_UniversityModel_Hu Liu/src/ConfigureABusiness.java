/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.Transcript;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import University.CourseCatalog.Course;
import University.CourseCatalog.CourseCatalog;
import University.CourseSchedule.CourseLoad;
import University.CourseSchedule.CourseOffer;
import University.CourseSchedule.CourseOfferDirectory;
import University.CourseSchedule.CourseSchedule;
import University.CourseSchedule.SeatAssignment;
import University.Degree.Degree;
import University.Department.Department;
import University.Faculty.FacultyProfile;
import University.Faculty.FacultyDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        // Create a business
        Business business = new Business("Information Systems");
        
        // Create a department that belongs to this business
        Department department = new Department("Information Systems");
        business.addDepartment(department);
        
// Instead of creating Persons in business, I can create persons in department
        PersonDirectory persondirectory = department.getPersonDirectory();
        StudentDirectory studentdirectory = department.getStudentDirectory();
        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
// Get course catalog from the department
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Degree degree = department.getDegree();
        
// person representing organization        
        Person person001 = persondirectory.newPerson("John Smith");
        Person person002 = persondirectory.newPerson("Gina Montana");

// person, 12 of them are students
        Person personStu010 = persondirectory.newPerson("010", "Hu Liu");
        Person personStu011 = persondirectory.newPerson("011", "Archil");
        Person personStu012 = persondirectory.newPerson("012", "Chris");
        Person personStu013 = persondirectory.newPerson("013", "Louis");
        Person personStu014 = persondirectory.newPerson("014", "Maithili");
        Person personStu015 = persondirectory.newPerson("015", "HYZhou");
        Person personStu016 = persondirectory.newPerson("016", "Avis");
        Person personStu017 = persondirectory.newPerson("017", "Cherrie");
        Person personStu018 = persondirectory.newPerson("018", "ronaldo");
        Person personStu019 = persondirectory.newPerson("019", "messi");
        
        Person personStu020 = persondirectory.newPerson("020", "Musiala");
        Person personStu021 = persondirectory.newPerson("021", "Sane");
        
        
     // Create 10 faculty
        Person faculty1Person = persondirectory.newPerson("FacultyID1", "Tommy Shelby");
//        FacultyProfile faculty1 = facultydirectory.newFacultyProfile(faculty1Person);
        Person faculty2Person = persondirectory.newPerson("FacultyID2", "Thomas Muller");
//        FacultyProfile faculty2 = facultydirectory.newFacultyProfile(faculty2Person);
        Person faculty3Person = persondirectory.newPerson("FacultyID3", "Arjen Robben");
//        FacultyProfile faculty3 = facultydirectory.newFacultyProfile(faculty3Person);
        Person faculty4Person = persondirectory.newPerson("FacultyID4", "Philipp Lahm");
//        FacultyProfile faculty4 = facultydirectory.newFacultyProfile(faculty4Person);
        Person faculty5Person = persondirectory.newPerson("FacultyID5", "Robert Lewandowski");
//        FacultyProfile faculty5 = facultydirectory.newFacultyProfile(faculty5Person);
        Person faculty6Person = persondirectory.newPerson("FacultyID6", "Manuel Neuer");
//        FacultyProfile faculty6 = facultydirectory.newFacultyProfile(faculty6Person);
        Person faculty7Person = persondirectory.newPerson("FacultyID7", "David Alaba");
//        FacultyProfile faculty7 = facultydirectory.newFacultyProfile(faculty7Person);
        Person faculty8Person = persondirectory.newPerson("FacultyID8", "Franck Ribery");
//        FacultyProfile faculty8 = facultydirectory.newFacultyProfile(faculty8Person);
        Person faculty9Person = persondirectory.newPerson("FacultyID9", "Harry Kane");
//        FacultyProfile faculty9 = facultydirectory.newFacultyProfile(faculty9Person);
        Person faculty10Person = persondirectory.newPerson("FacultyID10", "Hu Tiger Liu");
//        FacultyProfile faculty10 = facultydirectory.newFacultyProfile(faculty10Person);
        
// Create an Admin to manage the business
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);

// Create Faculty to manage the courses
        FacultyProfile facultyprofile0 = facultydirectory.newFacultyProfile(faculty1Person);
        FacultyProfile facultyprofile1 = facultydirectory.newFacultyProfile(faculty2Person);
        FacultyProfile facultyprofile2 = facultydirectory.newFacultyProfile(faculty3Person);
        FacultyProfile facultyprofile3 = facultydirectory.newFacultyProfile(faculty4Person);
        FacultyProfile facultyprofile4 = facultydirectory.newFacultyProfile(faculty5Person);
        FacultyProfile facultyprofile5 = facultydirectory.newFacultyProfile(faculty6Person);
        FacultyProfile facultyprofile6 = facultydirectory.newFacultyProfile(faculty7Person);
        FacultyProfile facultyprofile7 = facultydirectory.newFacultyProfile(faculty8Person);
        FacultyProfile facultyprofile8 = facultydirectory.newFacultyProfile(faculty9Person);
        FacultyProfile facultyprofile9 = facultydirectory.newFacultyProfile(faculty10Person);
        
// Create Students and Faculty to manage their own areas  
        StudentProfile studentprofile1 = studentdirectory.newStudentProfile(personStu010);
        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(personStu011);
        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(personStu012);
        StudentProfile studentprofile4 = studentdirectory.newStudentProfile(personStu013);
        StudentProfile studentprofile5 = studentdirectory.newStudentProfile(personStu014);
        StudentProfile studentprofile6 = studentdirectory.newStudentProfile(personStu015);
        StudentProfile studentprofile7 = studentdirectory.newStudentProfile(personStu016);
        StudentProfile studentprofile8 = studentdirectory.newStudentProfile(personStu017);
        StudentProfile studentprofile9 = studentdirectory.newStudentProfile(personStu018);
        StudentProfile studentprofile10 = studentdirectory.newStudentProfile(personStu019);
        StudentProfile studentprofile11 = studentdirectory.newStudentProfile(personStu020);
        StudentProfile studentprofile12 = studentdirectory.newStudentProfile(personStu021);

    // User side
    // Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount uafaculty2 = uadirectory.newUserAccount(facultyprofile0, "shelby", "****");
        UserAccount uafaculty3 = uadirectory.newUserAccount(facultyprofile1, "muller", "****");
        UserAccount uafaculty4 = uadirectory.newUserAccount(facultyprofile2, "robben", "****");
        UserAccount uafaculty5 = uadirectory.newUserAccount(facultyprofile3, "lahm", "****");
        UserAccount uafaculty6 = uadirectory.newUserAccount(facultyprofile4, "lewandowski", "****");
        UserAccount uafaculty7 = uadirectory.newUserAccount(facultyprofile5, "neuer", "****");
        UserAccount uafaculty8 = uadirectory.newUserAccount(facultyprofile6, "alaba", "****");
        UserAccount uafaculty9 = uadirectory.newUserAccount(facultyprofile7, "ribery", "****");
        UserAccount uafaculty10 = uadirectory.newUserAccount(facultyprofile8, "kane", "****");
        UserAccount uafaculty11 = uadirectory.newUserAccount(facultyprofile9, "liu", "****");        
        //
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****");
        // Student accounts
        UserAccount ua4 = uadirectory.newUserAccount(studentprofile1, "huliu", "****");
        UserAccount ua5 = uadirectory.newUserAccount(studentprofile2, "archil", "****");
        UserAccount ua6 = uadirectory.newUserAccount(studentprofile3, "chris", "****");
        UserAccount ua7 = uadirectory.newUserAccount(studentprofile4, "louis", "****");
        UserAccount ua8 = uadirectory.newUserAccount(studentprofile5, "maithili", "****");
        UserAccount ua9 = uadirectory.newUserAccount(studentprofile6, "hyzhou", "****");
        UserAccount ua10 = uadirectory.newUserAccount(studentprofile7, "avis", "****");
        UserAccount ua11 = uadirectory.newUserAccount(studentprofile8, "cherrie", "****");
        UserAccount ua12 = uadirectory.newUserAccount(studentprofile9, "ronaldo", "****");
        UserAccount ua13 = uadirectory.newUserAccount(studentprofile10, "messi", "****");
        UserAccount ua14 = uadirectory.newUserAccount(studentprofile11, "musiala", "****");
        UserAccount ua15 = uadirectory.newUserAccount(studentprofile12, "sane", "****");

        
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
        Course csye7200 = courseCatalog.newCourse("csye7200", "Introduction to AI", 4);
        Course csye7300 = courseCatalog.newCourse("csye7300", "Machine Learning", 4);
        
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
            degree.addElectiveCourse(csye7200);
            degree.addElectiveCourse(csye7300);
    
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
//        CourseOffer csye7200offerSpring2024 = isSpring2024.newCourseOffer("csye7200");
//        CourseOffer csye7300offerSpring2024 = isSpring2024.newCourseOffer("csye7300");
        
        
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
//        csye7200offerSpring2024.generateSeats(30);
//        csye7300offerSpring2024.generateSeats(35);
        
        // Set our 10 faculty into our department
        facultyprofile0.setDepartment(department);
        facultyprofile1.setDepartment(department);
        facultyprofile2.setDepartment(department);
        facultyprofile3.setDepartment(department);
        facultyprofile4.setDepartment(department);
        facultyprofile5.setDepartment(department);
        facultyprofile6.setDepartment(department);
        facultyprofile7.setDepartment(department);
        facultyprofile8.setDepartment(department);
        facultyprofile9.setDepartment(department);
        
        //Assign faculties to each course offer
        info5001offerSpring2024.AssignAsTeacher(facultyprofile0);
        info5100offerSpring2024.AssignAsTeacher(facultyprofile1);
        info5002offerSpring2024.AssignAsTeacher(facultyprofile2);
        info6215offerSpring2024.AssignAsTeacher(facultyprofile3);
        info6200offerSpring2024.AssignAsTeacher(facultyprofile4);
        damg6105offerSpring2024.AssignAsTeacher(facultyprofile5);
        damg6103offerSpring2024.AssignAsTeacher(facultyprofile6);
        damg6101offerSpring2024.AssignAsTeacher(facultyprofile7);
//        csye6200offerSpring2024.AssignAsTeacher(facultyprofile8);
//        csye6202offerSpring2024.AssignAsTeacher(facultyprofile9);
        

        // Assign Transcript to students
        Transcript studentprofile1Transcript = studentprofile1.getTranscript();
        Transcript studentprofile2Transcript = studentprofile2.getTranscript();
        Transcript studentprofile3Transcript = studentprofile3.getTranscript();
        Transcript studentprofile4Transcript = studentprofile4.getTranscript();
        Transcript studentprofile5Transcript = studentprofile5.getTranscript();
        Transcript studentprofile6Transcript = studentprofile6.getTranscript();
        Transcript studentprofile7Transcript = studentprofile7.getTranscript();
        Transcript studentprofile8Transcript = studentprofile8.getTranscript();
        Transcript studentprofile9Transcript = studentprofile9.getTranscript();
        Transcript studentprofile10Transcript = studentprofile10.getTranscript();
        Transcript studentprofile11Transcript = studentprofile11.getTranscript();
        Transcript studentprofile12Transcript = studentprofile12.getTranscript();

        // create course load for each student for Spring 2024
        CourseLoad studentprofile1CourseLoad = studentprofile1.newCourseLoad("Spring2024");
        CourseLoad studentprofile2CourseLoad = studentprofile2.newCourseLoad("Spring2024");
        CourseLoad studentprofile3CourseLoad = studentprofile3.newCourseLoad("Spring2024");
        CourseLoad studentprofile4CourseLoad = studentprofile4.newCourseLoad("Spring2024");
        CourseLoad studentprofile5CourseLoad = studentprofile5.newCourseLoad("Spring2024");
        CourseLoad studentprofile6CourseLoad = studentprofile6.newCourseLoad("Spring2024");
        CourseLoad studentprofile7CourseLoad = studentprofile7.newCourseLoad("Spring2024");
        CourseLoad studentprofile8CourseLoad = studentprofile8.newCourseLoad("Spring2024");
        CourseLoad studentprofile9CourseLoad = studentprofile9.newCourseLoad("Spring2024");
        CourseLoad studentprofile10CourseLoad = studentprofile10.newCourseLoad("Spring2024");
        CourseLoad studentProfile11CourseLoad = studentprofile11.newCourseLoad("Spring2024");
        CourseLoad studentProfile12CourseLoad = studentprofile12.newCourseLoad("Spring2024");        


        // Get current courseloads for student 1 to student 10;
        CourseLoad studentprofile1CurrentCourseLoad = studentprofile1.getCurrentCourseLoad();
        CourseLoad studentprofile2CurrentCourseLoad = studentprofile2.getCurrentCourseLoad();
        CourseLoad studentprofile3CurrentCourseLoad = studentprofile3.getCurrentCourseLoad();
        CourseLoad studentprofile4CurrentCourseLoad = studentprofile4.getCurrentCourseLoad();
        CourseLoad studentprofile5CurrentCourseLoad = studentprofile5.getCurrentCourseLoad();
        CourseLoad studentprofile6CurrentCourseLoad = studentprofile6.getCurrentCourseLoad();
        CourseLoad studentprofile7CurrentCourseLoad = studentprofile7.getCurrentCourseLoad();
        CourseLoad studentprofile8CurrentCourseLoad = studentprofile8.getCurrentCourseLoad();
        CourseLoad studentprofile9CurrentCourseLoad = studentprofile9.getCurrentCourseLoad();
        CourseLoad studentprofile10CurrentCourseLoad = studentprofile10.getCurrentCourseLoad();
        CourseLoad studentprofile11CurrentCourseLoad = studentprofile11.getCurrentCourseLoad();
        CourseLoad studentprofile12CurrentCourseLoad = studentprofile12.getCurrentCourseLoad();
        
                // Register students for 2 courses each from student 1 to student 10
                SeatAssignment studentprofile1RegisteredForInfo5001Spring2024 = info5001offerSpring2024.assignEmptySeat(studentprofile1.getCurrentCourseLoad());
                SeatAssignment studentprofile1RegisteredForInfo5100Spring2024 = info5100offerSpring2024.assignEmptySeat(studentprofile1.getCurrentCourseLoad());
            // Register student 2 fro info5002 and info6200
                SeatAssignment studentprofile2RegisteredForInfo5002Spring2024 = info5002offerSpring2024.assignEmptySeat(studentprofile2.getCurrentCourseLoad());
                SeatAssignment studentprofile2RegisteredForInfo6200Spring2024 = info6200offerSpring2024.assignEmptySeat(studentprofile2.getCurrentCourseLoad());
            // Register student 3 for info5100 and damg6105
                SeatAssignment studentprofile3RegisteredForInfo5100Spring2024 = info5100offerSpring2024.assignEmptySeat(studentprofile3.getCurrentCourseLoad());
                SeatAssignment studentprofile3RegisteredForDamg6105Spring2024 = damg6105offerSpring2024.assignEmptySeat(studentprofile3.getCurrentCourseLoad());
            // Register student 4 for info6215 and damg6103

                SeatAssignment studentprofile4RegisteredForInfo6215Spring2024 = info6215offerSpring2024.assignEmptySeat(studentprofile4.getCurrentCourseLoad());
                SeatAssignment studentprofile4RegisteredForDamg6103Spring2024 = damg6103offerSpring2024.assignEmptySeat(studentprofile4.getCurrentCourseLoad());
            // Register student 5 for info5001 and damg6101
                SeatAssignment studentprofile5RegisteredForInfo5001Spring2024 = info5001offerSpring2024.assignEmptySeat(studentprofile5.getCurrentCourseLoad());
                SeatAssignment studentprofile5RegisteredForDamg6101Spring2024 = damg6101offerSpring2024.assignEmptySeat(studentprofile5.getCurrentCourseLoad());
            // Register student 6 for info5002 and csye6200
                SeatAssignment studentprofile6RegisteredForInfo5002Spring2024 = info5002offerSpring2024.assignEmptySeat(studentprofile6.getCurrentCourseLoad());
                SeatAssignment studentprofile6RegisteredForCsye6200Spring2024 = csye6200offerSpring2024.assignEmptySeat(studentprofile6.getCurrentCourseLoad());
            // Register student 7 for info5100 and csye6202
                SeatAssignment studentprofile7RegisteredForInfo5100Spring2024 = info5100offerSpring2024.assignEmptySeat(studentprofile7.getCurrentCourseLoad());
                SeatAssignment studentprofile7RegisteredForCsye6202Spring2024 = csye6202offerSpring2024.assignEmptySeat(studentprofile7.getCurrentCourseLoad());
            // Register student 8 for info6215 and info6200
                SeatAssignment studentprofile8RegisteredForInfo6215Spring2024 = info6215offerSpring2024.assignEmptySeat(studentprofile8.getCurrentCourseLoad());
                SeatAssignment studentprofile8RegisteredForInfo6200Spring2024 = info6200offerSpring2024.assignEmptySeat(studentprofile8.getCurrentCourseLoad());
            // Register student 9 for info5001 and csye6200
                SeatAssignment studentprofile9RegisteredForInfo5001Spring2024 = info5001offerSpring2024.assignEmptySeat(studentprofile9.getCurrentCourseLoad());
                SeatAssignment studentprofile9RegisteredForCsye6200Spring2024 = csye6200offerSpring2024.assignEmptySeat(studentprofile9.getCurrentCourseLoad());
            // Register student 10 for info5100 and csye6202
                SeatAssignment studentprofile10RegisteredForInfo5100Spring2024 = info5100offerSpring2024.assignEmptySeat(studentprofile10.getCurrentCourseLoad());
                SeatAssignment studentprofile10RegisteredForCsye6202Spring2024 = csye6202offerSpring2024.assignEmptySeat(studentprofile10.getCurrentCourseLoad());
        
                //Assign grades to student 1 to student 10
                studentprofile1RegisteredForInfo5001Spring2024.setGrade(3.7f);
                studentprofile1RegisteredForInfo5100Spring2024.setGrade(3.3f);
                studentprofile2RegisteredForInfo5002Spring2024.setGrade(3.7f);
                studentprofile2RegisteredForInfo6200Spring2024.setGrade(3.3f);
                studentprofile3RegisteredForInfo5100Spring2024.setGrade(3.7f);
                studentprofile3RegisteredForDamg6105Spring2024.setGrade(3.3f);
                studentprofile4RegisteredForInfo6215Spring2024.setGrade(3.7f);
                studentprofile4RegisteredForDamg6103Spring2024.setGrade(3.3f);
                studentprofile5RegisteredForInfo5001Spring2024.setGrade(3.7f);
                studentprofile5RegisteredForDamg6101Spring2024.setGrade(3.3f);
                studentprofile6RegisteredForInfo5002Spring2024.setGrade(3.7f);
                studentprofile6RegisteredForCsye6200Spring2024.setGrade(3.3f);
                studentprofile7RegisteredForInfo5100Spring2024.setGrade(3.7f);
                studentprofile7RegisteredForCsye6202Spring2024.setGrade(3.3f);
                studentprofile8RegisteredForInfo6215Spring2024.setGrade(3.7f);
                studentprofile8RegisteredForInfo6200Spring2024.setGrade(3.3f);
                studentprofile9RegisteredForInfo5001Spring2024.setGrade(3.7f);
                studentprofile9RegisteredForCsye6200Spring2024.setGrade(3.3f);
                studentprofile10RegisteredForInfo5100Spring2024.setGrade(3.7f);
                studentprofile10RegisteredForCsye6202Spring2024.setGrade(3.3f);
                
                
                
                
        // Return
        return business;
    }  
}
