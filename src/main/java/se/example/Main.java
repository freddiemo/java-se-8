package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }
        i = 1;
        while(true) {
            if (i > 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
        boolean isReady = false;
        i = 0;
        do {
            if (i > 5) {
                break;
            }
            System.out.println(i);
            i++;
            isReady = (i > 0);
        } while (isReady);

        int number = 0;
        while(number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

        System.out.println();
        System.out.println("--------");
        number = 4;
        int countEven = 0;
        while(number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number: " + number);
            if (countEven == 5) {
                break;
            }
        }

        System.out.println("--------");
        int evenCount = 0;
        int oddCount = 0;
        number = 4;
        while(number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number: " + number);
            evenCount ++;
        }
        System.out.println("Total even numbers found: " + evenCount);
        System.out.println("Total odd numbers found: " + oddCount);

        System.out.println("--------");
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while(number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;

        return sum;
    }
    
}