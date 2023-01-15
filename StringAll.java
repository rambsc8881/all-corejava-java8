package StringAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAll {
	
	public static int getSecondLargest(Integer[] arr,int total)
	{
		List<Integer>list=new ArrayList<Integer>();
		Collections.sort(list);
		int m=list.[total-2];
		return m;
		
	}
	
		
	
	public static void main(String[] args)
	{
		Integer[] arr= {1,3,6,4,9};
		System.out.println(getSecondLargest(arr,5));
	}

}
