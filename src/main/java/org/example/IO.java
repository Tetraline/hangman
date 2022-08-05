package org.example;

public class IO {
    Letter[] letterArray = {};
    String targetWord;
    public IO(String targetWord){
        letterArray = new Letter[targetWord.length()];
        this.targetWord = targetWord;
    }
    public void printGameState(){
        System.out.println("Target word: " + targetWord);

        for (int i = 0; i < targetWord.length(); i++) {
           letterArray[i] = new Letter(targetWord.charAt(i));
        }
        for (Letter letter : letterArray) {
            System.out.print(letter.getOutputChar());
        }
        System.out.print("\n");
    }
    public void makeGuess(char guess){
        for (Letter letter : letterArray) {
            if(guess == letter.getLetter()){
                letter.guess();
            }
        }
    }
}
