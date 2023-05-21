package se.example.strings_13;

public class StringBuilder4 {

	// builderPlus.deleteCharAt(16).insert(16, 'g');
	public static void setLength(StringBuilder stringBuilder, int length) {
		stringBuilder.setLength(length);
	}

	public static void reverse(StringBuilder stringBuilder) {
		stringBuilder.reverse();
	} 

	public static void replace(StringBuilder stringBuilder, int start, int end, String str) {
		stringBuilder.replace(start, end, str);
	}

	// builderPlus.deleteCharAt(16).insert(16, 'g');
	public static void insert(StringBuilder stringBuilder, int offset, char character) {
		stringBuilder.insert(offset, character);
	}

	public static void deleteCharAt(StringBuilder stringBuilder, int index) {
		stringBuilder.deleteCharAt(index);
	}

	public static void append(StringBuilder builder, String string) {
		builder.append(string);
	}


	public static void printInformation(StringBuilder builder) {
		System.out.println("String = " + builder);
		System.out.println("length = " + builder.length());
		System.out.println("capacity = " + builder.capacity());
	}

}