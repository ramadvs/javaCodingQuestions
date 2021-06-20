package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(0, 50);
		
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		System.out.println(ar);

		ArrayList<String>  str = new ArrayList<String>();
		str.add("Tom");
		str.add("Jim");
		str.add("David");
		str.add("Henry");
		System.out.println(str.size());
		
	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));	
		System.out.println(numbers);
		
	}

}
