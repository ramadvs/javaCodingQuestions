package numberBasedQuestions;

public class printNumDivisibleByThreeOrFive {
	
public void checkNum(int num)
{
	if(num%5 == 0 && num%3 == 0 )
	{
		System.out.println( num + " is divisible by 5 and 3");
	}
	else if(num%5 == 0)
	{
		System.out.println(num + " is divisible by 5");
	}
	else if(num%3 == 0)
	{
		System.out.println(num + " is divisible by 3");
	}
	else
	{
		System.out.println(num);
	}
}
	
	public static void main(String[] args) {
		
		printNumDivisibleByThreeOrFive pntnum =  new printNumDivisibleByThreeOrFive();
		
		pntnum.checkNum(17);
		

	}

}
