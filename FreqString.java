package RemoveDuplicates;

import java.util.HashMap;
import java.util.Map;

public class FreqString {
	
		public static void main(String[] args)
		{
			String str="Rammohan Mohan Mohan Ram Ram" ;
			String[] ar=str.split(" ");
			Map<Object,Integer>map=new HashMap<Object,Integer>();
			for(String a:ar)
			if(map.containsKey(a))
			{
				map.put(a, map.get(a)+1);
			}else
			{
				map.put(a,1);
			}
			
			System.out.println(map);
		}

	}

