package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static Scanner nameScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        String fullName = nameScanner.nextLine();

        //split the string using the split method
        String[] splitName = fullName.split(" ");

        //create variable for first, middle, and last name
        String firstName = "";
        String middleName = "N/A";
        String lastName = "";

        //create an if statements that goes through the possible inputs from the user
        if (splitName.length == 1) {
            firstName = splitName[0];// Only first name
        } else if (splitName.length == 2) {
            firstName = splitName[0]; // First and last name
            lastName = splitName[1];
        } else if (splitName.length >= 3) {
            firstName = splitName[0];// First, middle, last
            lastName = splitName[splitName.length - 1];
        }

        //print out names using format from workbook
        System.out.println("\nFirst name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }

}
