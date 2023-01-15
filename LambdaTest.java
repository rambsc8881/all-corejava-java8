package java8features;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args)
	{
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(17);
		list.forEach((n)->System.out.println(n));
		

		}
}
