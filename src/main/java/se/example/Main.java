package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Player 3", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Player 4", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Player 5", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Player 6", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}