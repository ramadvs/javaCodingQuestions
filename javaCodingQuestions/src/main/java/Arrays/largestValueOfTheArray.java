package Arrays;

public class largestValueOfTheArray {
	
	public void findLargest(int[] arr)
	{
		int largestnum = arr[0];
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>largestnum)
			{
				largestnum = arr[i];
			}
		}
		System.out.println(largestnum);
	}
	public void minOfArray(int[] arr)
	{
		int min = arr[0];
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min = arr[j];
			}
		}
			System.out.println(min);
		
	}

	public static void main(String[] args) {
		
		largestValueOfTheArray lnm = new largestValueOfTheArray();
		
		int[] arr = {45, 78,33, 22,100,2,3};
		
		lnm.findLargest(arr);
		

	}

}
