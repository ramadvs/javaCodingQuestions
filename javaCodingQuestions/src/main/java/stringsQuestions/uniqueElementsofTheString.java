package stringsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class uniqueElementsofTheString {
	
	public void uniqueEle(String str)
	{
	Map<Character, Integer> hm = new HashMap();
	for (int i=0; i<str.length();i++)
	{
		char ch = str.charAt(i);
		hm.put(ch,(hm.getOrDefault(ch,0))+1);
	}
	System.out.println("the occurance of each character in the string are : "+ hm);
	
	Set <Map.Entry<Character, Integer>>entryset = hm.entrySet();
	
	List<Character> alist = new ArrayList();
	
	for(Map.Entry<Character, Integer> entry : entryset) 
	
	{
		if((entry.getValue())==1)
		{
		alist.add(entry.getKey());
			
		}
		}
	System.out.println("the unique elements in the given string are: " + alist);
	}

	public static void main(String[] args) {
		
		uniqueElementsofTheString strelem = new uniqueElementsofTheString();
		
		
		strelem.uniqueEle("this is a book");
		

	}

}
