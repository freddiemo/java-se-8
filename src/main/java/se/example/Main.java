package se.example;

/**
 * While and do while samples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("-------");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        /*System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(1010));
        System.out.println(getDigitCount(1000));
        System.out.println(getDigitCount(-12));*/

        System.out.println("-------");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int lastDigit = 0;
            int cantDigits = getDigitCount(number);
            number = reverse(number);
            for(int i = 0; i < cantDigits; i++) {
                lastDigit = number % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
                number /= 10;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number *= -1;
        }
        while(number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        if (negative) {
            reverse *= -1;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int countDigits = 0;
        while(number > 0) {
            countDigits++;
            number /= 10;
        }
        return countDigits;
    }

}