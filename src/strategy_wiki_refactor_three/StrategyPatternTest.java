package strategy_wiki_refactor_three;

import java.util.function.Function;

public class StrategyPatternTest {

	public static void main(String[] args) {

		usualStyle();
		functionalStyle();

	}

	private static void functionalStyle() {
		
		CustomerLambda firstCustomer = new CustomerLambda();

		Function<Double, Double> normalStrategy = rawPrice -> rawPrice;
		Function<Double, Double> happyHourStrategy = rawPrice -> rawPrice * 0.5;

		// Normal billing
		firstCustomer.add(1.0, 1, normalStrategy);

		// Start Happy Hour
		// firstCustomer.setStrategy(new HappyHourStrategy());
		firstCustomer.add(1.0, 2, happyHourStrategy);

		// New Customer
		CustomerLambda secondCustomer = new CustomerLambda();
		secondCustomer.add(0.8, 1, happyHourStrategy);
		// The Customer pays
		firstCustomer.printBill();

		// End Happy Hour
		// secondCustomer.setStrategy(new NormalStrategy());
		secondCustomer.add(1.3, 2, normalStrategy);
		secondCustomer.add(2.5, 1, normalStrategy);
		secondCustomer.printBill();

	}

	private static void usualStyle() {
		Customer firstCustomer = new Customer(new NormalStrategy());

		// Normal billing
		firstCustomer.add(1.0, 1);

		// Start Happy Hour
		firstCustomer.setStrategy(new HappyHourStrategy());
		firstCustomer.add(1.0, 2);

		// New Customer
		Customer secondCustomer = new Customer(new HappyHourStrategy());
		secondCustomer.add(0.8, 1);
		// The Customer pays
		firstCustomer.printBill();

		// End Happy Hour
		secondCustomer.setStrategy(new NormalStrategy());
		secondCustomer.add(1.3, 2);
		secondCustomer.add(2.5, 1);
		secondCustomer.printBill();

	}

}
