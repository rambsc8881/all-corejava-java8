import java.util.ArrayList;
import java.util.List;

public class Revelist {
	public static void main(String[] rags)
	{
		List<String>s=new ArrayList<String>();
		s.add("ram");
		s.add("sivs");
		s.add("ramesh");

	}
public static ArrayList<String>reverse(List<String> s)
{
	ArrayList<String> result=new ArrayList<String>();
	for(int i=s.size()-1;i>=0;i--)
	{
		
		result.add(s.get(i));
	}
	return result;
}
}
