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

    public PersonDirectory(){
    
        this.personList = new ArrayList<Person>();
        
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
    

    
    
}
