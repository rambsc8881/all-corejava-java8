package java8features;

import java.util.function.Predicate;

public class ImplementPredicate {
	public static void main(String[] args)
	{
		Predicate<Integer> lesserThan=i->(i<20);
			
		     System.out.println(lesserThan.test(11));
		}
	}


