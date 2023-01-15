
public class Strstr {

	public static void main(String[] args)
	{
		String str="ONE,TWO,THREE,FOUR";
		String[] sr=str.split(",");
		
		String n="";
		
		for (String w:sr) {
		String reverstring="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverstring+=w.charAt(i);
		         n=reverstring+",";		
			}
			System.out.print(n);
			
		}
		
	}

}
