package Arrays;

public class binarySearchofAnArray {
	
	public void BinarySearch(int[] arr, int x)
	{
		int l = 0;
		int h = arr.length-1;
		
		int m = (l+h)/2;
		
		boolean isPresent = false;
		
		while (l<=h)
	{
		if(arr[m]==x)
		{
			System.out.println(x + " is present");
			isPresent = true;
			break;	
		}
		
		if(arr[m]<x) 
		{
			l =m+1;
		}
			
		if(arr[m]>x)
		{
			l= m-1;
		}
	}
		
	}

	public static void main(String[] args) {
		
		binarySearchofAnArray binsearch = new binarySearchofAnArray();
		
		int[] arr = {45,78,33,22,100,2,3};
		
		binsearch.BinarySearch(arr,100);
		

	}

}
