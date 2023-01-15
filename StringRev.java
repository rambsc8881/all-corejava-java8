package java8features;

public class StringRev {
	
public static void main(String[] rags)

{
	String str="RamMohan";
	
	String reversed=str.chars().mapToObj(c->(char)c).reduce("",(s,c)->c+s,(s1,s2)->s1+s2);
	
	System.out.println(reversed);
}

}
