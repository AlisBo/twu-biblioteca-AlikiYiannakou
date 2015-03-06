package com.twu.entities;

import java.lang.reflect.Field;

/**
 * Created by ayiannak on 06/03/2015.
 */
public class User {

    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    public static Boolean isLoggedIn;

    public User(String name, String pass, String email, String num){
        this.userName=name;
        this.password=pass;
        this.email=email;
        this.phoneNumber=num;
        this.isLoggedIn=false;
    }

    public String getUserName() {return userName;}

    public String getPassword() {return password;}

    public Boolean getIsLoggedIn() {return isLoggedIn;}

    public void setIsLoggedIn(Boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();
        //determine fields declared in this class only (no fields of superclass)
        String newLine = System.getProperty("line.separator");
        result.append("Name: ");
        result.append(userName);
        result.append(newLine);
        result.append("Email: ");
        result.append(email);
        result.append(newLine);
        result.append("Phone number: ");
        result.append(phoneNumber);
        result.append(newLine);
        return result.toString();
    }


}
