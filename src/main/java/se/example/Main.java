package se.example;

/**
 * Primitive Types sample
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("A Byte has a width of " + Byte.SIZE);
        System.out.println("Byte Value Range ( " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("A Short has a width of " + Short.SIZE);
        System.out.println("Short Value Range ( " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("A Integer has a width of " + Integer.SIZE);
        System.out.println("Integer Value Range ( " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("A long has a width of " + Long.SIZE);
        System.out.println("Long Value Range ( " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        long myLongValue = 100l;
        System.out.println(myLongValue);
        // myLongValue = 2_147_483_647_234;
        myLongValue = 2_147_483_647_234L;
        System.out.println(myLongValue);

    }
}