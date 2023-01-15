package RemoveDuplicates;

import java.util.HashSet;

public class Java8uniqchars {


	static boolean uniqueCharacters(String str)
	{
		HashSet<Character> char_set = new HashSet<>();

		// Inserting character of String into set
		for(int c = 0; c< str.length();c++)
		{
			char_set.add(str.charAt(c));
		}

		// If length of set is equal to len of String
		// then it will have unique characters
		return char_set.size() == str.length();
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "GeeksforGeeks";

		if (uniqueCharacters(str))
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
	}
	}


	


