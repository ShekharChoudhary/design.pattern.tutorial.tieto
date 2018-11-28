package chaining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionalChaining {

	public static void main(String[] args) 
	{

		Function<Double, Double> func1 = d -> d + 0.2;
		Function<Double, Double> func2 = d -> d + 0.5;

		// Simple chaining
		System.out.println(func1.andThen(func2).apply(1.5));

		// Chaining using Stream.of
		//Function::andThen - function composition
		Function<Double, Double> combined = Stream.of(func1, func2)
				                                  .reduce(Function.identity(), Function::andThen);
		System.out.println(combined.apply(1.5));

		// Pass it to a variable function which can accept variable number of functions.
		System.out.println(combineFunctions(func1, func2));
		
		System.out.println("Printing sum...."+printSum());

	}

	private static Double combineFunctions(Function<Double, Double>... combineFunctions) 
	{
		Function<Double, Double> chainedFunction = Stream.of(combineFunctions)
				                                         .reduce(function -> function,Function::andThen);
		return chainedFunction.apply(1.5);
	}
	
	
	private static Integer printSum() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Represents 2 things :
		// 1. identity - starting value and default if no elements in list
		// 2. Accumalator - what do you want to do

		return list.stream().reduce(0, (a, b) -> (a + b));

	}

}
