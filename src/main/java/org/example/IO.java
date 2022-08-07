package org.example;

public class IO {
    Letter[] letterArray = {};
    String targetWord;
    public IO(String targetWord){
        letterArray = new Letter[targetWord.length()];
        this.targetWord = targetWord;
        for (int i = 0; i < targetWord.length(); i++) {
            letterArray[i] = new Letter(targetWord.charAt(i));
        }
    }
    public void printGameState(){
        System.out.println("Target word: " + targetWord);
        for (Letter letter : letterArray) {
            System.out.print(letter.getOutputChar());
        }
        System.out.print("\n");
    }

    // Make a guess
    // Returns true if the word is complete
    public boolean makeGuess(char guess){
        for (Letter letter : letterArray) {
            if(guess == letter.getLetter()){
                letter.guess();
            }
        }
        for (Letter letter : letterArray) {
            if(!letter.isGuessed()){
                return false;
            }
        }
        return true;
    }
}
