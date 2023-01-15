import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class OcuurNumberUsj8 {
		 
	    public static void main(String[] args) {
	 
	       
	        String input = "rammoh anan ramH";
	 
	       Map<Character, Long> characterCountMap = input
	        //Map<String, Long> characterCountMap = input
	                .chars() 
	               .mapToObj(c -> (char) c)
	                .filter(ch -> !Character.isWhitespace(ch))
	                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
	 
	
	        System.out.println("1. Characters and its Count in DESC :- \n");
	        characterCountMap
	        .entrySet()
	        .stream()
	        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	        .forEach(System.out::println);
}
}
