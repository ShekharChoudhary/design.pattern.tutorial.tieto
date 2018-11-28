package stream_map_simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStreamExample {

	public static void main(String[] args) {

		List<Employee> employees = initialize();
		
		
		//Typical
		List<String> employeeNames = new ArrayList<>();
		for(Employee employee : employees){
			if(employee.getAge() > 35){
				employeeNames.add(employee.getName());
			}
		}
		
		System.out.println(employeeNames);
		
		//Java 8
		List<String> eNames = employees.stream()
		         						.filter(emp -> emp.getAge() > 35)
		         						.map(emp -> emp.getName())
		         						.collect(Collectors.toList());
		System.out.println(eNames);

	}
	
	private static boolean ageGreaterThan35(Employee employee){
		return employee.getAge() > 35;
	}

	private static List<Employee> initialize() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Aj", 21));
		employees.add(new Employee("Jim", 31));
		employees.add(new Employee("Tim", 41));
		employees.add(new Employee("Kim", 51));
		return employees;

	}

}
