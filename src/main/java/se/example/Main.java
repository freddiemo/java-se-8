package se.example;

/**
 * Operators, operands and expressions samples.
 */
public class Main {
    public static void main(String[] args) {

        int result = 1;
        result++;
        System.out.println("result = " + result);

        result = 1;
        result -= 1;
        System.out.println("Result = " + result);

        result = 1;
        result += 5;
        System.out.println("Result = " + result);

        result = 10;
        result -= 2;
        System.out.println("Result = " + result);

        result = 10;
        result -= 5.5;
        System.out.println("Result = " + result);

        result = 10;
        // sresult = result - 5.5;
        result = (int) (result - 5.5);
        System.out.println("Result = " + result);

        double doubleResult = 10;
        doubleResult -= 5.5;
        System.out.println("Double result = " + doubleResult);

        result = 10;
        result *= 1.5;
        System.out.println("Result = " + result);

        doubleResult = 10;
        doubleResult /= 1.5;
        System.out.print("Double result = " + doubleResult);
    }
}