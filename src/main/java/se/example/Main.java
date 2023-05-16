package se.example;

/**
 * If/else samples.
 */
public class Main {
    public static void main(String[] args) {
       boolean gameOver = true;
       int score = 5000;
       int levelCompleted = 5;
       int bonus = 100;
       if (score <= 5000) {
           System.out.println("Your score is less than or equal to 5000");
       } else {
            System.out.println("Got here");
       }

       score = 800;
       if (score < 5000 && score > 1000) {
           System.out.println("Your score was less than 5000 but greater than 1000");
       } else if (score < 1000) {
           System.out.println("Your score was less than 1000");
       } else {
           System.out.println("Got here");
       }

       int finalScore = score;
       if (gameOver) {
           finalScore += (levelCompleted * bonus);
           System.out.println("Your final score was " + finalScore);
       }

       score = 10000;
       finalScore = score;
       levelCompleted = 8;
       bonus = 200;
       if (gameOver) {
           finalScore += (levelCompleted * bonus);
           System.out.println("Your final score was " + finalScore);
       }
    }
}