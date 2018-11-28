package strategy_wiki_refactor_three;

public class HappyHourStrategy implements BillingStrategy{

	@Override
	public double getActualPrice(double rawPrice) {
		return rawPrice * 0.5;
	}
	

}
