package Arrays;

public class missingNumberOfSortedArray {
	
	public void missingNumber (int[] arr )
	{
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum1 = sum1+arr[i];
			
		}
		System.out.println("The sum of elements of an array : "+ sum1);
		
		for(int j=1;j<=5;j++)
		{
			sum2 =sum2 + j;
		}
		
		System.out.println("The sum of range of elements of an array : "+ sum2);
		
		System.out.println("the missing element is : "+ (sum2-sum1));
		
	}

	public static void main(String[] args) {
		
		missingNumberOfSortedArray misngnum = new missingNumberOfSortedArray();
		
		int[] arr = {1,2,4,5};

		misngnum.missingNumber(arr);
	}

}
