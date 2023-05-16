package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 0));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0 && hourOfDay < 24) && (hourOfDay > 22 || hourOfDay < 8)) {
            barking = true;
        } else {
            barking = false;
        }
        return barking;
    }

}