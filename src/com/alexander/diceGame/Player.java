package com.alexander.diceGame;

import java.util.Random;

public class Player {

    // Method to roll a given number of dice and return the total score
    public static int rollDice(int numDice) {
        Random random = new Random();
        int totalScore = 0;
        for (int i = 0; i < numDice; i++) {
            totalScore += random.nextInt(6) + 1; // Rolling a six-sided die
        }
        return totalScore;
    }
}
