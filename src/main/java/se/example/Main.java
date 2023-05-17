package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) minutes / 60;
            int days = hours / 24;
            System.out.println(minutes + " min = " + days / 365 + " y and " + days % 365 + " d");
        }
    }

}