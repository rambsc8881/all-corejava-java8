package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeImpl {
public static void main(String[] args)
{
	List<Employee>list=new ArrayList<Employee>();
	list.add(new Employee(100,"ram","hyd",1000));
	list.add(new Employee(101,"ra","blr",1100));
	list.add(new Employee(102,"am","hyd",5000));
	list.add(new Employee(103,"rm","blr",6000));
	list.add(new Employee(104,"rm","hyd",7000));
	
	//List<Employee>list1=list.stream().filter(e->e.addrs.matches("hyd")).collect(Collectors.toList());
	//list1.forEach(System.out::println);
	//List<Employee>list2=list.stream().filter(e->e.addrs.equals("blr")).filter(e1->e1.id<103).collect(Collectors.toList());
	//list2.forEach(System.out::println);
	//List<Employee>list3=list.stream().filter(e->e.addrs.isBlank()).collect(Collectors.toList());
	//list3.forEach(System.out::println);
	
	List<Employee>list4=list.stream().filter(e->e.addrs.matches("hyd"))
			.filter(e->e.getSalary()>3000)
			.collect(Collectors.toList());
	list4.forEach(System.out::println);
	//List<Employee>list5=list.stream().filter(e->e.addrs.concat("rm")).
	//list4.forEach(System.out::println);
	//List<Employee>lis=list.stream().filter(e->e.id==100).collect(Collectors.toList());
	//lis.forEach(System.out::println);
	//List<Employee>list7=list.stream()
		//	.collect(Collectors.groupingBy(Employee::getAddrs)),
			//Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())))
              //.collect(Collectors.toList());
	Comparator<Employee>compare=Comparator.comparingInt(Employee::getSalary);
	 
	Map<String, Optional<Employee>>list9=list.stream()
	            .collect(Collectors.groupingBy(Employee::getAddrs,
			   Collectors.reducing(BinaryOperator.maxBy(compare))));
	
	list9.forEach((addrs,emp)->{
		 System.out.println(addrs);
		 Employee employee = emp.get();
		 System.out.println(employee);
		 
	 });
	List<Employee>llist=list.stream().filter(e->e.name.startsWith("r")).collect(Collectors.toList());
	
  llist.forEach(System.out::println);
   int total=list.stream().collect(Collectors.summingInt(Employee::getSalary));
      System.out.println(total);
     Double ll= list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
     System.out.println(ll);
    //@SuppressWarnings("unchecked")
	//Long l5=((Stream<Employee>) list.stream().collect(Collectors.groupingBy(Employee::getAddrs))).collect(Collectors.counting());
    //L5.forEach(System.out::println);

Map<String,Long>l9=list.stream().collect(Collectors.groupingBy(Employee::getAddrs,Collectors.counting()));
System.out.println(l9);

}
}
