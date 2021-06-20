package numberBasedQuestions;

public class someOfTheDigitsOfANumber {
	
	public void sumOfDigits(String S)
	{
		int n = Integer.parseInt(S);
		
		//System.out.println(n);
		
		int sum = 0;
		
		while(n>0)
		{
			if(n%10 >0)
			{
			sum = sum + (n%10);
			n = n/10;	
			}	
			
		}
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		
		someOfTheDigitsOfANumber sumnum = new someOfTheDigitsOfANumber();
		
		sumnum.sumOfDigits("15535");
		

	}

}
