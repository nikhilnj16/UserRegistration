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
}
