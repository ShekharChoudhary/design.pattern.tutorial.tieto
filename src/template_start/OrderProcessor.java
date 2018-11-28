package template_start;

public abstract class OrderProcessor {
	
	public void placeOrder(Long customerId, Long orderId){
		//1.Get customer details
		Customer c = getCustomer();
		
		//2, Checkinventory
		int itemId = checkInventory(orderId);
		
		//3.Ship, can be normal or prime
		shipOrder(itemId);
		
	}
	
	protected abstract void shipOrder(int itemId);
	
	private Customer getCustomer(){
		return new Customer();
	}
	
	
	private int checkInventory(Long orderId){
		System.out.println("Yes, exists...");
		return 1234;
	}

}
