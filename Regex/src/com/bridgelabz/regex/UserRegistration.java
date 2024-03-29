package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws InvalidDetailsEntryException{
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

        String password;
        do {
            System.out.println("Enter your password (Min 8 characters required + Atleast one Uppercase and one number and exactly one special character) : ");
            password = scanner.nextLine();
            x = validate.isValidPassword(password);
        } while (!x);
        System.out.println("Valid password: " + password);
        System.out.println("[Firstname : " + firstName + "] [LastName : " + lastName
        + "] [Email : " + email + "] [Phone Number: " + phoneNum + " ]");
    }
}
