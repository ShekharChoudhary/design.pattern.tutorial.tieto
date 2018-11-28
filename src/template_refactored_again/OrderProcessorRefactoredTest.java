package template_refactored_again;

public class OrderProcessorRefactoredTest {

	public static void main(String args[]) {
		OrderProcessorRefactored orderProcessor = new OrderProcessorRefactored();
		orderProcessor.shipOrder(1L, 2L, orderProcessor::shipNormalOrder);
		
		
		OrderProcessorRefactored orderProcessorPrime = new OrderProcessorRefactored();
		orderProcessorPrime.shipOrder(1L, 2L, orderProcessor::shipPrimeOrder);
		
	}

}
