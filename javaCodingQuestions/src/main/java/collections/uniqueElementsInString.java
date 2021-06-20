package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class uniqueElementsInString {
	
public void uniqueAlphabets(String s)
	
	{
     Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			hm.put(ch, (hm.getOrDefault(ch,0))+1);
				
		}
		
		System.out.println("The occurance of each character in the string are : "+hm);
		
		Set<Map.Entry<Character, Integer>> entryset = hm.entrySet();
		
		List<Character> alst = new ArrayList<Character>();
		
		
		for(Map.Entry<Character, Integer> entry : entryset)
		{
			if((entry.getValue())==1)
			{
				alst.add(entry.getKey());
			}	
			
		}
		
		
		System.out.println(" the unique elements in the given string are : " + alst);	
		
	}

	public static void main(String[] args) {
		
uniqueElementsInString uniq = new uniqueElementsInString();
		
		uniq.uniqueAlphabets("whiteboxlearning");

	}

}
