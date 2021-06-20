package numberBasedQuestions;

import java.util.Scanner;

public class reverseANumber {

	public void revnum()
	{
		
		Scanner sc = new Scanner(System.in); // Accepts a value from the user during runtime
		
		System.out.println("enter a number :");
		int num = sc.nextInt();		
		int rev = 0;		
		while(num != 0)
		{
			rev = rev*10 + num%10;
			num = num/10;			
		}		
		System.out.println(rev);	
		
		
	}
	
	public void revno1(int num )
	{
		int rev = 0;
		
		while(num>0)
		{
			rev = rev*10 +num%10;
			num = num/10;
		}
		
		System.out.println(rev);
	}
	
	
//using string buffer class
	public void revno()
	{
		Scanner sc = new Scanner(System.in); // Accepts a value from the user during runtime
		
		System.out.println("enter a number :");
		int num = sc.nextInt();		
			
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println(rev);
	}
//Using String builder
	
	public void revnumr()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(num);
		
		StringBuilder rev = sb1.reverse();
		
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
		
		reverseANumber rvno = new reverseANumber();
		
		rvno.revno1(12345);

	}

}
