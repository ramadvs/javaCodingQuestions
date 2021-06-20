package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sortAnArray {
	
	public void SortArr(int[] arr)
	{
		/*System.out.println("Array elements before sorting : "+ Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		
		System.out.println("Array elements after sorting : "+ Arrays.toString(arr));
		*/
		
		Arrays.sort(arr);
		
		System.out.println("Array elements after sorting : "+ Arrays.toString(arr));
		
	}
	
	public void reverseSort(Integer[] arr1)
	{
		System.out.println("Array elements after sorting : "+ Arrays.toString(arr1));
		
		Arrays.sort(arr1,Collections.reverseOrder());
		
		System.out.println("Array elements after sorting/descending : "+ Arrays.toString(arr1));
				
		
	}

	public static void main(String[] args) {
		
		sortAnArray SR = new sortAnArray();
		
    int[] arr= {20, 60,10, 30, 50, 5};
		
		SR.SortArr(arr);
		
		Integer[] arr1 = {80,30,65,11,150,45};
		
		SR.reverseSort(arr1);
	}

}
