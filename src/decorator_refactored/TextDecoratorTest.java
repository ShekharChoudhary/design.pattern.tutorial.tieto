package decorator_refactored;

public class TextDecoratorTest {
	
	public static void main(String[] args) {
		String finalString = new BaseText()
							 .andThen(TextDecorators::allCaps)
							 .andThen(TextDecorators::concat)
							 .andThen(TextDecorators::thisWithWhat)
							 .apply("this is some random text");
		
		System.out.println(finalString);
	}
}
