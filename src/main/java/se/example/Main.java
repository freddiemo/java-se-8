package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap= false;
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }
        }
        return isLeap;
    }

}