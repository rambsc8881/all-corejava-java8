import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintRepetChar {
public static void main(String[] args)
{
	String str="Rammmohan";
	char[] ar=str.toCharArray();
	
	List<Character>list=new ArrayList<Character>();
	for(char c:ar)
		list.add(c);
	 Map<Character, Long>map=list.stream().collect(Collectors.groupingBy(Character->Character,Collectors.counting()));
     System.out.println(map);
}
	}


