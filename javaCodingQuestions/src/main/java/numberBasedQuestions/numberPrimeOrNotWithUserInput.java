package numberBasedQuestions;

import java.util.Scanner;

public class numberPrimeOrNotWithUserInput {
	
	public void primeOrNot()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n =sc.nextInt();
		boolean isPrime = true;		
				for(int i=2; i<n; i++)
				{
					if(n%i == 0)
					{
						isPrime = false;
						break;
					}			
			}
				if(isPrime)
				{
					System.out.println(n + " is   a prime numebr");
				}
				else 
				{ System.out.println(n + " is not a prime number");
				
				}
	}

	public static void main(String[] args) {
		
		numberPrimeOrNotWithUserInput numprm = new numberPrimeOrNotWithUserInput();
		
           numprm.primeOrNot();
	}

}
