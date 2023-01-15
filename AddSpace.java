import java.util.HashMap;
import java.util.Map;

public class AddSpace {

public static void main(String[] args ) {
	String s="coding java java coding";
Map<String,Integer>map=new HashMap<String,Integer>();
String[] words=s.split(" ");
for(String word:words)
{
	if(map.containsKey(word))
	{
		map.put(word,map.get(word)+1 );
	}
	else
	{
		map.put(word, 1);
	}
	
	System.out.println(map);
}
	}
}