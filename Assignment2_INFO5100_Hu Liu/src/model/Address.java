/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HU
 */
public class Address {
    
    String streetAddress;
    String unitNumber;
    String city;
    String state;
    String zipCode;

    
    public Address(String streetAddress, String unitNumber, String city, String state, String zipCode) {
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address() {
      
    }
    

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    
    
    
}
