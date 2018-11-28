package eam;

import java.util.function.Consumer;

public class ResourceRefactored {

	public static void execute(Consumer<Resource> c) {
		Resource resource = new Resource();
		try {
			c.accept(resource);
		} finally {
			resource.closeResource();
		}
	}

	public static void main(String[] args) {
		ResourceRefactored.execute( resource -> resource.doSomethingUseful());
		ResourceRefactored.execute( resource -> resource.doSomethingNotSoUseful());
		
		ResourceRefactored.execute( resource -> {
			resource.doSomethingUseful();
			resource.doSomethingNotSoUseful();	
		});
		}

}
