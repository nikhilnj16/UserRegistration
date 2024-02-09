package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserDetails {
    static boolean valid;
    public boolean isValidFirstName(String firstName) throws InvalidDetailsEntryException{
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            throw new InvalidDetailsEntryException("Invalid first name: " + firstName);
        }
    }

    public boolean isValidLastName(String lastName) throws InvalidDetailsEntryException{
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            throw new InvalidDetailsEntryException("Invalid last name: " + lastName);
        }
    }

    public boolean isValidEmail(String email) throws InvalidDetailsEntryException{
        Pattern pattern = Pattern.compile("^[a-z0-9+._&-]+(?:\\.[a-z0-9+._&-]+)*@(?:[a-z0-9]+\\.)+[a-z]{2,7}$");
        Matcher matcher = pattern.matcher(email);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            throw new InvalidDetailsEntryException("Invalid email: " + email);
        }
    }

    public boolean isValidPhoneNum(String phoneNum) throws InvalidDetailsEntryException{
        Pattern pattern = Pattern.compile("^[+]{1}\\d{2} \\d{10}$");
        Matcher matcher = pattern.matcher(phoneNum);
        valid = matcher.matches();
        if(valid){
            return true;
        } else {
            throw new InvalidDetailsEntryException("Invalid phoneNum: " + phoneNum);
        }
    }
    public boolean isValidPassword(String password) throws InvalidDetailsEntryException{
        if (password.length() < 8){
            throw new InvalidDetailsEntryException("Invalid password length must be more than 8");
        }
        if (!password.matches(".*[A-Z].*")){
            throw new InvalidDetailsEntryException("Invalid password must have atleast one Upper case" );
        }
        if (!password.matches(".*\\d.*")){
            throw new InvalidDetailsEntryException("Invalid password must have atleast one number");
        }
        if(!password.matches(".*[^a-zA-Z0-9].*")){
            throw new InvalidDetailsEntryException("Invalid password must have exactly one special symbol");
        }
        return true;
    }

}
