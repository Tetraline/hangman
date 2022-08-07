package org.example;

import java.util.ArrayList;

public class IO {
    Letter[] letterArray;
    String targetWord;
    ArrayList<Character> triedChars = new ArrayList<Character>();
    int score;

    public IO(String targetWord) {
        letterArray = new Letter[targetWord.length()];
        this.targetWord = targetWord;
        score = 0;
        for (int i = 0; i < targetWord.length(); i++) {
            letterArray[i] = new Letter(targetWord.charAt(i));
        }
    }

    public void printGameState() {
        System.out.println("Target word: " + targetWord);
        System.out.println("Tried letters: " + triedChars.toString());
        System.out.println("Score: " + score);
        for (Letter letter : letterArray) {
            System.out.print(letter.getOutputChar());
        }
        System.out.print("\n");
    }

    // Make a guess
    // Returns true if the word is complete
    public boolean makeGuess(char guess) {
        // Check if the guess has been made before
        if (triedChars.contains(guess)) {
            return false;
        }
        // Check if the guess matches any of the letters
        for (Letter letter : letterArray) {
            if (guess == letter.getLetter()) {
                letter.guess();
            }
        }
        // Add the guess to the list of previous guesses
        triedChars.add(guess);
        score = triedChars.size();
        // Check if the word is complete
        for (Letter letter : letterArray) {
            if (!letter.isGuessed()) {
                return false;
            }
        }
        return true;
    }
}
