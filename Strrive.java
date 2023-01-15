
public class Strrive {
	public static void main(String[] args)
	{ 
		
		String sr="Ram Mohan";
		String[] ar=sr.split(" ");
		String n=" ";
		for(String word:ar)
		{
			String m="";
			for(int i=word.length()-1;i>=0;i--)
			{
	        m+=word.charAt(i);
	        
				//System.out.print(word.charAt(i));
	 
			}
			n+=m+" ";
			
			System.out.print(n);
		}
	}
}
	

