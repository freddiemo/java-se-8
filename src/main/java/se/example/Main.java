package se.example;

import se.example.strings_13.Strings;
import se.example.strings_13.StringManipulationMethods;

/**
 * Strings samples.
 */
public class Main extends Object {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + StringManipulationMethods.substring(birthDate, startingIndex));

        System.out.println("Birth month = " + StringManipulationMethods.substring(birthDate, 3, 5));

        String newDate = StringManipulationMethods.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = StringManipulationMethods.concat(newDate, "/");
        newDate = StringManipulationMethods.concat(newDate, "11/1982");
        System.out.println("newDate " + newDate);

        newDate = "25" + "/" + "11/1982";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(StringManipulationMethods.replace(newDate, '/', '-'));

        System.out.println(StringManipulationMethods.replace(newDate, "2", "00"));

        System.out.println(StringManipulationMethods.replaceFirst(newDate, "/", "-"));

        System.out.println(StringManipulationMethods.replaceAll(newDate, "/", "---"));

    }

}
