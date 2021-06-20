package stringsQuestions;

public class removeWhiteSpaces {
	
	public void removeSpaces(String str)
	{
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		removeWhiteSpaces rmwtsp = new removeWhiteSpaces();
		
		rmwtsp.removeSpaces("welcome to java and selenium");
		

	}

}
