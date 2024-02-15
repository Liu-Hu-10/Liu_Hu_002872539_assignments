/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HU
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;

    
    public PersonDirectory() {
        
        this.personList = new ArrayList<Person>();
        initializeSampleData();
    }



    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    } 
    
    public void deletePerson(Person p){
        personList.remove(p);

    }
    
    public Person searchPerson(String searchQuery) {
        for (Person person : personList) {
            boolean firstNameMatch = person.getFirstName().equalsIgnoreCase(searchQuery);
            boolean lastNameMatch = person.getLastName().equalsIgnoreCase(searchQuery);
            boolean workAddressMatch = person.getWorkAddress() != null && person.getWorkAddress().getStreetAddress().equalsIgnoreCase(searchQuery);
            boolean homeAddressMatch = person.getHomeAddress() != null && person.getHomeAddress().getStreetAddress().equalsIgnoreCase(searchQuery);

            if (firstNameMatch || lastNameMatch || workAddressMatch || homeAddressMatch) {
                return person;
            }
        }
        return null;
    }
    
    public Person newSearchPerson(String firstName, String lastName, String workStreet, String homeStreet) {
    for (Person person : personList) {
        boolean firstNameMatch = !firstName.isEmpty() && person.getFirstName().equalsIgnoreCase(firstName);
        boolean lastNameMatch = !lastName.isEmpty() && person.getLastName().equalsIgnoreCase(lastName);
        boolean workAddressMatch = !workStreet.isEmpty() && person.getWorkAddress() != null && person.getWorkAddress().getStreetAddress().equalsIgnoreCase(workStreet);
        boolean homeAddressMatch = !homeStreet.isEmpty() && person.getHomeAddress() != null && person.getHomeAddress().getStreetAddress().equalsIgnoreCase(homeStreet);

        if (firstNameMatch && lastNameMatch && (workAddressMatch || homeAddressMatch)) {
            return person; // Return the first match
        }
    }
    return null; // No match found
}
    
    
        // Based on the requirement we need to have 5 people at the beginningm so I need a method with parameters for initializing sample data
    public Person addNewPerson(String firstName, String lastName, String ssn, String licenseNumber, Address homeAddress, Address workAddress) {
        Person newPerson = new Person(firstName, lastName, ssn, licenseNumber, homeAddress, workAddress);
        personList.add(newPerson);
        return newPerson;
    }
    
        // New method to initialize sample data
    private void initializeSampleData() {
        addNewPerson("Hu", "Liu", "123-45-6789", "D1234567", new Address("123 Main St", "Apt 3P", "New York", "NY", "02101"), new Address("150 Work St", "Suite 200", "New York", "NY", "01110"));
        addNewPerson("Louis", "Smith", "987-65-4321", "S9876543", new Address("456 Elm St", "Apt 2B", "Cambridge", "MA", "02139"), new Address("101 Work Rd", "Floor 3", "Cambridge", "MA", "02141"));
        addNewPerson("Ava", "Johnson", "222-33-4444", "A2345678", new Address("789 Pine St", "Apt 5", "Somerville", "MA", "02144"), new Address("200 Office Pkwy", "Room 600", "Malden", "MA", "02148"));
        addNewPerson("Bob", "Will", "333-22-1111", "B3456789", new Address("321 Oak St", "Apt 6A", "Boston", "MA", "02215"), new Address("300 Tech Rd", "Suite 400", "Boston", "MA", "02210"));
        addNewPerson("Muller", "Davis", "444-55-6666", "C4567890", new Address("654 Maple Ave", "Apt 8B", "Cambridge", "MA", "02142"), new Address("400 Innovation Ave", "Floor 7", "Cambridge", "MA", "02141"));
    }
    
    
}
    