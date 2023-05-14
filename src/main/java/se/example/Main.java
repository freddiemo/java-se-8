package se.example;

/**
 * Primitive Types sample
 */
public class Main {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMinIntValue);
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        // short firstShort = 1, int firstInteger = 2;
        // byte firstByte = 1, byte secondByte = 2;
        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        long myLong = 50000L + (myByte + myShort + myInt) * 10;
        System.out.println(myLong);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}