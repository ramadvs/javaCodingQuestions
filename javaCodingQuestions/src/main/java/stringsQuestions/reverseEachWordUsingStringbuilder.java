package stringsQuestions;

public class reverseEachWordUsingStringbuilder {
	
	public void revword(String str)
	{
		String[] words = str.split(" ");
		
	String reverseString =" ";
	
	for(String w:words)
	{
		StringBuilder SB = new StringBuilder(w);
		
		SB.reverse();
		
		reverseString = reverseString + SB.toString()+ " ";
	}
	System.out.println(reverseString);
	
	}

	public static void main(String[] args) {
		
		reverseEachWordUsingStringbuilder rvwd = new reverseEachWordUsingStringbuilder();
		
rvwd.revword("welcome to the group");
	}

}
