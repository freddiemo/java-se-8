package se.example;

import se.example.scanner_console_10.PaintJob5;

/**
 * Inputs console sample
 */
public class Main {
    public static void main(String[] args) {
        /*System.out.println(PaintJob5.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob5.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob5.getBucketCount(3.26, 0.75));*/

        /*System.out.println(PaintJob5.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob5.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(PaintJob5.getBucketCount(7.25, 4.3, 2.35));*/

        System.out.println(PaintJob5.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob5.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob5.getBucketCount(2.75, 3.25, 2.5, 1));
    }

}