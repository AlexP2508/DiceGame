package com.alexander.diceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiate a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game!");

        // Get the number of players
        int playersNumber = ConsoleInput.getNumberInput(scanner, "Enter the number of players (at least 2):");
        if (playersNumber < 2) {
            System.out.println("IT TAKES TWO TO DANCE TANGO!");
            System.exit(0);
        }

        // Initialize arrays to store player names and scores
        String[] playerNames = new String[playersNumber];
        int[] playerScores = new int[playersNumber];

        // Get player names
        for (int i = 0; i < playersNumber; i++) {
            playerNames[i] = ConsoleInput.getNameInput(scanner, "Enter the name of player " + (i + 1) + ":");
        }

        // Get the number of dice
        int diceNumber = ConsoleInput.getNumberInput(scanner, "Enter the number of dice each player gets:");

        // Play the game
        GameLogic.playGame(scanner, playerNames, playerScores, diceNumber);

        // Find the winner or winners
        GameLogic.findWinner(playerNames, playerScores);

        // Close the scanner
        scanner.close();
    }

}
