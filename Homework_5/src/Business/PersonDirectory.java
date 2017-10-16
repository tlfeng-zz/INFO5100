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
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson() {
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personList.remove(person);
    }
    
    public Person findPersonByLastName(String lastName) {
        for (Person person: personList) {
            if (person.getLastName().equals(lastName)) {
                        return person;
            }
        }
        return null;
    }
}
