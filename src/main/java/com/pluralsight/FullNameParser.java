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



        //create a for loop that prints all names provided by the user from the array
        for(int i = 0; i < splitName.length; i++){

            System.out.println("Name " + (i +1) + ": " + splitName[i]); //checking if names are being split

        }
        //create an if statement that
    }

}
