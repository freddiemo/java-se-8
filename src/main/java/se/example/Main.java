package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long rounded = 0;
        if (kilometersPerHour < 0) {
            rounded = -1;
        } else {
            rounded = (long) Math.round(kilometersPerHour * 0.62150404);
        }
        return rounded;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

}