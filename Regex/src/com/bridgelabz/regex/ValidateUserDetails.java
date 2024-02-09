package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserDetails {
    static boolean valid;
    public boolean isValidFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            System.out.println("Please Enter Correctly");
            return false;
        }
    }

    public boolean isValidLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            System.out.println("Please Enter Correctly");
            return false;
        }
    }

    public boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z0-9+._&-]+(?:\\.[a-z0-9+._&-]+)*@(?:[a-z0-9]+\\.)+[a-z]{2,7}$");
        Matcher matcher = pattern.matcher(email);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            System.out.println("Please Enter Correctly");
            return false;
        }
    }

    public boolean isValidPhoneNum(String phoneNum){
        Pattern pattern = Pattern.compile("^[+]{1}\\d{2} \\d{10}$");
        Matcher matcher = pattern.matcher(phoneNum);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            System.out.println("Please Enter Correctly");
            return false;
        }
    }
    public boolean isValidPassword(String password){
        if (password.length() < 8){
            return false;
        }
        if (!password.matches(".*[A-Z].*")){
            return false;
        }
        if (!password.matches(".*\\d.*")){
            return false;
        }
        if(!password.matches(".*[^a-zA-Z0-9].*")){
            return false;
        }
        return true;
    }

}
