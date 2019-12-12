package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String usersPassword = "vjht008#1";
        String[] arr = new String[0];
        String passwordGuess = "";
        arr = dictionary(passwordGuess);
        originalRules(arr, usersPassword);
        personalInfoRules(arr, usersPassword);
        //personalPlusCommon(arr, usersPassword);
        //replacementRules(arr, usersPassword);
    }


    public static String[] dictionary(String passwordGuess) {
        List<String> passwordList = new ArrayList<String>();
        String[] arr = new String[0];

        // Read each item from the text file into an array
        try (FileReader fr = new FileReader("C:\\Users\\FolkenJoshua(UMKC-St\\IdeaProjects\\PasswordCracker\\src\\MillionPasswords");
             BufferedReader br = new BufferedReader(fr);) {

            while (passwordGuess != null) {
                passwordGuess = br.readLine();
                if (passwordGuess != null) {
                    passwordList.add(passwordGuess);
                } else if (passwordGuess == null) {
                    // Pass each item from passwordList to an array of type String
                    arr = passwordList.toArray(new String[passwordList.size()]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }

    // This method applies common endings to each password
    private static String originalRules(String[] arr, String usersPassword) {
        String assemble = "";

        // Iterate through each rule to be applied
        // If you need to add more rule change this for loop. Example, 8 rules i < 9, 9 rules i < 10.
        for (int i = 0; i < 9; i++) {

            // Iterate through each item of the array
            for (int j = 0; j < arr.length; j++) {
                assemble = arr[j];

                // Apply the rule to the end of each password
                switch (i) {
                    case 1:
                        assemble = arr[j] + "1";
                        break;
                    case 2:
                        assemble = arr[j] + "12";
                        break;
                    case 3:
                        assemble = arr[j] + "123";
                        break;
                    case 4:
                        assemble = arr[j] + "1234";
                        break;
                    case 5:
                        assemble = arr[j] + "12345";
                        break;
                    case 6:
                        assemble = arr[j] + "1!";
                        break;
                    case 7:
                        assemble = arr[j] + "!";
                        break;
                    case 8:
                        assemble = arr[j] + "#1";
                        break;
                }

                // Check if password or each password with a rule applied are equal to the usersPassword
                // System.out.println(assemble);
                if (assemble.equalsIgnoreCase(usersPassword)) {
                    System.out.println("Password is: " + assemble);
                    return assemble;
                }
            }
        }
        return "";
    }

    // TODO: Add a method that replaces each letter that can be replaced, i = 1, o = 0, e = 3, a = @, s = $, s = 5
    private static String replacementRules(String[] arr, String usersPassword) {
        String assemble = "";

        // Iterate through each rule to be applied
        // If you need to add more rule change this for loop. Example, 8 rules i < 9, 9 rules i < 10.
        for (int i = 0; i < 9; i++) {

            // Iterate through each item of the array
            for (int j = 0; j < arr.length; j++) {
                assemble = arr[j];

                // Apply the rule to the end of each password
                switch (i) {
                    case 1:
                        assemble = arr[j] + "1";
                        break;
                }

                // Check if password or each password with a rule applied are equal to the usersPassword
                // System.out.println(assemble);
                if (assemble.equalsIgnoreCase(usersPassword)) {
                    System.out.println("Password is: " + assemble);
                    return assemble;
                }
            }
        }
        return "";
    }

    // This method creates a password based on personal information
    private static String personalInfoRules(String[] arr, String usersPassword) {
        // First name, last name, pet's name, birth date, birth year, birth month, street name, house number, zip code
        // Use personal info by itself, before common passwords, after common passwords, and apply all original rules and replacement rules
        String firstName = "Josh";
        String lastName = "Franklin";
        String petName = "Snowball";
        String birthYear = "1993";
        String birthMonth = "December";
        String birthDay = "21";
        String streetName = "Washington";
        String houseNumber = "1739";
        String zipCode = "64112";

        String assemble = "";

        // Iterate through each rule to be applied
        // If you need to add more rule change this for loop. Example, 8 rules i < 9, 9 rules i < 10.
        for (int i = 0; i < 19; i++) {

            // Iterate through each item of the array
            for (int j = 0; j < arr.length; j++) {
                assemble = arr[j];

                // Apply the rule to the end of each password
                switch (i) {
                    case 1:
                        assemble = arr[j] + firstName;
                        break;
                    case 2:
                        assemble = arr[j] + lastName;
                        break;
                    case 3:
                        assemble = arr[j] + petName;
                        break;
                    case 4:
                        assemble = arr[j] + birthYear;
                        break;
                    case 5:
                        assemble = arr[j] + birthMonth;
                        break;
                    case 6:
                        assemble = arr[j] + birthDay;
                        break;
                    case 7:
                        assemble = arr[j] + streetName;
                        break;
                    case 8:
                        assemble = arr[j] + houseNumber;
                        break;
                    case 9:
                        assemble = arr[j] + zipCode;
                        break;
                    case 10:
                        assemble = firstName + arr[j];
                        break;
                    case 11:
                        assemble = lastName + arr[j];
                        break;
                    case 12:
                        assemble = petName + arr[j];
                        break;
                    case 13:
                        assemble = birthYear + arr[j];
                        break;
                    case 14:
                        assemble = birthMonth + arr[j];
                        break;
                    case 15:
                        assemble = birthDay + arr[j];
                        break;
                    case 16:
                        assemble = streetName + arr[j];
                        break;
                    case 17:
                        assemble = houseNumber + arr[j];
                        break;
                    case 18:
                        assemble = zipCode + arr[j];
                        break;
                }
                if (assemble.equalsIgnoreCase(usersPassword)) {
                    System.out.println("Password is: " + assemble);
                    return assemble;
                }
            }
        }
        return "";
    }

    // TODO: Call every common ending to every personal info, so each one needs to pass through common endings 8 times
    private static String personalPlusCommon(String[] arr, String usersPassword){
        return "a";
    }

    // TODO: One of last methods to make will be a method to change each possible password to it's hashcode and compare hashcodes

    // TODO: Research ways to circumvent websites locking you out after a few failed attempts, write a method to do so and with
    // TODO: this last method you will also need to enter the username and password and alert user when a successful login occurred
}

