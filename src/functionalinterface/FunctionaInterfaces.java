package functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionaInterfaces {
	
	public static void main(String[] args) {
		
		
		//Runnable - Takes nothing and returns void.
		Runnable r =  () -> runnable();
		r.run();
		
		
		//Consumer - Takes a parameter and returns nothing.
		//Can use method reference here.
		Consumer<String> c = (String s ) -> printMe(s);
		c.accept("Ajay");
		
		//Function - 2 arguements, one is input and then the 2nd is the output.
		Function<String,String> function = FunctionaInterfaces::functionCall;
		System.out.println(function.apply("Ajay"));
		
		//Supplier -Takes no params and returns an object.
		Supplier<String> s= () -> supplyMeAString(); 
		System.out.println("Supplied string : "+ s.get());
		
	}
	
	
	
	//Runnable
	public static void runnable(){
		System.out.println("Runnable...");
	}
	
	
	//Consumer.
	public static void printMe(String param){
		System.out.println("Consumer example : "+param);
	} 
	
	//Function.
	public static String functionCall(String name){
		return name + " Iyengar";
	}
	
	//Supplier
	public static String supplyMeAString(){
		return "Ajay Iyengar";
	}

}
