package RemoveDuplicates;

import java.util.Arrays;
import java.util.stream.Stream;

public class Mergetwoarrays {
	
public static<T>Object[] concate(T[]a,T[]b)
{
	return Stream.of(a,b)
			.flatMap(Stream::of)
			.toArray();
	
}
public static void main(String[] args)
{
	Integer[] a = new Integer[]{1,2,3};
    Integer[] b = new Integer[]{4,5,6};
 
    Object[] c = concate(a,b);
     

System.out.println("Merged object array : "+ Arrays.toString(c));
}
}
