package alljava8;

import java.nio.file.Files;

public class FllatMap {
	public static void main(String[] args)
	{
		try
		{
			long wordcound=Files.lines(path.get(c://www.text))
				.FllatMap(l->Arrays.stream(l.split(" +")))
				.distinct()
				.count();
			System.out.println("number of words:"+wordcount);
		}
			catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
			
		}
	}

}
