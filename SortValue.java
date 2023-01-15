package iamPrograms;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortValue {
	public static void main(String[] args)
	{
		
	
	Map<Integer,String>list1=new HashMap<>();
	
	list1.put(10012, "ram");
	list1.put(12100, "shiva");
	list1.put(12100, "rammohan");
	list1.put(12100, "ss");
	list1.put(12100, "siva");
	Set<Entry>entrySet=list1.entrySet();
	
	List<Entry>mm=new ArrayList<>(entrySet);
	
	list1.forEach((k,v)->System.out.println(k+":"+v));
	
	Collections.sort(mm,new Comparator<Entry>()
			{
		@override
		public int compare(Entry<Integer,String>o1,Entry<Integer,String>o2)
		{
			return o1.getValue().compareTo(o2.getValue());
		}
			});
	}
}
