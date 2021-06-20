package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFileAsString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rsunk\\Sample.txt"));
		StringBuilder sb = new StringBuilder();
		
		String line = br.readLine();
		
		while (line!=null)
		{
			sb.append(line).append("");
			line =br.readLine();
		}
// br.close();
		String fileAsString = sb.toString();
		
		System.out.println(fileAsString);
		

	}

}
