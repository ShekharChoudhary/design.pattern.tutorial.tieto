package eam;

public abstract class AbstractResource {

	protected Resource resource;

	private void openResource() {
		resource = new Resource();
	}

	private void closeResource() {
		System.out.println("Closing resource..");
	}

	protected abstract void doSomething();

	public void execute() {
		openResource();
		try {
			doSomething();
		} finally {
			closeResource();
		}
	}

	public static void main(String[] args) {
		new UsefulResource().execute();
	}

}
