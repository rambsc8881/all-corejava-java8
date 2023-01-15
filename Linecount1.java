import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Linecount1 {
	public static void main(String[] args) {
		 
        // local variables
        long lineCount = 0;
        Path path = null;
 
 
        // read file from root folder
        path = Paths.get("BRN.txt");
 
 
        try {
 
            // read file and count no. of lines
            lineCount = Files.lines(path).count();
        } 
        catch (IOException ioex) {
 
            // handle exception
            ioex.printStackTrace();
        }
 
 
        // print to console
        System.out.println("Number of lines is : " + lineCount);
    }
}

}
