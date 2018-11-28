package command_tp_extended;


//Client
public class CommandPatternDemo {
	public static void main(String[] args) {
		
		//Stock
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		
		
		//Bonds
		Bond reliance = new Bond();

		BuyBond buyRelianceBond = new BuyBond(reliance);
		SellBond sellRelianceBond = new SellBond(reliance);


		//Same broker
		broker.takeOrder(buyRelianceBond);
		broker.takeOrder(sellRelianceBond);
		
		broker.placeOrders();
	}
}
