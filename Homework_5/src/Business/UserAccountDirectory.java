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
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public UserAccount addUserAccount() {
        UserAccount ua = new UserAccount();
        userAccountDirectory.add(ua);
        return ua;
    }
    
    public void deleteUserAccount(UserAccount ua) {
        userAccountDirectory.remove(ua);
    }
}
