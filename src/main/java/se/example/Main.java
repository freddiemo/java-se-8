package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (isValid(a) && isValid(b) && isValid(c)) {
            if (((a % 10) == (b % 10)) || ((a % 10) == (c % 10)) || ((b % 10) == (c % 10))) {
                return true;
            }
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }

        return false;
    }

}