package command_tp_extended_refactored;

import java.util.ArrayList;
import java.util.List;

//Invoker.
public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		orderList.forEach(order -> order.execute());
		orderList.clear();
	}
}
