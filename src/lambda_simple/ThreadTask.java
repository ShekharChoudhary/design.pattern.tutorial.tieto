package lambda_simple;

public class ThreadTask implements Runnable{

	@Override
	public void run() {
		doSomeOp();
		
	}

	public void doSomeOp(){
		System.out.println("This is a long running operation...");
	}
}
