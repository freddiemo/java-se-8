package se.example.strings_13;

public class Strings {

    /* String comparison methods */

    public static void contentEquals(String string, String compareTo) {
        if(string.contentEquals(compareTo)) {
            System.out.println("Values match exactly");
        }
    }

    public static void contains(String string, String substring) {
        if(string.contains(substring)) { 
            System.out.println("String contains '" + substring + "\'");
        }
    }

    public static void endsWith(String string, String substring) {
        if(string.endsWith(substring)) {
            System.out.println("String ends with \'" + substring + "\'");
        }
    }

    public static void startsWith(String string, String substring) {
        if(string.startsWith(substring)) {
            System.out.println("String starts with \'" + substring + "\'");
        }
    }

    public static void equalsIgnoreCase(String string, String compareTo) {
        if(string.equalsIgnoreCase(compareTo)) {
            System.out.println("Values match ignoring case");
        } 
    }

    public static void equals(String string, String compareTo) {
        if(string.equals(compareTo)) {
            System.out.println("Values match exactly");
        } 
    }

    public static String toLowerCase(String string) {
        return string.toLowerCase();
    }



    /* String inspection methods */

    public static int getLastIndex(String string, char character) {
        return string.lastIndexOf(character);
    }

    public static int getLastIndex(String string, char character, int match) {
        return string.lastIndexOf(character, match);
    }


    public static int getIndex(String string, char character) {
        return string.indexOf(character);
    }

    public static int getIndex(String string, char character, int match) {
        return string.indexOf(character, match);
    }

    public static int getIndex(String string, String characters) {
        return string.indexOf(characters);
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("First char = %c %n", string.charAt(length - 1));

    }

	public static void stringFormatting() {
		String bulletIt = "Print a Bulleted List:\n" +
            "\t\u2022 First Point\n" +
            "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        /*String textBlock = """ // since java 15
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";
        System.out.println(textBlock);*/

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        /*formattedString = "Your age is %d".formatted(age);  // since java 15
        System.out.println(formattedString);*/
	}

}