package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int number, int number2) {
        if (number < 10 || number > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        while(number > 0) {
            int digit = number % 10;
            int auxNumber2 = number2;
            while (auxNumber2 > 0) {
                if (digit == (auxNumber2 % 10)) {
                    return true;
                }
                auxNumber2 /= 10;
            }
            number /= 10;
        }
        return false;
    }

}