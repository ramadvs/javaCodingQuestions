package Arrays;

public class mergeTwoArraysInToThirdArray {
	
	public void mergearrays(int[] arr1, int[]arr2)
	{
		int[] arr3 = new int[arr1.length+arr2.length];
		
		int count = 0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			count++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr3[count++]=arr2[j];
		}
		
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		mergeTwoArraysInToThirdArray merge = new mergeTwoArraysInToThirdArray();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		merge.mergearrays(arr1, arr2);
		

	}

}
