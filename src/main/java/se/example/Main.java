package se.example;

import se.example.inheritance_12.Student2;
import se.example.inheritance_12.PrimarySchoolStudent2;

/**
 * Inheritance samples.
 */
public class Main extends Object {
    public static void main(String[] args) {
        Student2 max = new Student2("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent2 jimmy = new PrimarySchoolStudent2("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }

}
