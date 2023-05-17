package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        boolean areEquals = false;
        if ((int)(firstValue * 1000) == (int)(secondValue * 1000) )
            areEquals = true;
        return areEquals;
    }

}