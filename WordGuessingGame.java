package com.mono.ifelse;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the random word");
		String a=scanner.nextLine();
		int stringlength=a.length();

        
        int lives = 5;
        char[] guessedWord = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            guessedWord[i] = '_';
        }

        while (true) {
            System.out.println("Guessed word: " + String.valueOf(guessedWord));
            System.out.println("Lives: " + lives);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean guessedCorrectly = false;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                lives--;
                System.out.println("No, the guessed letter is not in the word.");
            } else {
                System.out.println("Yes, the guessed letter is in the word.");
            }

            if (lives == 0) {
                System.out.println("You ran out of lives. Game over!");
                break;
            }

            if (String.valueOf(guessedWord).indexOf('_') == -1) {
                System.out.println("Congratulations! You filled all the blanks.");
                break;
            }
        }
    }
}
