package eam;

public class Resource {

	public Resource() {
		System.out.println("Opening resource..");
	}

	public void doSomethingUseful() {
		System.out.println("Doing something useful..");
		throw new RuntimeException();
	}

	public void doSomethingNotSoUseful() {
		System.out.println("Doing something less useful..");

	}

	public void closeResource() {
		System.out.println("Closing resource..");
	}

	public static void main(String[] args) {
		Resource resource = new Resource();
		resource.doSomethingUseful();
		resource.doSomethingNotSoUseful();
		resource.closeResource();
	}

}
