import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class WordCountt {
	 public static void main(String[] args) {
		 
	        // local variables
	        long wordCount = 0;
	        Path path = null;
	 
	 
	        // read file from root folder
	        path = Paths.get("BRN.txt");
	 
	 
	        try {
	 
	            // read file and count no. of words
	            wordCount = Files.lines(path)
	                    .parallel()
	                    .flatMap(line -> Arrays.stream(line.trim().split(" ")))
	                    .count();
	        }
	        catch (IOException ioex) {
	 
	            // handle exception
	            ioex.printStackTrace();
	        }
	 
	 
	        // print to console
	        System.out.println("Number of words is : " + wordCount);
	    }
	}


