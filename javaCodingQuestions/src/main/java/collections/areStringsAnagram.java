package collections;

import java.util.HashMap;

public class areStringsAnagram {
	
	public void anagram2strings(String str1, String str2)
	{
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer> ();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer> ();
		
		//str1  to h1
		
		for(int i=0; i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			h1.put(ch,(h1.getOrDefault(ch,0))+1);
		}
		System.out.println(h1);
		
		//str2 to h2
		
		for(int j=0; j<str2.length();j++)
		{
			char cha = str2.charAt(j);
			h2.put(cha,(h2.getOrDefault(cha,0)+1));
		}
		
		System.out.println(h2);
		
		if(h1.equals(h2)) 
		{
			System.out.println(" Strings " + str1 + " and "+ str2 + "are anagram");
		}		
		else
		{
			System.out.println(" Strings " + str1 + " and "+ str2 + "are  not anagram");	
		}		
		
	}
	

	public static void main(String[] args) {
		
          areStringsAnagram angrm = new areStringsAnagram();
		
		angrm.anagram2strings("triangle", "integral");

	}

}
