package com.alexander.diceGame;

import java.util.Scanner;

public class ConsoleInput {

    // Method to get an integer input from the user with error handling
    public static int getNumberInput(Scanner scanner, String message) {
        int numberInput = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(message + " ");
            if (scanner.hasNextInt()) {
                numberInput = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Please enter a valid NUMBER.");
                scanner.next(); // Consume invalid input
            }
        }
        return numberInput;
    }

    // Method to get a string input from the user with error handling if users enters a Number as name
    public static String getNameInput(Scanner scanner, String message) {
        String input = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.print(message + " ");
            input = scanner.next();
            if (input.matches("[a-zA-Z]+")) {
                validInput = true;
            } else {
                System.out.println("Please enter a valid CHARACTER.");
            }
        }
        return input;
    }
}
