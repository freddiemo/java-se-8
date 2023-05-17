package se.example;

/**
 * Methods overloading samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0 ) {
            return "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds/60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds + "), must be a value between 1 and 59";
        }

        return minutes/60 + "h " + minutes % 60 + "m " + seconds + "s";
    }


}