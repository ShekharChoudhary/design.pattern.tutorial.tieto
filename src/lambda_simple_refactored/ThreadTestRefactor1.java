package lambda_simple_refactored;

public class ThreadTestRefactor1 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("This is a long running operation..."));

		t.start();
	}
}
