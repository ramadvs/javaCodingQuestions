package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class secondHighestOfArray {
	
	public void SecondHighest(int[] a)
	{
		int x = a.length;
		
		for(int i=0;i<x-1;i++)
		{
			for(int j=0;j<x-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;	
				}	
			}
		}
	System.out.println(Arrays.toString(a));
	
	int len = a.length-2;
	System.out.println("The second largest number of the array is : "+ a[len] );
		
	}

	
	public static void main(String[] args) {
		
		secondHighestOfArray SH = new secondHighestOfArray();
		
		int[] a = {1,6,8,4,2};	
		
		SH.SecondHighest(a);

	}

}
