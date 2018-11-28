package decorator_refactored;

import java.util.function.Function;

public class BaseText implements Function<String,String>{
	
	public BaseText(){
	}
 
	@Override
	public String apply(String t) {	
		return t;
	}
}
