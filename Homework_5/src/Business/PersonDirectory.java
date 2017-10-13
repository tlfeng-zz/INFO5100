/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ftl
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson() {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
}
