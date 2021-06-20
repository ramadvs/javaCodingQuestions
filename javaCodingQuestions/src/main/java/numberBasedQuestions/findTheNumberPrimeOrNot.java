package numberBasedQuestions;

public class findTheNumberPrimeOrNot {
	
	public void primeornot(int n)
	{
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
		findTheNumberPrimeOrNot findprm = new findTheNumberPrimeOrNot();
		
		findprm.primeornot(17);
	}

}
