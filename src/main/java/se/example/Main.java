package se.example;


import se.example.classes_11.Point8;

/**
 * Classes samples.
 */
public class Main {
    public static void main(String[] args) {

        Point8 first = new Point8(6, 5);
        Point8 second = new Point8(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point8 point = new Point8();
        System.out.println("distance()= " + point.distance());
    }

}