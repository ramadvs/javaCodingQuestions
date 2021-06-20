package numberBasedQuestions;

public class fibonacciSeries {
	
	public void printFibonacci(int count)
	{
		int n1 = 0;
		int n2 =1;
		for(int i=0; i<count; i++)
		{
			int n3 = n1+n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;			
		}		
		
	}

	public static void main(String[] args) {
		
		fibonacciSeries fb = new fibonacciSeries();
		fb.printFibonacci(5);
		
		

	}

}
