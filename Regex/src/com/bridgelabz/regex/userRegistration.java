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
    }
}
