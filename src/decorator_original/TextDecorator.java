package decorator_original;

public abstract class TextDecorator implements Text {

	Text text;

	public TextDecorator(Text text) {
		this.text = text;
	}

	public abstract String format(String s);
}
