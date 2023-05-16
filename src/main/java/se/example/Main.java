package se.example;

/**
 * Operators precedence sample.
 */
public class Main {
    public static void main(String[] args) {
        double doubleValue = 20d;
        double doubleSecondValue = 80d;
        double result = (doubleValue + doubleSecondValue) * 100d % 40d;
        boolean hasRemainder = (result != 0) ? true : false;
        System.out.println("Has remainder: " + hasRemainder);
        if (hasRemainder) {
            System.out.println("Got some remainder: " + result);
        }
    }
}