package template_refactored;

public class OrderProcessorRefactoredTest {

	public static void main(String args[]) {
		OrderProcessorRefactored orderProcessor = new OrderProcessorRefactored();
		orderProcessor.shipOrder(1L, 2L, itemId -> System.out.println("Shipping order " + itemId + " in 1 week...."));
		
		
		OrderProcessorRefactored orderProcessorPrime = new OrderProcessorRefactored();
		orderProcessorPrime.shipOrder(1L, 2L,itemId -> System.out.println("Shipping order " + itemId + "  in 2 days...."));
		
	}

}
