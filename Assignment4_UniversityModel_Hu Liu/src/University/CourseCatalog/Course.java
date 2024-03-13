/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University.CourseCatalog;

/**
 *
 * @author HU
 */
public class Course {
    String number;
    String name;
    int credits;
    int price = 1800; // per credit hour

    public Course(String numb, String n, int ch) {
        name = n;
        number = numb;
        credits = ch;

    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return name;
    }  
    
     @Override
    public String toString() {
        return getCourseNumber();
    }
    
}
