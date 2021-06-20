package Arrays;

import java.util.Arrays;

public class pushZerosToTheEndOfTheArray {
	
	public void pushZeros(int arr[])
	{
		int count =0;
		
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0) {
				arr[count++] = arr[i];				
			}
		}		
          while(count<n) 			
		 arr[count++] =0;		
	}

	public static void main(String[] args) {
	pushZerosToTheEndOfTheArray pz = new pushZerosToTheEndOfTheArray();
    int[] arr = {5,0,8,0,7};		
	pz.pushZeros(arr);		
	System.out.println(Arrays.toString(arr));

	}

}
