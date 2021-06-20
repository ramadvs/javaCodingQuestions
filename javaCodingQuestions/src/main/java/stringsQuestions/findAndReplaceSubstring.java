package stringsQuestions;

public class findAndReplaceSubstring {

	public void findAndReplace(String str, String substr, String repl)
	{
		System.out.println("Initial string :" + str);
		boolean substrPresent = false;
		
		if(str.contains(substr))
		{
			substrPresent = true;
		}
		
		if(substrPresent)
		{
			str = str.replace(substr, repl);
			System.out.println(str);
		}
		else
		{
			System.out.println(str + " doesnot contain substring :" + substr);
		}
		
	}
		
	public static void main(String[] args) {
		
findAndReplaceSubstring find = new findAndReplaceSubstring();
		
		find.findAndReplace("whiteboxL", "L", "learning");
		
		find.findAndReplace("whiteboxL", "innovapath", "learning");
		

	}

}
