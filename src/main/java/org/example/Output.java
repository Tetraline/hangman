package org.example;


public class Output {

    public static void displayWord(String word, Boolean[] guessedChars) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedChars[i]) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.print("\n");
    }

    public static void displayResult(int lives, TurnOutcome outcome) {
        switch (outcome) {
            case correct:
                System.out.println("Well done! That is correct.");
                break;
            case incorrect:
                System.out.println("Oh no! One life lost.");
                break;
            case alreadyGuessed:
                System.out.println("You already guessed that!");
                break;

        }
        System.out.println("Lives remaining: " + lives);
    }

    public static void displayWinCondition(int lives) {
        System.out.println("Congratulations! You win with " + lives + " left.");
    }

    public static void displayLoseCondition(String word) {
        System.out.println("You lose. The word was " + word);
    }

}
