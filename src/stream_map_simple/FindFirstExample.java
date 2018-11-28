package stream_map_simple;

import java.util.Arrays;
import java.util.List;

public class FindFirstExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(13,33,10,45,60,75);
		
		//Typical
		for(Integer number : numbers){
			if(number % 2 ==0){
				System.out.println(number);
				break;
			}
		}
		
		//Java 8
		System.out.println(numbers.stream()
								  .filter(number -> number % 2 == 0)
								  .findFirst()
						  );
	}

}
