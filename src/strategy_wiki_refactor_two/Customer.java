package strategy_wiki_refactor_two;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Customer {
	
	private List<Double> drinks = new ArrayList<>();
	
	private Function<Double, Double> billingStrategy;
	
	
	public Customer(Function<Double, Double> billingStrategy){
		this.billingStrategy=billingStrategy;
	}
	
	public void add(double price, int quantity){
		drinks.add(billingStrategy.apply(price * quantity));
	}

	public void printBill(){
		double sum = 0;
		for(Double drink: drinks){
			sum+=drink;
		}
		System.out.println("Total Bill : "+sum);
	}
	
	public void setStrategy(Function<Double, Double> billingStrategy){
		this.billingStrategy=billingStrategy;
	}
}
