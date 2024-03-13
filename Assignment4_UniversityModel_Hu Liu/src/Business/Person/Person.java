/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    String name;
    
// Person constructor with only id
    public Person(String id) {

        this.id = id;
        
    }

    // Person constructor with both id and name
    public Person(String id, String name) {

        this.id = id;
        this.name = name;
        
    }
    
    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public String getName(){
        return name;
    }
    // From my previous project, I ovverrided toString to return name, here the provided code is to getPersonID();
    @Override
    public String toString() {
        return getPersonId();
    }

    
}
