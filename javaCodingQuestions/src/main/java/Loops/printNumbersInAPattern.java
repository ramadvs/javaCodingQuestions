package Loops;

public class printNumbersInAPattern {
	
	public void printnum(int x) {
		for(int i=1; i<=x; i++)
		{
			for(int j=1;j<=i;j++) {
				 				
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		printNumbersInAPattern printnum =  new printNumbersInAPattern();
		
		printnum.printnum(5);
		
	}

}
