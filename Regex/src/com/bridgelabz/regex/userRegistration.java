package com.bridgelabz.regex;

import java.util.Scanner;

public class userRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        boolean x;
        ValidateUserDetails validate = new ValidateUserDetails();

        //Validate First Name
        do {
            System.out.println("Enter your first name (min 3 characters required, starting with a capital letter): ");
            firstName = scanner.nextLine();
            x = validate.isValidFirstName(firstName);
        } while (!x);
        System.out.println("Valid first name: " + firstName);

        
        //Validate Last Name
        String lastName;
        do {
            System.out.println("Enter your last name (min 3 characters required, starting with a capital letter): ");
            lastName = scanner.nextLine();
            x = validate.isValidLastName(lastName);
        } while (!x);
        System.out.println("Valid last name: " + lastName);

        String email;
        do {
            System.out.println("Enter your email (EX: nikhil@gmail.com) : ");
            email = scanner.nextLine();
            x = validate.isValidEmail(email);
        } while (!x);
        System.out.println("Valid email ID: " + email);

        String phoneNum;
        do {
            System.out.println("Enter your phone number (include +91 before phone number) : ");
            phoneNum = scanner.nextLine();
            x = validate.isValidPhoneNum(phoneNum);
        } while (!x);
        System.out.println("Valid phone number: " + phoneNum);
    }
}
