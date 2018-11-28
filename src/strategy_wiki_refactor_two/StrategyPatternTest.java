package strategy_wiki_refactor_two;

import java.util.function.Function;

public class StrategyPatternTest {

	public static void main(String[] args) {

		Function<Double, Double> normalStrategy = BillingStrategy::getNormalStrategy;
		Function<Double, Double> happyHourStrategy = BillingStrategy::getHappyHourStrategy;

		Customer firstCustomer = new Customer(normalStrategy);

		// Normal billing
		firstCustomer.add(1.0, 1);

		// Start Happy Hour
		firstCustomer.setStrategy(happyHourStrategy);
		firstCustomer.add(1.0, 2);

		// New Customer
		Customer secondCustomer = new Customer(happyHourStrategy);
		secondCustomer.add(0.8, 1);
		// The Customer pays
		firstCustomer.printBill();

		// End Happy Hour
		secondCustomer.setStrategy(normalStrategy);
		secondCustomer.add(1.3, 2);
		secondCustomer.add(2.5, 1);
		secondCustomer.printBill();

	}

}
