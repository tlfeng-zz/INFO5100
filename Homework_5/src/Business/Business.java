/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ftl
 */
public class Business {
    private String businessName;
    private PersonDirectory personDir;
    private UserAccountDirectory uaDir;

    public Business (String name) {
        name = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    
    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDirectory personDir) {
        this.personDir = personDir;
    }

    public UserAccountDirectory getUaDir() {
        return uaDir;
    }

    public void setUaDir(UserAccountDirectory uaDir) {
        this.uaDir = uaDir;
    }
    
}
