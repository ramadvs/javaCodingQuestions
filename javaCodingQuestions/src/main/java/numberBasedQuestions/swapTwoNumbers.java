package numberBasedQuestions;

public class swapTwoNumbers {
	
	public void swapNum(int a, int b)
	{
		System.out.println("print numbers before swapping : " + a + " " + b);
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("print numbers after swapping : " + a + " " + b);
		System.out.println("*************");
	}
	
	public void swapno(int a, int b)
	{
		System.out.println("the value of a before swapping is" + a);
		System.out.println("the value of b before swapping is" + b);
		
		a = a+b; // a =10+20
		b = a-b; //b= 30 -20
		a = a -b; //a = 30-10
		
		System.out.println("*************");
		System.out.println("the value of a after swapping is" + a);
		System.out.println("the value of b after swapping is" + b);
			
		
	}

	public static void main(String[] args) {
		
		swapTwoNumbers STN = new swapTwoNumbers();
		
		STN.swapNum(10, 25);
		STN.swapno(55, 77);

	}

}
