package org.example;

public class Letter {
    private char letter;
    private boolean guessed;

    Letter(char letter) {
        this.letter = letter;
        guessed = false;
    }

    public void guess() {
        guessed = true;
    }

    public char getOutputChar() {
        return guessed ? letter : '_';
    }
    public char getLetter(){
        return letter;
    }
}
