package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 9) {
            return number * 2;
        }
        int firstNumber = 0;
        int lastNumber = number % 10;
        while(number > 9) {
            number /= 10;
            if (number <= 9) {
                firstNumber = number;
            }
        }
        return firstNumber + lastNumber;
    }

}