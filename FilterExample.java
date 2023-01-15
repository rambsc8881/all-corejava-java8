package alljava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String[] args)
	{
	ArrayList<Product>list=new ArrayList<Product>();
	list.add(new Product(1,"ball",2500));
	list.add(new Product(2,"bat",5000));
	list.add(new Product(4,"cap",5400));
	list.add(new Product(3,"wickets",5600));
	list.add(new Product(5,"stumps",5100));

	//list.stream().filter(p->p.getPrice()>5200).forEach(System.out::print);
	//List<Product>listed=list.stream().filter(p->p.getPrice()>5200).collect(Collectors.toList());
	//listed.forEach(System.out::println);
	//List<Porduct>ll=list.stream().filter(p->p.getPrice()>5200).collectors(Collator.toList());
	//list.stream().filter(p->p.getPrice()>5200).map(e->e.getPrice()).forEach(System.out::println);
	//List<String>lists=list.stream().filter(p->p.getPrice()>5200).map(p->p.getName()).collect(Collectors.toList());
		//	lists.forEach(System.out::println);
	//System.out.print("-----inttype return---------" );
	//List<Integer>lists=list.stream().filter(p->p.getPrice()<5200).map(p->p.getPrice()).collect(Collectors.toList());
	//lists.forEach(System.out::println);
	
	System.out.print("-----int type return---------" );
	List<Integer>lists=list.stream().filter(p->p.getPrice()<5200).map(p->p.getProductid()).collect(Collectors.toList());
	lists.forEach(System.out::println);
	
	
	System.out.println("-----String type return---------" );
	List<String>lists1=list.stream().filter(p->p.getPrice()<5200).map(p->p.getName()).collect(Collectors.toList());
	lists1.forEach(System.out::print);
}
}
	

