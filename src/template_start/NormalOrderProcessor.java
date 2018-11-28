package template_start;

public class NormalOrderProcessor extends OrderProcessor{

	@Override
	protected void shipOrder(int itemId) {
		System.out.println("Shipping order " + itemId + " in 1 week....");
		
	}
	
	

}
