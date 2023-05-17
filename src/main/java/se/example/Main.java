package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        boolean hasTeen = false;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            hasTeen = true;
        }
        return hasTeen;
    }

    public static boolean isTeen(int number) {
        boolean isTeen = false;
        if (number >= 13 && number <= 19)
            isTeen = true;
        return isTeen;
    }

}