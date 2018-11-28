package command_tp_extended;

//Concrete Command
public class SellBond implements Order {
	
	private Bond bond;

	public SellBond(Bond bond) {
		this.bond=bond;
	}

	public void execute() {
		bond.sellBonds();
	}
}
