package template_start;

public class PrimeOrderProcessor extends OrderProcessor {

	@Override
	protected void shipOrder(int itemId) {
		System.out.println("Shipping order " + itemId + "  in 2 days....");

	}

}
