package decorator_original;

public class TextImpl {
	public static void main(String args[]) {
		
		Text t = new BaseText();
		t = new AllCaps(t);
		t = new StringConcat(t);
		t = new ReplaceThisWithThat(t);

		// Text t1 = new ReplaceThisWithThat(new StringConcat(new AllCaps(new
		// BaseText())));
		System.out.println(t.format("this is some random text"));
	}
}
