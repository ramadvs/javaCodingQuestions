package Arrays;

public class commonElementsOfTwoArrays {
	
	public void commonElm(int[] arr1, int[] arr2)
	{
		
	for(int i=0;i<arr1.length;i++)	
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
			}
		}
	}
	
	}

	public static void main(String[] args) {
		
		commonElementsOfTwoArrays comele = new commonElementsOfTwoArrays();
		
		int[] arr1 = {10,20,40,50,60};
		int[] arr2 = {20,30,60,80};
		
		comele.commonElm(arr1, arr2);

	}

}
