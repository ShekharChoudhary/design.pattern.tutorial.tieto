package lambda_simple_refactored;

public class ThreadTestRefactor3 {

	public static void main(String[] args) {

		ThreadTask threadTask = new ThreadTask();

		// Method reference.
		Runnable r = threadTask::doSomeOp;
		Thread t = new Thread(r);

		t.start();
	}

}
