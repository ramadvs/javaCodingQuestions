package Arrays;

import java.util.Arrays;

public class sortAnArrayAsecending {
		
		public void SortArr(int[] a)
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
			
		}

	public static void main(String[] args) {
		
		sortAnArrayAsecending BA = new sortAnArrayAsecending();
		
		int[] a = {1,6,8,4,2};
		
        BA.SortArr(a);
        
        int len = a.length-2;
    
		//Finding the second largest from the array
		System.out.println(a[len]);
		

	}

}
