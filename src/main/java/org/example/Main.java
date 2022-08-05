package org.example;

import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        boolean wordComplete = false;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String targetWord = d.getRandomWord();
        IO io = new IO(targetWord);

        while(!wordComplete){
            io.printGameState();
            System.out.println("Enter guess");
            char guess = scanner.nextLine().charAt(0);
            io.makeGuess(guess);
        }
        //String userName = myObj.nextLine();  // Read user input
        //System.out.println("Username is: " + userName);  // Output user input
    }
}

