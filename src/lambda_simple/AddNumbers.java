package lambda_simple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Example to only understand the concept.
public class AddNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// 2
		for (Integer i : numbers) {
			System.out.println(i);
		}

		// 3
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		//4 Declarative !
		numbers.forEach(number -> System.out.println(number));
		
		//5.Method reference - Declarative !
		
		//forEach takes a Consumer which takes a type T and returns void. 
		//System is a class, out is an object, println is a method does matches the signature of the accept method in Consumer.
		//Note we are passing a function to a function - higher order function
		numbers.forEach(System.out::println);
		
	}

}
