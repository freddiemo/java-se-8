package se.example;

import se.example.strings_13.StringBuilder4;

/**
 * Strings samples.
 */
public class Main extends Object {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";

        StringBuilder hellowWorldBuilder = new StringBuilder("Hello" + " World");

        printInformation(helloWorld);
        StringBuilder4.printInformation(hellowWorldBuilder);

        StringBuilder4.append(hellowWorldBuilder, " and Goodbye");
        StringBuilder4.printInformation(hellowWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);
        StringBuilder4.printInformation(emptyStart);
        StringBuilder4.printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        StringBuilder4.append(builderPlus, " and Goodbye");
        // builderPlus.deleteCharAt(16).insert(16, 'g');
        StringBuilder4.deleteCharAt(builderPlus, 16);
        StringBuilder4.insert(builderPlus, 16, 'g');
        System.out.println(builderPlus);

        StringBuilder4.replace(builderPlus, 16, 17, "G");
        System.out.println(builderPlus);

        StringBuilder4.reverse(builderPlus);
        StringBuilder4.setLength(builderPlus, 7);
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

}

