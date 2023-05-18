package se.example;

/**
 * For loop samples.
 */
public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter ++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestedAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestedAmount);
        }

        for(double i = 7.5; i <= 10.0; i += 0.25) {
            double interestedAmount = calculateInterest(100.0, i);
            if (interestedAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + i + "% interest = " + interestedAmount);
        }
        System.out.println("---------");

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

        System.out.println("---------");
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);

        System.out.println("---------");
        int sum = 0;
        count = 0;
        for(int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found a match = " + i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("Total: " + sum);

        System.out.println("---------");
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0 ) {
                return false;
            }
        }

        return true;
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end < start || (start <= 0) || (end <= 0)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

}