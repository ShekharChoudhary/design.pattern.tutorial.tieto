package lambda_simple_refactored;

public class ThreadTestRefactor2 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> doSomeOp());

		t.start();
	}
	
	
	public static void doSomeOp(){
		System.out.println("This is a long running operation...");
	}
}
