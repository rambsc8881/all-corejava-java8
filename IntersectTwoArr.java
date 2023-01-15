package RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class IntersectTwoArr {
	public static void main(String[] args)
	{
		int[] ar1= {1,2,3,4,5,9};
		int[] ar2= {3,4,5,6};
		printIntersect(ar1,ar2);
	}
		private static void printIntersect(int[] ar1, int[] ar2)
		{
			Set<Integer>sr=new HashSet<>();
			for(int i=0;i<ar1.length;i++)
			{
				sr.add(ar1[i]);
			}
			for(int i=0;i<ar2.length;i++)
			{
				if(sr.contains(ar2[i]))
				{
					System.out.println(ar2[i]);
				}
			}
		}
	}


	
