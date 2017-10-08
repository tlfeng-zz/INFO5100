/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Tianli Feng
 */
public class CustomerDirectory {
    private ArrayList<Person> cD;
    
    public CustomerDirectory() {
        cD = new ArrayList<Person>();
    }

    public ArrayList<Person> getcD() {
        return cD;
    }

    public void setcD(ArrayList<Person> cD) {
        this.cD = cD;
    }
    
    public Person addPerson() {
        Person person = new Person();
        cD.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        cD.remove(person);
    }
    
}
