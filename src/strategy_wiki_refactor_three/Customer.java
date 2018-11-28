package strategy_wiki_refactor_three;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Double> drinks = new ArrayList<>();
	
	private BillingStrategy billingStrategy;
	
	public Customer(BillingStrategy billingStrategy){
		this.billingStrategy=billingStrategy;
	}
	
	public void add(double price, int quantity){
		drinks.add(billingStrategy.getActualPrice(price * quantity));
	}

	public void printBill(){
		double sum = 0;
		for(Double drink: drinks){
			sum+=drink;
		}
		System.out.println("Total Bill : "+sum);
	}
	
	public void setStrategy(BillingStrategy billingStrategy){
		this.billingStrategy=billingStrategy;
	}
}
