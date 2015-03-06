package com.twu.action;

import com.twu.entities.User;
import com.twu.tools.ReadFromTxtFile;

import java.util.ArrayList;

/**
 * Created by ayiannak on 05/03/2015.
 */
public class LogIn {
    ArrayList<User> listOfUsers;
    private final String file="/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/UserDetails";
    public static User userLoggedIn;

    public LogIn(){
        userLoggedIn=new User(null,null,null,null);
        userLoggedIn.setIsLoggedIn(false);
        listOfUsers=new ArrayList<User>();
        ReadFromTxtFile reader=new ReadFromTxtFile(file);
        User user;
        ArrayList<String> details= reader.getDetails();

        for(int i=0;i<details.size()-1;i+=4){
            user=new User(details.get(i),details.get(i + 1),details.get(i + 2),details.get(i + 3));
            listOfUsers.add(user);

        }
    }


    public Boolean validateUser(String userName,String passWord){
            for(User user:listOfUsers){
                if(user.getUserName().equals(userName)&&user.getPassword().equals(passWord)){
                    userLoggedIn=user;
                    userLoggedIn.setIsLoggedIn(true);
                    System.out.println("------Successfully logged in--------");
                    return true;}

            }
        System.out.println("------------Try Again----------");
            return false;

    }



}
