package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("********************************************");
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("********************************************");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("""
                    Please select the difficulty level:
                    1. Easy (10 chances)
                    2. Medium (5 chances)
                    3. Hard (3 chances)
                    4. Exit""");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();
            int chances = 0;
            int attempts = 1;
            int randomChoice = random.nextInt(1,100)+1;
            switch (choice) {
                case 1:
                    System.out.println("Great! You have selected the Easy difficulty level.\nYou have 10 chances to guess the correct number.\nLet's start the game!");
                    chances = 10;
                    break;
                case 2:
                    System.out.println("Great! You have selected the Medium difficulty level.\nYou have 5 chances to guess the correct number.\nLet's start the game!");
                    chances = 5;
                    break;
                case 3:
                    System.out.println("Great! You have selected the Hard difficulty level.\nYou have 3 chances to guess the correct number.\nLet's start the game!");
                    chances = 3;
                    break;
                case 4:
                    System.out.println("Bye!🙂");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            while (true) {
                if (chances != 0) {
                    System.out.println();
                    System.out.print("Enter Your Guess: ");
                    int guess = scanner.nextInt();

                    if (guess == randomChoice) {
                        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                        break;
                    } else if (guess > randomChoice) {
                        System.out.println("Incorrect! The number is less than " + guess + ".");
                        chances--;
                        attempts++;
                        System.out.println("You have " + chances + " chances left.");
                        if (chances == 0) {
                            System.out.println("Your chances are over. Please try again.");
                            System.out.println("Correct Number is: " + randomChoice);
                        }
                    } else {
                        System.out.println("Incorrect! The number is grater than " + guess + ".");
                        chances--;
                        attempts++;
                        System.out.println("You have " + chances + " chances left.");
                        if (chances == 0) {
                            System.out.println("Your chances are over. Please try again.");
                            System.out.println("Correct Number is: " + randomChoice);
                        }
                    }
                } else break;
            }
        }
    }
}