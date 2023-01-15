import java.util.HashMap;
import java.util.Map;

public class OccurenceNumber {

		static void Character(String strm)
		{
		
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		
		char[] ar=strm.toCharArray();
		
		for(char a:ar)
		{
			if(map.containsKey(a))
			{
				map.put(a, map.get(a)+1);
			}
			else
			{
				map.put(a, 1);
			}
			for (Map.Entry entry : map.entrySet()) 
			 {
		            System.out.println(entry.getKey() + "- " + entry.getValue());
		        }
		}
		}
			public static void main(String[] args)
			{
				String str="today is sunday";
				
		Character(str);
		}
	}


