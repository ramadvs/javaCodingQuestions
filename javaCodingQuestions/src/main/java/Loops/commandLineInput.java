package Loops;

public class commandLineInput {
	
	/*
	 * Running Java files from CMD
	 * Go to Command Prompt --> cd C:\Users\rsunk\eclipse-workspace\javaCodingQuestions\src\main\java\Loops
	 * call Java commandLineInput with a set of values
	 * 
	 * */
	
		
	public static void main (String[] args) {
		for (int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
					}
	}
}
