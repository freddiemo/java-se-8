package se.example;

/**
 * Primitive Types sample
 * In Java the default type for integers is int.
 * The default type for floating numbers is double.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double Value Range( " + Double.MIN_VALUE + " to " + Float.MAX_VALUE);
        int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);
        myFloatValue = 5f;
        System.out.println("myFloatValue " + myFloatValue);
        myDoubleValue = 5d;
        System.out.println("myDoubleValue " + myDoubleValue);
        // float myOtherFloatValue = 5.25;
        float myOtherFloatValue = (float) 5.25; //not recommended
        System.out.println("myOtherValue " + myOtherFloatValue);
        myOtherFloatValue = 5.25f;
        System.out.println("myOtherValue " + myOtherFloatValue);
        myIntValue = 5 / 2;
        System.out.println(myIntValue);
        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);
        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);
        myIntValue = 5 / 3;
        System.out.println(myIntValue);
        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);
        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);
        myDoubleValue = 5.00 / 3.00;
        System.out.println(myDoubleValue);
        myDoubleValue = 5.00 / 3;
        System.out.println(myDoubleValue);
        // myFloatValue = 5.00 / 3f;
        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("Converted kilograms = " + kilograms);
        double pi = 3.1415927d;
        System.out.println(pi);
    }
}