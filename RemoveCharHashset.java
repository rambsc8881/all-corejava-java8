package RemoveDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveCharHashset {
	
	static void removeDuplicate (char[] str) {
	
	HashSet<Character>ch=new LinkedHashSet<Character>();
			
	for(char x:str)
	{
		ch.add(x);
	}
	for(char xx:ch)
	{
		System.out.print(xx);
	}
	}
	public static void main(String[] args)
	{
		char[] str="rammohan".toCharArray();
		
		removeDuplicate(str);
		
	}
}
