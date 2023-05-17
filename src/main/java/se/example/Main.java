package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Number -1221 is Palindrome " + isPalindrome(-1221));
        System.out.println("Number 707 is Palindrome " + isPalindrome(707));
        System.out.println("Number 11212 is Palindrome " + isPalindrome(11212));
    }


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if (number < 0) {
            number *= -1;
        }
        int number2 = number;
        do {
            reverse *= 10;
            reverse += number2 % 10;
            number2 /= 10;
        } while(number2 > 0);
        if (number == reverse) {
            return true;
        }

        return false;
    }
}