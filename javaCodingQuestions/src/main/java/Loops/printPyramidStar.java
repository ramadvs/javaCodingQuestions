package Loops;

public class printPyramidStar {

	public void pyramidStars() {
		// declare 3 variables. x for rows; y for columns and r for number of rows
		int x, y, z, r=5;
		
		//outer loop for rows
		for(x=1; x<=r; x++)
		{
			//inner loop for columns
			for (y=1; y<= r-x; y++)
			{
				System.out.print(" ");
			}
			for (z=1; z<=x; z++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		printPyramidStar pyramid = new printPyramidStar();
		pyramid.pyramidStars();

	}

}
