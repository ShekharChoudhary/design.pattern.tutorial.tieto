package eam;

public class NotSoUsefulResource extends AbstractResource {
	
	@Override
	protected  void doSomething() {
		resource.doSomethingNotSoUseful();
	}

}
