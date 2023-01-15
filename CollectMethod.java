package alljava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

		 
	    public static void main(String a[]) {
	 
	        List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertainment", 12500));
	 
	        // find employees whose salaries are above 10000
	        List<Employee> filteredList = empList.stream()
	                                            .filter(emp->emp.getSalary() > 10000)
	                                            .collect(Collectors.toList());
	 
	        filteredList.forEach(System.out::println);
	    }
	}


