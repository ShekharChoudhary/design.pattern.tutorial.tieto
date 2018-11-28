package template_refactored;

import java.util.function.Consumer;

import template_start.Customer;

public class OrderProcessorRefactored {

	public void shipOrder(Long customerId, Long orderId, Consumer<Integer> consumer) {
		// 1.Get customer details
		Customer c = getCustomer();

		// 2, Checkinventory
		int itemId = checkInventory(orderId);

		// 3.Ship, can be normal or prime
		consumer.accept(itemId);

	}

	private Customer getCustomer() {
		return new Customer();
	}

	private int checkInventory(Long orderId) {
		System.out.println("Yes, exists...");
		return 1234;
	}

}
