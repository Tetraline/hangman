package org.example;

import java.util.Scanner;

public class Input {
    public static char readUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
}
