package alljava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Mapmap {
	public static void main(String[] args)
	{
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee("Mohan","IT",2000));
		list.add(new Employee("ram","IT",2200));
		list.add(new Employee("rm","CSE",3300));
		list.add(new Employee("am","CSE",3100));
		list.add(new Employee("am","CIVIL",4000));
		list.add(new Employee("am","CIVIL",3300));
		//list.stream().colect(Collectors.groupingBy(e-.e.getDep(),Collectors.collecting))
		
		List<String>namelist=list.stream().filter(e->e.getSalary()<3000).map(e->e.getName()).collect(Collectors.toList());
		
		namelist.forEach(System.out::println);
		
		//list.stream().collect(Collectors.groupingBy(e->e.getDep(),Collect.collectAndthen))
		
		//Map<String, Employee> toemployee=
			//    list.stream()
			  //              .collect(groupingBy(
			    //                e -> e.department,
			      //              collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get) 
			        //        ));
	//}

	//private static Object comparingInt(Object object) {
		// TODO Auto-generated method stub
		//return null;
	//}
		//Map<String,Employee>highsalary=list.stream().map(e->e.getDep().collect(Collectors.toList());
	}
}