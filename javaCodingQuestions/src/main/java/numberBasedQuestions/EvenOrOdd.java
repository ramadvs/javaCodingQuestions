package numberBasedQuestions;

import java.util.Scanner;

public class EvenOrOdd {
	
	public void checkNum(int a)
	{
		if(a%2 == 0)
		{
			System.out.println(" the given number "+ a + " is even");
		}
		else
		{
			System.out.println(" the given number "+ a + " is odd");
		}
	}
	
	public void checkGivenNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a number:");
		
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(" the given number "+ num + " is even");
		}
		else
		{
			System.out.println(" the given number "+ num + " is odd");
		}
		
		
	}

	public static void main(String[] args) {
		EvenOrOdd  eod = new EvenOrOdd();
		 eod.checkGivenNum();

	}

}
