package se.example;

import se.example.classes_11.ComplexNumber10;

/**
 * Classes samples.
 */
public class Main {
    public static void main(String[] args) {
        ComplexNumber10 one = new ComplexNumber10(1.0, 1.0);
        ComplexNumber10 number = new ComplexNumber10(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

}