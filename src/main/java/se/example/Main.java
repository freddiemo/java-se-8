package se.example;

/**
 * Primitive Types sample
 */
public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        System.out.println(myValue);
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer minimum value: " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer maximum value: " + myMaxIntValue);
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); // overflow wraparound
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); // underflow wraparound
        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
    }
}