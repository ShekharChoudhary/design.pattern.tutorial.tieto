package command_tp_extended_refactored;

import command_tp_refactored.Broker;
import command_tp_refactored.Stock;

//Client
public class CommandPatternDemo {
	public static void main(String[] args) {
		
		//Stock
		Stock abcStock = new Stock();

		Broker broker = new Broker();
		
		broker.takeOrder(() -> abcStock.buy());
		broker.takeOrder(() -> abcStock.sell());

		//Bond
		Bond reliance = new Bond();
		broker.takeOrder(() -> reliance.buyBonds());
		broker.takeOrder(() -> reliance.sellBonds());

		
		broker.placeOrders();
	}
}
