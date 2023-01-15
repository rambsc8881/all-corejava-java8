package java8features;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Java8Supplier {
	public static  void main(String[] args)
	{
Supplier<LocalDateTime> s=()->LocalDateTime.now();
LocalDateTime time=s.get();
System.out.println(time);


	}

}
