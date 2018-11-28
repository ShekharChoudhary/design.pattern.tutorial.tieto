package strategy_wiki_refactor_three;

public class NormalStrategy implements BillingStrategy{

	@Override
	public double getActualPrice(double rawPrice) {
		return rawPrice;
	}
	

}
