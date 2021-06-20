package Arrays;

public class PrintDistictNumRemoveDuplicates {

	public  void printDistinct(int[] arr)
	{				
		for(int i=0;i<arr.length;i++)
		{
			boolean distinctNo = true;
			
		  for(int j=0; j<i; j++) 
		  {
		     if (arr[i] == arr[j])
		     {
			  distinctNo = false;
		    //break;
		     }
		  }
		         
		  
		      if(distinctNo)
		        {
			     System.out.println( arr[i]+ " ");
		        }    		      	
		  }								
	}
		
	public static void main(String[] args) {
		
		PrintDistictNumRemoveDuplicates distnum = new PrintDistictNumRemoveDuplicates();
		
		int[] arr = {1,1,2,3,3,46,47,47,101};
		
		distnum.printDistinct(arr);
		

	}

}
