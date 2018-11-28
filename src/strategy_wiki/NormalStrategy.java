package strategy_wiki;

public class NormalStrategy implements BillingStrategy{

	@Override
	public double getActualPrice(double rawPrice) {
		return rawPrice;
	}
	

}
