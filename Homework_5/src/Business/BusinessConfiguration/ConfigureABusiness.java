/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessConfiguration;

import Business.Business;
import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.UserAccountDirectory;

/**
 *
 * @author ftl
 */
public class ConfigureABusiness{
    public static Business Initialize (String n) { // returns a business object
        Business b = new Business(n);
        b.setPersonDir(new PersonDirectory());
        b.setUaDir(new UserAccountDirectory());
        
        PersonDirectory pd = b.getPersonDir();
        Person p = pd.addPerson(); //create person object 
        p.setFirstName("Ann");
        p.setLastName("Wells");

        p = pd.addPerson(); // create a second person object 
        p.setFirstName("John");
        p.setLastName("Brown");

        UserAccountDirectory uad= b.getUaDir(); // prepare to create user accounts
        Person p2 = pd.findPersonByLastName("Brown");
        
        if(p2 != null) {
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2); //link user account to the Mr. Brown 
            ua.setUserId("jadam");
            
            ua.setPassword(EncryptPassword.md5("pw"));
            ua.setAccountType("System Admin");
            ua.setStatus(true);
        }
        
        Person p3 = pd.findPersonByLastName("Wells");
        if(p3 != null) {
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p3); //link user account to the Mr. Brown 
            ua.setUserId("ahr");
            ua.setPassword(EncryptPassword.md5("pw"));
            ua.setAccountType("HR Admin");
            ua.setStatus(true);
        }
    return b;
    } 
}
