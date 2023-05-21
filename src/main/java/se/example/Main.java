package se.example;

import se.example.strings_13.Strings;

/**
 * Strings samples.
 */
public class Main extends Object {
    public static void main(String[] args) {

        // Strings.stringFormatting();
        Strings.printInformation("Hello World");
        Strings.printInformation("");
        Strings.printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", Strings.getIndex(helloWorld, 'r'));
        System.out.printf("index of World = %d %n", Strings.getIndex(helloWorld, "World"));

        System.out.printf("index of l = %d %n", Strings.getIndex(helloWorld, 'l'));
        System.out.printf("index of l = %d %n", Strings.getLastIndex(helloWorld, 'l'));

        System.out.printf("index of l = %d %n", Strings.getIndex(helloWorld, 'l', 3));
        System.out.printf("index of l = %d %n", Strings.getLastIndex(helloWorld, 'l', 8));

        String lowerCased = Strings.toLowerCase(helloWorld);
        Strings.equals(helloWorld, lowerCased);
        
        Strings.equalsIgnoreCase(helloWorld, lowerCased);

        Strings.startsWith(helloWorld, "Hello");

        Strings.endsWith(helloWorld, "World");

        Strings.contains(helloWorld, "World");

        Strings.contentEquals(helloWorld, "Hello World");
    }

}
