package se.example;

/**
 * Primitive Types sample
 * In Java the default type for integers is int.
 * The default type for floating numbers is double.
 * A char occupies two bytes of memory, 16 bits.
 */
public class Main {
    public static void main(String[] args) {
        char myChar = 'D';
        System.out.println("myChar " + myChar);
        // char myChar = 'DD';
        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        char myDecimalCode = 68;
        System.out.println(myDecimalCode);
        char mySimpleChar = '?', myUnicodeChar = '\u003F', myDecimalChar = 63;
        System.out.println("My values are " + mySimpleChar +":" + myUnicodeChar + ":" + myDecimalChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println("myTrueBooleanValue " + myTrueBooleanValue);
        System.out.println("myFalseBooleanValue " + myFalseBooleanValue);
        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);
    }
}