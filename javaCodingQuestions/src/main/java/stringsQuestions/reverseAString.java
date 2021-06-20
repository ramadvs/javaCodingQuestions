package stringsQuestions;



public class reverseAString {
	
	public void reverseStr(String str)
	{
		char[] arr = str.toCharArray();
		
		int count = arr.length-1;
		
		String newstr = "";
		
		for(int i=count;i>=0;i--)
		{
			newstr = newstr + arr[i];
			
		}
		System.out.println(newstr);
		
	}
	
	public void revstrn(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		 
		System.out.println(sb.reverse());
	}
	

	public static void main(String[] args) {
		
		reverseAString rs = new reverseAString();
		
		rs.reverseStr("welcome");
		rs.revstrn("Dublin");
		

	}

}
