package RemoveDuplicates;

import java.util.Collections;
import java.util.stream.Collectors;

public class Filterjava88 {
	
		boolean uniqueCharacters(String s)
		{
			// If at any character more than once create another stream
			// stream count more than 0, return false
			return s.chars().collect(
		            Collectors.groupingBy(ch -> ch, Collectors.counting()).count() > 1 ? false: true;
		}

		public static void main(String args[])
		{
			Filterjava88 obj = new Filterjava88();
			String input = "GeeksforGeeks";

			if (obj.uniqueCharacters(input))
				System.out.println("The String " + input + " has all unique characters");
			else
				System.out.println("The String " + input + " has duplicate characters");
		}
	}

	//Write Java code here

