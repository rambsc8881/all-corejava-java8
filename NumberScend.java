package StringAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberScend {
 
		public static int SecondLargest(Integer[] b, int total){  
		List<Integer> list=Arrays.asList(b);  
		Collections.sort(list);  
		int element=list.get(total-2);  
		return element;  
		}  
		public static void main(String args[]){  
		Integer a[]={1,2,5,6,3,2};  
		//Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+SecondLargest(a,6));  
		//System.out.println("Second Largest: "+SecondLargest(b,7));  
		}}  