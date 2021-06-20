package stringsQuestions;

public class reverseEachWordOfString {

	public void reverseWord(String str)
	{
		String[] words = str.split(" ");
		
		String reversestring = " ";
		
		for(String W:words)
		{
			String revword = " ";
			
			for(int i=W.length()-1; i>=0;i--)
			{
				revword = revword+W.charAt(i);
			}		
		
		reversestring = reversestring + revword ;
		
		}
		System.out.println(reversestring);
	}
	
	public static void main(String[] args) {
		
	reverseEachWordOfString revword = new reverseEachWordOfString();
	revword.reverseWord("welcome to our place");
		
	

	}

}
