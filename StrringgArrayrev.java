package iamPrograms;

public class StrringgArrayrev {


	 public static void main(String[] args)
	 {
		 String Str="rammohanp";
		 String[] sr=Str.split("");
               
    
     String rm=null;
 
for(int i = sr.length- 1;  i>=0; i--)
{
//rev =  sr.toString();
//System.out.println(rev);
//System.out.print(sr.length);
	rm=sr[i];
	System.out.print(rm);
	System.out.println(sr[i]);
}

//System.out.println(rev[i]);
       
 }
}

