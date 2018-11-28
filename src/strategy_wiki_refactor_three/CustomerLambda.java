package strategy_wiki_refactor_three;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CustomerLambda {
	
	private List<Double> drinks = new ArrayList<>();
	
	private Function<Double,Double> billingStrategy;
	
	//public CustomerLambda(BillingStrategy billingStrategy){
		//this.billingStrategy=billingStrategy;
	//}
	
	public void add(double price, int quantity, Function<Double,Double> strategy){
		drinks.add(strategy.apply(price * quantity));
	}

	public void printBill(){
		double sum = 0;
		for(Double drink: drinks){
			sum+=drink;
		}
		System.out.println("Total Bill : "+sum);
	}
	
	public void setStrategy(Function<Double,Double> billingStrategy){
		this.billingStrategy=billingStrategy;
	}
}
