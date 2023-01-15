package EmployeeSortings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployee {
	public static void main(String[] args)
	{
		List<Employee>employee=new ArrayList<Employee>();
		employee.add(new Employee(100,"ram",2000,"IT",25));
		employee.add(new Employee(101,"abhi",2200,"IT",24));
		employee.add(new Employee(104,"tharun",2000,"IT",25));
		employee.add(new Employee(107,"shiva",3900,"CSE",26));
		employee.add(new Employee(109,"ram",3300,"CSE",28));
		employee.add(new Employee(101,"ss",2700,"ECE",27));
		employee.add(new Employee(101,"charan",3400,"ECE",22));
		employee.add(new Employee(101,"rss",3600,"MECH",25));
		employee.add(new Employee(120,"aravind",3800,"MECH",20));
	//	List<Employee>map=employee.stream().collect(Collectors.minBy(Employee::getSalary)).Collectors.toList());
		//Optional<Employee>mm=employee.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));

		//System.out.println(mm);
		//Optional<Employee>mm1=employee.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary)));
		/*            */
		
		//System.out.println(mm1);
          // employee.stream().distinct(e->e.getName());
		
		//employee.stream().collect(Collectors.toCollection(()->new TreeSet<name>((p1,p2)->p1.getName().compareTo(p2.getName()))));
		//((Stream<Employee>) employee).collect(Collectors.groupingBy(p->p.getName()).value().stream().map())
		
		//List<Employee>mm2=employee.stream().distinct().collect(Collectors.toList());
	//	mm2.forEach(System.out::println);
		
		Optional<Integer>ss=employee.stream()
		.map(Employee::getSalary)
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst();
		System.out.println(ss);
	}	
}
