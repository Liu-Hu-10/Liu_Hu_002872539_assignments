/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HU
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String ssn;
    private String licenseNumber;
    private Address workAddress;
    private Address homeAddress;


    public Person() {
        // I need a default constructor
    }
    
    public Person(String firstName, String lastName, String ssn, String licenseNumber, Address homeAddress, Address workAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.licenseNumber = licenseNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    @Override
    public String toString() {
        // Example: Combine first name and last name for display
        return firstName;
    }
    
}
