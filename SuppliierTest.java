package java8features;

import java.util.function.Supplier;

public class SuppliierTest {
	
public static void main(String[] args)
{
	Supplier<Double>randomvalue=()->Math.random();
	
	System.out.println(randomvalue.get());
}
}
