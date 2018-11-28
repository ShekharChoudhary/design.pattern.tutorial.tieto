package command_tp_extended;

//Receiver
public class Stock {

	private String name = "APPLE";
	private int quantity = 10;

	public void buy(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	   }

	public void sell(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	   }
}
