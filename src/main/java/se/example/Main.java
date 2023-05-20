package se.example;


import se.example.classes_11.Wall7;

/**
 * Classes samples.
 */
public class Main {
    public static void main(String[] args) {

        Wall7 wall = new Wall7(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}