package se.example.strings_13;

public class StringManipulationMethods {

	public static String replaceAll(String string, String regex, String replacement) {
		return string.replaceAll(regex, replacement);
	}

	public static String replaceFirst(String string, String regex, String replacement) {
		return string.replaceFirst(regex, replacement);
	}

	public static String replace(String string, String oldString, String newString) {
		return string.replace(oldString, newString);
	}

	public static String replace(String string, char oldChar, char newChar) {
		return string.replace(oldChar, newChar);
	}

	public static String concat(String string, String substring){
		return string.concat(substring); // "25".concat("/").concat("11").concat("/").concat("1982");
	}

	public static String join(String delimiter, String substring1, String substring2, String substring3) {
		return String.join(delimiter, substring1, substring2, substring3);
	}

	public static String substring(String string, int startingIndex, int endIndex) {
		return string.substring(startingIndex, endIndex);
	}

	public static String substring(String string, int startingIndex) {
		return string.substring(startingIndex);
	}

}