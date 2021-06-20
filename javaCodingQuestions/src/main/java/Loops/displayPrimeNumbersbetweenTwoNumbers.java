package Loops;

public class displayPrimeNumbersbetweenTwoNumbers {
	
	public void primeornot(int fromNumber, int toNumber)
	{
		
		String str ="The Prime Numbers between " + fromNumber + " and " + toNumber + " are: ";
		System.out.print(str);
		for (int k=fromNumber; k<=toNumber; k++)
		{
		boolean isPrime = true;		
		for(int i=2; i<k; i++)
		{
			if(k%i == 0)
			{
				isPrime = false;
				break;
			}			
	}
		
		if(isPrime)
		{
			System.out.print(k +" " );
		}
	}
	}
	

	public static void main(String[] args) {
		displayPrimeNumbersbetweenTwoNumbers findprm = new displayPrimeNumbersbetweenTwoNumbers();
		
		findprm.primeornot(17,34);
	}

}
