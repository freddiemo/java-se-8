package se.example.scanner_console_10;

import java.util.Scanner;

/*
* You'll be using an endless loop which:
Prompts the user to enter a number, or any character to quit.
Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
If the user-entered data is not a number, quit the loop.
Keep track of the minimum number entered.
Keep track of the maximum number entered.
If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.
* */
public class MinMaxChallenge3 {

    public static void minMax() {
        boolean exit = false;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int counter = 0;
        while(!exit) {
            System.out.println("Enter a number or any character to exit:");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (counter == 0 || number < min) {
                    min = number;
                }
                if (counter == 0 || number > max) {
                    max = number;
                }
                counter++;
            } catch (NumberFormatException e) {
                exit = true;
            }
        }
        if (counter > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
