package lambda_simple;

public class ThreadTest {

	public static void main(String[] args) {

		ThreadTask threadTask = new ThreadTask();
		
		Thread t = new Thread(threadTask);
		

		t.start();
	}

}
