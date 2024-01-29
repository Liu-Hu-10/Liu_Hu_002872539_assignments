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
    
    String firstName;
    String lastName;
    String homeAddress;
    String age;
    String socialSecurtyNumber;

    
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

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSocialSecurtyNumber() {
        return socialSecurtyNumber;
    }

    public void setSocialSecurtyNumber(String socialSecurtyNumber) {
        this.socialSecurtyNumber = socialSecurtyNumber;
    }

       @Override
    public String toString(){
    
        return firstName;
    
    } 
    
    
}
