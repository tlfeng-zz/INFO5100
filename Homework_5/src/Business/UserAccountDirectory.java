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
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount addUserAccount() {
        UserAccount ua = new UserAccount();
        userAccountList.add(ua);
        return ua;
    }
    
    public void deleteUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }
        
    public UserAccount isValidUser (String userid, String pwd){
        for (UserAccount ua: getUserAccountList()) {
            if(userid.equals(ua.getUserId()) && pwd.equals(ua.getPassword())) {
                return ua;
            }
        }
        return null;
    }
}
