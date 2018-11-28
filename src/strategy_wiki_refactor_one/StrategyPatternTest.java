package strategy_wiki_refactor_one;

import java.util.function.Function;

public class StrategyPatternTest {

	public static void main(String[] args) {
	
		
		Function<Double, Double> normalStrategy =  (Double d) -> d;
		Function<Double, Double> happyHourStrategy =  (Double d) -> d * 0.5;
		
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
