package stringsQuestions;

public class This1is2nice3 {
	
	public  void wordWithNo(String str)
	{
		String[] words = str.split(" ");
		
		int num = 1;
		
		String newStr = " ";
		
		for(String w:words)
		{
			newStr = newStr + w.toString()+ num +" ";
			num++;			
		}
		
		System.out.println(newStr);
		
	}	

	public static void main(String[] args) {
		
		This1is2nice3 tin = new This1is2nice3();
		
		tin.wordWithNo("this is nice");
	}

}
