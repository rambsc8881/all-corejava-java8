
public class StrinRev {
public static void main(String[] args)
{
	String str="ram,sai,hari,vinod";
	String[] words=str.split(",");
	String revstring="";
	for(String word:words)
	{
		
		String normal="";
		for(int i=word.length()-1;i>=0;i--)
		{
			normal+=word.charAt(i);
		
			revstring=normal+",";
		}
		System.out.print(revstring);
	
	}
	
}
}
