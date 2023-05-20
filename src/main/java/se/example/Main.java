package se.example;


import se.example.classes_11.Floor9;
import se.example.classes_11.Carpet9;
import se.example.classes_11.Calculator9;

/**
 * Classes samples.
 */
public class Main {
    public static void main(String[] args) {
        Carpet9 carpet = new Carpet9(3.5);
        Floor9 floor = new Floor9(2.75, 4.0);
        Calculator9 calculator = new Calculator9(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet9(1.5);
        floor = new Floor9(5.4, 4.5);
        calculator = new Calculator9(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

}