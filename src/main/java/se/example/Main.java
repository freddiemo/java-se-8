package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature >= 25 && temperature <= 35) || summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }

}