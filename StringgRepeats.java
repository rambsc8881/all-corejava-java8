package RemoveDuplicates;

import java.util.HashMap;
import java.util.Map;

public class StringgRepeats {
	public static void main(String[] args)
	{
		String str="Rammohan";
		char[] ar=str.toCharArray();
		Map<Object,Integer>map=new HashMap<Object,Integer>();
		for(char a:ar)
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
////////////////////////////////////////////////////////////////////////