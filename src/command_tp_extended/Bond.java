package command_tp_extended;

public class Bond {
	
	private String name = " Reliance";
	private int quantity = 1000;
	
	
	public void buyBonds(){
		System.out.println("Issuing "+ quantity +" bonds to user");
	}
	
	public void sellBonds(){
		System.out.println("Selling "+ quantity + name + " bonds ");
	}

}
