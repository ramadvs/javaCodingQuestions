package unknown;

import java.util.Arrays;
import java.util.List;

public class verifyRansomNote {
	
//how-to-check-array-is-subset-of-another.html
	
	public void ransomNoteWithArcticle(String ransomNote, String article)
	{
		String[] RansomNoteArray = ransomNote.split(" ");
		
		String articleModified = article.replace(".", " ");
		
		String[] articleArray = articleModified.split(" ");
		
		
		List<String> RansomNoteList = Arrays.asList(RansomNoteArray);
		
		List<String> articleList = Arrays.asList(articleArray);
		
		if(RansomNoteList.containsAll(articleList))
		{
			System.out.println("The ransome note from kidnapper is authentic");
		}
		else
			
		System.out.println("The ransome note from kidnapper is not authentic");
		
	}

	public static void main(String[] args) {
		
verifyRansomNote RN1 = new verifyRansomNote();
		
		RN1.ransomNoteWithArcticle("blah blah blah hello I will blah tesla to blah blah tesla to interview",
				"hello welcome to the tesla interview. Tesla Rocks.");
		
		RN1.ransomNoteWithArcticle("blah blah blah hello I will blah tesla to blah blah tesla to interview",
				"hello to tesla interview.");

	}

}
