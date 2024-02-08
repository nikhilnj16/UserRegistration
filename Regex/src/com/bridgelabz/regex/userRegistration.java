package com.bridgelabz.regex;

import java.util.Scanner;

public class userRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        boolean x;
        ValidateUserDetails validate = new ValidateUserDetails();
        do {
            System.out.println("Enter your first name (min 3 characters required, starting with a capital letter): ");
            firstName = scanner.nextLine();
            x = validate.isValidFirstName(firstName);
        } while (x);
        System.out.println("Valid first name: " + firstName);
    }
}
