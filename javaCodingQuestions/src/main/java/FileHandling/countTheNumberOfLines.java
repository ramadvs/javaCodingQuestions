package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class countTheNumberOfLines {

	public static void main(String[] args) throws IOException {
		
  File file1 =new File("C:\\Users\\rsunk\\Sample.txt");
		
		FileReader fr = new FileReader(file1);
		
		LineNumberReader lr =new LineNumberReader(fr);
		
		int linenumbercount = 0;
		
		while(lr.readLine()!=null)
		{
			linenumbercount++;
			
		}
		
		System.out.println("Total number of lines : " + linenumbercount);

	}

}
