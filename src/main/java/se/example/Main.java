package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumDivisors = 0;
        int divisor = number -1;
        do {
            if (number % divisor == 0) {
                sumDivisors += divisor;
            }
            divisor--;
        } while(divisor > 0);
        if (sumDivisors == number) {
            return true;
        }

        return false;
    }

}