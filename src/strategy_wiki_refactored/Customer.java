package strategy_wiki_refactored;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private List<Double> drinks = new ArrayList<>();

	private BillingStrategy billingStrategy;

	public Customer(BillingStrategy strategy) {
		this.billingStrategy = strategy;
	}

	public void add(double price, int quantity) {
		drinks.add(billingStrategy.applyAsDouble(price * quantity));
	}

	public void printBill() {
		double sum = 0;
		for (Double drink : drinks) {
			sum += drink;
		}
		System.out.println("Total Bill : " + sum);
	}

	public void setStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}
}
