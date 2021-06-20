package stringsQuestions;

public class reverseStringComplex {
	
	public void revStrr(String input)
	{
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
		System.out.print(c);
		System.out.println();
	}


	public static void main(String[] args) {
		
		reverseStringComplex rs = new reverseStringComplex();
		
		rs.revStrr("goodmorning");

	}

}
