
public class Sterere {
	public static void main(String[] args)
	{
	
String str = "ONE,TWO,THREE,FOUR";

String[] words = str.split(",");

String revString="";

for(int i=0;i<words.length;i++)
{
	String word=words[i];
	String revString1="";
	for(int j=word.length()-1;j>=0;j--)
	{
		revString1+=word.charAt(j);
	}
	 revString +=revString1+",";
	}
System.out.println(revString);
	}
}

