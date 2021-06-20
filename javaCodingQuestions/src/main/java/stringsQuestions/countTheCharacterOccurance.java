package stringsQuestions;

public class countTheCharacterOccurance {
	
public void charcterOccurance (String str, String x)
	
	{
		
		int strlength = str.length();
		
		String str1 = str.replaceAll(x, "");
		
		int str1length = str1.length();
		
		int i = strlength - str1length;
		
		System.out.println("the number of occrances of the given character is:  " + i);	
		
	}

	public static void main(String[] args) {
		
		countTheCharacterOccurance count1 = new countTheCharacterOccurance();
		
		 count1.charcterOccurance("this is an example", "m");
	}

}
