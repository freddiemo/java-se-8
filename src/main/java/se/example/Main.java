package se.example;

/**
 * Switch samples.
 */
public class Main {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        String month = "October";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        System.out.println(getQuarter("a"));

        System.out.println(natoAlphabet('A'));
        System.out.println(natoAlphabet('-'));

        printDayOfWeek(1);
        printDayOfWeek(8);

        printNumberInWord(1);
        printNumberInWord(100);

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static String getQuarter(String month) {
        String quarter = "";
        switch (month) {
            case "January": case "February": case "March":
                quarter = "1st";
                break;
            case "April": case "May": case "June":
                quarter = "2nd";
                break;
            case "July": case "August": case "September":
                quarter = "3rd";
                break;
            case "October": case "November": case "December":
                quarter = "4th";
                break;
            default:
                quarter = "Invalid month";
                break;
        }

        return quarter;
    }

    public static String natoAlphabet(char letter) {
        String natoString = "";
        switch(letter) {
            case 'A':
                natoString = "A is Able";
                break;
            case 'B':
                natoString = "B is Baker";
                break;
            case 'C':
                natoString = "C is Charlie";
                break;
            case 'D':
                natoString = "D is Dog";
                break;
            case 'E':
                natoString = "E is Easy";
                break;
            case 'F':
                natoString = "F is Fox";
                break;
            case 'G':
                natoString = "G is George";
                break;
            case 'H':
                natoString = "H is How";
                break;
            case 'I':
                natoString = "I is Item";
                break;
            case 'J':
                natoString = "J is Jig";
                break;
            case 'K':
                natoString = "K is King";
                break;
            case 'L':
                natoString = "L is Love";
                break;
            case 'M':
                natoString = "M is Mike";
                break;
            case 'N':
                natoString = "N is Nan";
                break;
            case 'O':
                natoString = "O is Oboe";
                break;
            case 'P':
                natoString = "P is Peter";
                break;
            case 'Q':
                natoString = "Q is Queen";
                break;
            case 'R':
                natoString = "R is Roger";
                break;
            case 'S':
                natoString = "S is Sugar";
                break;
            case 'T':
                natoString = "T is Tare";
                break;
            case 'U':
                natoString = "U is Uncle";
                break;
            case 'V':
                natoString = "V is Victor";
                break;
            case 'W':
                natoString = "W is William";
                break;
            case 'X':
                natoString = "X is X-ray";
                break;
            case 'Y':
                natoString = "Y is Yoke";
                break;
            case 'Z':
                natoString = "Z is Zebra";
                break;
            default:
                natoString = "Not found";
                break;
        }
        return natoString;
    }

    public static void printDayOfWeek(int day) {
        String stringDay;
        switch(day) {
            case 0:
                stringDay = "Sunday";
                break;
            case 1:
                stringDay = "Monday";
                break;
            case 2:
                stringDay = "Tuesday";
                break;
            case 3:
                stringDay = "Wednesday";
                break;
            case 4:
                stringDay = "Thursday";
                break;
            case 5:
                stringDay = "Friday";
                break;
            case 6:
                stringDay = "Saturday";
                break;
            default:
                stringDay = "Invalid day";
                break;
        }
        System.out.println(day + " stands for " + stringDay);
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
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
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year >= 1 && year < 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysMonth = 0;
        if (year < 1 || year > 9999) {
            return daysMonth = -1;
        }
        switch (month) {
            case 1:
                daysMonth = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    daysMonth = 29;
                } else {
                    daysMonth = 28;
                }
                break;
            case 3:
                daysMonth = 31;
                break;
            case 4:
                daysMonth = 30;
                break;
            case 5:
                daysMonth = 31;
                break;
            case 6:
                daysMonth = 30;
                break;
            case 7:
                daysMonth = 31;
                break;
            case 8:
                daysMonth = 31;
                break;
            case 9:
                daysMonth = 30;
                break;
            case 10:
                daysMonth = 31;
                break;
            case 11:
                daysMonth = 30;
                break;
            case 12:
                daysMonth = 31;
                break;
            default:
                daysMonth = -1;
                break;
        }

        return daysMonth;
    }
}