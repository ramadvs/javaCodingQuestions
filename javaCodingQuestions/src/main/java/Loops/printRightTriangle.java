package Loops;

public class printRightTriangle {
	
	public void printRtTriangle(int x) {
		for(int i=5; i<=x; i--)
		{
			for(int j=1;j<=i;j++) {
				 				
				System.out.print(" " + j);
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		printRightTriangle printRtTriangle = new printRightTriangle();
	      
		printRtTriangle.printRtTriangle(5);

	}
	
	

}
