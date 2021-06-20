package stringsQuestions;

public class removeSpecialCharacters {
	
	public void removeJunk(String str)
	{
		str =  str.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(str);
		
	}
	
	public void showOnlySpecialCharcters(String str1)
	{
	
        str1 =  str1.replaceAll("[!^a-zA-Z0-9]", " ");
		
		System.out.println(str1);
		
	}

	public static void main(String[] args) {
		
		removeSpecialCharacters rs = new removeSpecialCharacters();
		

		 rs.removeJunk("java!@#@#$ selenium%^&*&^* ");
		
        rs.showOnlySpecialCharcters("java12@#@$ selenium&*&^*&");
		
		

	}

}
