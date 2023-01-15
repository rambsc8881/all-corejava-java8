package java8features;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsummerTest {
public static void main(String[] args)
{
	Consumer<Integer>display=a->System.out.println(a);
	display.accept(10);

	Predicate<Integer>pp=i->i>=10;
	System.out.println(pp.test(9));
	
	
}
}
