package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserDetails {

    public boolean isValidFirstName(String firstName){
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher("^[A-Z][a-zA-Z]{2,}$");
        return matcher.matches();
    }
}
