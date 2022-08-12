package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static org.example.Input.readUserInput;
import static org.example.Output.*;
import static org.example.WordSelector.selectWord;

public class HangmanGame {
    public static void main(String[] args) {
        // Get a word
        String target = selectWord();
        Boolean[] guessedChars = new Boolean[target.length()];
        Arrays.fill(guessedChars, false);
        ArrayList<Character> prev = new ArrayList<Character>();
        // While the game has not ended
        Boolean gameOver = false;
        int lives = 3;
        System.out.println(target);
        while (!gameOver) {
            // Display word with underscores
            displayWord(target, guessedChars);

            // Get a guess from user
            char input = readUserInput();
            TurnOutcome outcome = null;
            // Check result of the guess
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) == input) {
                    guessedChars[i] = true;
                    outcome = TurnOutcome.correct;
                }
            }
            if (outcome != TurnOutcome.correct) {
                if (prev.contains(input)) {
                    outcome = TurnOutcome.alreadyGuessed;
                } else {
                    outcome = TurnOutcome.incorrect;
                    lives--;
                    prev.add(input);
                }
            }

            // Display result to the user
            displayResult(lives, outcome);

            // If word is complete then print "well done" and end
            int c = 0;
            for (int i = 0; i < target.length(); i++) {
                if (guessedChars[i] == true) {
                    c++;
                }
            }
            if (c == target.length()) {
                displayWinCondition(lives);
                gameOver = true;
            }
            // If lives is zero then print "you lose" and end
            if (lives == 0) {
                displayLoseCondition(target);
                gameOver = true;
            }
        }
    }
}
