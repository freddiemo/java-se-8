package se.example.scanner_console_10;

import java.util.Scanner;

public class ScannerConsole {

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Wha'ts your Name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for tanking the course!");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException e) {
                System.out.println("Characters not allowed!!! Try again.");
            }

        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimunYear = currentYear - 125;
        if ((dob < minimunYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

}
