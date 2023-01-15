package RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public static void main(String[] args)
	{
	String l="abdcadab";
  longest1(l);

}
private static String longest1(String l)
{
	Set<Character>rm=new HashSet<>();
	String longoverall="ab";
	String longtillnow="abcd";
	
	for(int i=0;i<l.length();i++) {
	char c=l.charAt(i);
	if(rm.contains(c))
	{
	
		longtillnow="";
		rm.clear();
		}
	rm.add(c);
	longtillnow+=c;
	
	if(longtillnow.length()>longoverall.length()) {
	longoverall=longtillnow;
	
}
}


return longoverall;
}
}
