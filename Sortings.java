package EmployeeSortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sortings {
public static void main(String[] args)
{
	List<Employee>employee=new ArrayList<Employee>();
	employee.add(new Employee(100,"ram",2000,"IT",25));
	employee.add(new Employee(100,"abhi",2200,"IT",24));
	employee.add(new Employee(100,"tharun",2000,"IT",25));
	employee.add(new Employee(100,"shiva",3900,"CSE",26));
	employee.add(new Employee(100,"ram",3300,"CSE",28));
	employee.add(new Employee(100,"ss",2700,"ECE",27));
	employee.add(new Employee(100,"charan",3400,"ECE",22));
	employee.add(new Employee(100,"rss",3600,"MECH",25));
	employee.add(new Employee(100,"aravind",3800,"MECH",20));
	
	//Collections.sort(employee,new Mysort());
	
	//System.out.print(employee);
	//List<String>list=(List<String>)employee.stream()
		//	.sorted(Comparator.comparingInt(Employee::getAge))
			//.map(Employee::getName)
			//.collect(Collectors.toList());
	//list.forEach(System.out::print);
	//System.out.println(list);
	
	//List<Employee>list=(List<Employee>)employee.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
		//list.forEach(System.out::print);
	//List<Employee>list=(List<Employee>)employee.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(((Stream<Employee>) Collectors.groupingBy(Employee::getDept)).collect(Collectors.toList());
	//list.forEach(System.out::print);
	
	//Map<String, List<Employee>>list2=employee.stream().collect(Collectors.groupingBy(Employee::getDept));
	//System.out.print(list2);
	
	//Map<String,List<Employee>>higestsalay=employee.stream().collect(Collectors.groupingBy(Employee::getDept,CollectingAndThen(maxBy(Comparator.comparingInt(e->e.getSalary())))));
	//higestsalay.forEach(System.out::println);
	//Optional<Employee>maxsalary=employee.stream().collect(Collectors.groupingBy(Employee::getDept,max(Comparator.comparing(Employee::getSalary));
	//System.out.println(maxsalary);
//}

//@SuppressWarnings("rawtypes")
//private static Collector max(Comparator<Employee> comparing) {
	
	// int compare(Employee o1, Employee o2) {
		
		//return (int)(o2.getSalary()-o1.getSalary());;
//}
//List<String>list3=employee.stream().filter(e->e.getName().compareTo(e1.getName(),e2.getName())).collect(Collectors.toList());
//System.out.println(list3);
	
	//@SuppressWarnings("unchecked")
	//List<String>mapandsortnames=employee.stream()
	//.sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
	//.map(e->e.getName())
	//.collect(Collectors.toList());
	//System.out.print(mapandsortnames);
	//@SuppressWarnings("rawtype")
	//List<Employee>list=employee.stream().sorted((e1,e2)->((Integer) e1.getAge).compareTo((Integer) e2.getAge()))//.map(e->e.getAge())
		//	.collect(Collectors.toList());
	//System.out.println(list);
	
	
	//List<Integer>list=(List<Integer>)employee.stream()
		//	.sorted(Comparator.comparing(Employee::getName))
			//.map(Employee::getAge)
			//.collect(Collectors.toList());
	//System.out.println(list);
	
	//@SuppressWarnings("unchecked")
	//Map<Object, Long>list= employee.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.counting()));
			//.sorted(Comparator.comparingInt(Employee::getAge))
			//.map(Employee::getName)
			//.collect(Collectors.toList());
	//System.out.println(list);
	
	//@SuppressWarnings("unchecked")
	//Map<Object, Object>list=  employee.stream().collect(Collectors.groupingBy(e->e.getDept())));
			//.sorted(Comparator.comparingInt(Employee::getAge))
			//.map(Employee::getName)
			//.collect(Collectors.toList());
	//System.out.println(list);
//}

//private static Collector map(Object object) {
	// TODO Auto-generated method stub
	//return null;
//}

//private static Collector map(Object object) {
	// TODO Auto-generated method stub
	//return null;
	
	//Map<Object,List<Employee>>list=  employee.stream().collect(Collectors.groupingBy(Employee::getDept));
	//list.forEach(dept,employessindepy)->
	//{
		//employeesindept.forEach()
	//};
	
	//Map<Object,List<Employee>>list=employee.stream().collect(Collectors.comparing)
	
	Map<String,Employee>maxsalaryeachdept=employee.stream()
			.collect(Collectors.groupingBy(Employee::getDept,Collectors.collectingAndThen(Collectors.summingInt(Employee::getSalary)),Optional::get));
			System.out.println(maxsalaryeachdept);
}
}

//private static Collector CollectingAndThen(Object maxBy) {
	// TODO Auto-generated method stub
	//return null;
//}

//private static Object maxBy(Comparator<Object> comparingInt) {
	// TODO Auto-generated method stub
	//return null;
//}

//private static Collector CollectingAndThen(Object maxBy) {
	// TODO Auto-generated method stub
	//return null;
//}

//private static Object allmaxBy(Comparator<Employee> comparing) {
	
	//return (int) (o2.getSalary()-o1.getSalary());
//}
//}
