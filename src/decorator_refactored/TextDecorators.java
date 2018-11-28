package decorator_refactored;

public class TextDecorators {

	public static String allCaps(String s) {
		return s.toUpperCase();
	}

	public static String concat(String input) {
		return input.concat("this is some random text");
	}

	public static String thisWithWhat(String input) {
		return input.replaceAll("this", "that");
	}

}
