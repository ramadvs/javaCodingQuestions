package numberBasedQuestions;

import java.util.Scanner;

public class palindromeNumber {
	
	public void checkPalindrome()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		int num = sc.nextInt();
		
		int orgNum = num;
		
		int rev =0;
		
		while(num!=0)
		{
			rev = rev*10 + num %10;
			
			num = num/10;			
		}
		System.out.println(rev);
		
		if(orgNum == rev)
		{
		System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}
		
		}

	public static void main(String[] args) {
		
		palindromeNumber pn = new palindromeNumber();
		
		pn.checkPalindrome();

	}

}
