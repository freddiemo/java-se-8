package se.example;

/**
 * Operators, operands and expressions samples.
 */
public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("Result " + result);
        int previousResult = result;
        System.out.println("Previous result " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("Result " + result);
        char firstChar = 'A'; char secondChar = 'B';
        System.out.println(firstChar + secondChar);
        System.out.println("" + firstChar + secondChar);
        result = 2;
        result = result * 10; // 2 * 10 = 20
        System.out.println(result);
        result = result / 4; // 40 / 4 = 5
        System.out.println(result);
        result = 5;
        result = result % 3; // the remainder of (5 % 3) = 2
        System.out.println(result);
    }
}