import java.util.ArrayList;
import java.util.function.Predicate;


public class StrinAlpha {
	public static void main(String[] args)
	{
		String[] ar= {"ram","mohan","charan",null, ""};
		Predicate<String>p=s ->s!=null && s.length() !=0;
		ArrayList<String>l=new ArrayList<String>();
		{
			for(String s:ar)
			{
				if(p.test(s))
				{
					l.add(s);
				}
			}
			System.out.println(l);
		}
		
		
		
	}

}
