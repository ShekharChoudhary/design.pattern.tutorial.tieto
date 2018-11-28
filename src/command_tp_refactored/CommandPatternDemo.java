package command_tp_refactored;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		Broker broker = new Broker();
		broker.takeOrder(() -> abcStock.buy());
		broker.takeOrder(() -> abcStock.sell());

		broker.placeOrders();
	}
}
