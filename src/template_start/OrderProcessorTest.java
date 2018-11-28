package template_start;

public class OrderProcessorTest {

	public static void main(String args[]) {
		OrderProcessor orderProcessor = new NormalOrderProcessor();
		orderProcessor.placeOrder(1L, 2L);
		
		
		OrderProcessor primeOrderProcessor = new PrimeOrderProcessor();
		primeOrderProcessor.placeOrder(1L, 2L);
		
	}

}
