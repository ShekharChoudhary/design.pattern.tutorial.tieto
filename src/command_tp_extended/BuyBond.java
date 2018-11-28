package command_tp_extended;

//Concrete Command
public class BuyBond implements Order {
	
	private Bond bond;

	public BuyBond(Bond bond) {
		this.bond=bond;
	}

	public void execute() {
		bond.buyBonds();
	}
}
