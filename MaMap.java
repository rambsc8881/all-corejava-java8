import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaMap {
	public static void main(String[] args)
	{
		
		        List<String>lists = new ArrayList<String>();
		         lists.add("ram");
		         lists.add("ram");
		         lists.add("ss");
		         lists.add("vv");
		        Map<String, Long>map=lists.stream().collect(Collectors.groupingBy(String ->String,Collectors.counting()));
		         System.out.println(map);
	}

}
