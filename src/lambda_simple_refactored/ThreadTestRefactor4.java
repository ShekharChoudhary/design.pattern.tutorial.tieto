package lambda_simple_refactored;

public class ThreadTestRefactor4 {

	public static void main(String[] args) {

		// Method reference.
		Runnable r = ThreadTaskStatic::doSomeOp;
		Thread t = new Thread(r);

		t.start();
	}

}
