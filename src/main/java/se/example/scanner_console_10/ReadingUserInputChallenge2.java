package se.example.scanner_console_10;

import java.util.Scanner;

public class ReadingUserInputChallenge2 {

    // ReadingUserInputChallenge2.sumInputNumbers();
    public static void sumInputNumbers() {
        // int sum = 0;
        double sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        while(counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            try {
                // int number = Integer.parseInt(scanner.nextLine());
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
                counter++;
            } catch(NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);
    }

}
