package Arrays;

public class searchOfAnElementInArray {
	
	public void SearchElem (int[] arr, int x)
	{
		boolean present=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(x == arr[i])
			{
				present = true;
				System.out.println(" the element is at index num : "+ i );
				break;
			}
		}
   if(present )
			{
			System.out.println("element present");			
				
			}
			else
			{
			System.out.println("element not found");	
			}			
	}

	public static void main(String[] args) {
		
		searchOfAnElementInArray searchele = new searchOfAnElementInArray();
		
		int[] arr = {10, 15, 25, 30, 50};
		
		searchele.SearchElem(arr, 25);

	}

}
