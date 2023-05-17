package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        boolean equalSum = false;
        if (a + b == c)
            equalSum = true;
        return equalSum;
    }

}