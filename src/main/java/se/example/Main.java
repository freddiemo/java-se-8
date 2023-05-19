package se.example;

import se.example.classes_11.SimpleCalculator3;

/**
 * Classes sample
 */
public class Main {
    public static void main(String[] args) {
        SimpleCalculator3 calculator = new SimpleCalculator3();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}