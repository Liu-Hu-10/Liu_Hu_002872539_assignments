package CourseSchedule;

import java.util.ArrayList;
import java.util.List;


public class CourseOfferDirectory {

    
    private List<CourseOffer> courseOfferList;
    
    public CourseOfferDirectory() {
        this.courseOfferList = new ArrayList<>();
    }
    
    
    public CourseOffer getCourseOfferByNumber(String n) {
        for (CourseOffer co : courseOfferList) {
            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }
    
    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : courseOfferList) {
            sum = sum + co.getTotalCourseRevenues();
        }
        return sum;
    }
    
    public void printEachCourseRevenue(){
        System.out.println("Course Revenue:");
        for (CourseOffer c : courseOfferList) {
            System.out.println(c.getCourseNumber() + " : " + c.getTotalCourseRevenues());
        }
    }

    public List<CourseOffer> getCourseOfferList() {
        return courseOfferList;
    }
    
    public void setCourseOfferList(List<CourseOffer> courseOfferList) {
        this.courseOfferList = courseOfferList;
    }
    
    public void removeCourseOffer(CourseOffer co) {
        courseOfferList.remove(co);
    }
    
    public CourseOffer getCourseOffer(int index) {
        return courseOfferList.get(index);
    }
    
    public int size() {
        return courseOfferList.size();
    }
    
    public CourseOffer get(int index) {
        return courseOfferList.get(index);
    }
    
    public void set(int index, CourseOffer co) {
        courseOfferList.set(index, co);
    }
    
    public void remove(int index) {
        courseOfferList.remove(index);
    }
    
    public void clear() {
        courseOfferList.clear();
    }
    
    public boolean contains(CourseOffer co) {
        return courseOfferList.contains(co);
    }
    
    public boolean isEmpty() {
        return courseOfferList.isEmpty();
    }
    
    public int indexOf(CourseOffer co) {
        return courseOfferList.indexOf(co);
    }
    
    public void add(int index, CourseOffer co) {
        courseOfferList.add(index, co);

    }   
    
    public void printAllCourseOffers() {
        System.out.println("All Course Offers:");
        for (CourseOffer co : courseOfferList) {
            String facultyName = co.getFacultyProfile() != null ? co.getFacultyProfile().getName() : "No instructor assigned";
            System.out.println("Course Number: " + co.getCourseNumber() + ", Course Name: " + co.getCourseName() +
                    ", Faculty: " + facultyName + ", Seats: " + co.getTakenSeats() + " taken, " + co.getRemainingSeats() + " remaining");
        }
    }

    public void addCourseOffer(CourseOffer co) {
        if (!courseOfferList.contains(co)) {
            courseOfferList.add(co);
        }
    }


}