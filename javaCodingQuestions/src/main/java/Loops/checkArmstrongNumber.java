package Loops;

public class checkArmstrongNumber {
	
	public void checkArmstrong(int x) {
		double c=0;
		int a, temp;
		int numdigits;
		numdigits = String.valueOf(x).length();
		System.out.println("number of digits are " + numdigits);
		temp = x;
		while (x >0)
		{
			a=x%10;
			x=x/10;
			//c=c+(a*a*a);
			c=c+Math.pow(a, numdigits);
			
		}
		if (temp==c)
		{
			System.out.println("is an armstrong number");
		}
		else
		{
			System.out.print("is not an armstrong number");	
		}
	
		
	}
	public static void main(String[] args) {
		checkArmstrongNumber checkArmstrong = new checkArmstrongNumber();
	      
		checkArmstrong.checkArmstrong(54748);

	}
}
