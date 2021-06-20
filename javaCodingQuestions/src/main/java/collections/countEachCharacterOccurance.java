package collections;

import java.util.HashMap;
import java.util.Map;

public class countEachCharacterOccurance {
	
public void eachCharcterOccurance (String str)
	
	{ 
	
	Map<Character, Integer> hm = new HashMap<Character, Integer>();
	
	for(int i=0;i<str.length();i++)
	{
		char ch =str.charAt(i);
		
		hm.put(ch, (hm.getOrDefault(ch,0))+1);
	}
	
	
	System.out.println("The occurance of each alphabet in the given string:  "+hm);
		
	}
	

	public static void main(String[] args) {
		
		countEachCharacterOccurance cntchr = new countEachCharacterOccurance();
		
		cntchr.eachCharcterOccurance("Abbottdiabeticcare");
		

	}

}
