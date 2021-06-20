package stringsQuestions;

public class palindromeStringOrNot {
	
	public void checkPalindrome(String str)
	{
		char[] arr = str.toCharArray();
		
		String rev = " ";
		int len = arr.length;
		
		for(int i=len-1;i>=0;i--) {
			
			rev = rev+arr[i];
		}
	System.out.println(rev);	
	if(str==rev)
	{
		System.out.println(str + " is a palindrome string");		
	}
	else
	{
		System.out.println(str + " is a not a palindrome string");	
	}
	}

	public static void main(String[] args) {
		
		palindromeStringOrNot plnstr = new palindromeStringOrNot();
		
		plnstr.checkPalindrome("madam");
		

	}

}
