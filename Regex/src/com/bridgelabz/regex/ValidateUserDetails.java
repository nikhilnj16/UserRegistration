package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserDetails {

    public boolean isValidFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean isValidLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z0-9+._-]+@[a-z0-9+._-]+\\.[a-z]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPhoneNum(String phoneNum){
        Pattern pattern = Pattern.compile("^[+]{1}\\d{2} \\d{10}$");
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
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
        return true;
    }
}
