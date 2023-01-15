package RemoveDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RmCharrs {
	//String words="rammohan".toCharArray();
	//char[] words=str.toCharArray();
	//List<char>list=Arrays.asList(words);
	public static void main(String[] args)
	{
	HashSet<Character>sr=new LinkedHashSet<>(Arrays.asList('r','a','m','m','h','a','n'));
	
	for(char word:sr)
	{
		System.out.print(word);
	}

}
}
