package com.alexander.diceGame;

import java.util.Scanner;

public class GameLogic {

    // Method to play the game
    public static void playGame(Scanner scanner, String[] playerNames, int[] playerScores, int numDice) {
        for (int i = 0; i < playerNames.length; i++) {
            int score = Player.rollDice(numDice);
            playerScores[i] = score;
            System.out.println(playerNames[i] + " rolled a total of " + score);
        }
    }

    // Method to find the winner or winners
    public static void findWinner(String[] playerNames, int[] playerScores) {
        int maxScore = -1;
        String winners = "";

        for (int i = 0; i < playerNames.length; i++) {
            if (playerScores[i] > maxScore) {
                maxScore = playerScores[i];
                winners = playerNames[i];
            } else if (playerScores[i] == maxScore) {
                winners += ", " + playerNames[i];
            }
        }

        // Announce the winner
        System.out.println("Winner(s): " + winners + " with a score of " + maxScore);

        // If there is a tie, play another round to find the final winner
        if (winners.contains(",")) {
            System.out.println("It's a tie! Playing another round to find the final winner...");
            playGame(new Scanner(System.in), playerNames, playerScores, 1); // Single dice round
            findWinner(playerNames, playerScores);
        }
    }
}
