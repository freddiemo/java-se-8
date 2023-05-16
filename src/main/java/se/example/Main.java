package se.example;

/**
 * If conditionals samples.
 */
public class Main {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It it not alien!");

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }
        if (topScore != 100) {
            System.out.println("You didn't get the high score!");
        }

        topScore = 80;
        if (topScore < 100) {
            System.out.println("You didn't get the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}