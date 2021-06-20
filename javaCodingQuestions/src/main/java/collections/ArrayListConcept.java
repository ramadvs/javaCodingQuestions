package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<String> AL1 = new ArrayList<String>();
		AL1.add("Tom");
		AL1.add("John");
		AL1.add(0,"David");
		AL1.add(2,"Harry");
		AL1.add(4,null);
		AL1.add("Mark");
		
		System.out.println(AL1);
		
		System.out.println("the size of this arraylist is : "+ AL1.size());
		
		System.out.println("index number of element John:  "+ AL1.indexOf("John"));
		
		System.out.println("index number of element John:  "+ AL1.lastIndexOf("John"));
		
		System.out.println("The element which is present at the index number 1 is : "+ AL1.get(1));
		
		System.out.println("check if Harry is present in the arraylist: "+ AL1.contains("Harry"));
		
		AL1.set(4, "Williams");
		System.out.println(AL1);
		
		System.out.println("the size of this arraylist is : "+ AL1.size());
		
		System.out.println("the sublist of arraylist from index number 1 to 4 is: "+ AL1.subList(1, 4));
		
		AL1.remove("Mark");
		
		System.out.println(AL1);
		
List<String> al1Copy = (List<String>) AL1.clone();
		
		System.out.println(al1Copy);
		
		AL1.addAll(al1Copy);
		
		System.out.println(AL1);
		
		System.out.println("to print the elements in reverse order");
		Collections.reverse(al1Copy);
		System.out.println("reverse list: "+ al1Copy);
		
		
		System.out.println("To shuffle the elements in array list");
		Collections.shuffle(al1Copy);
		System.out.println("shuffled list: "+ al1Copy);
		
		System.out.println("To swap the elements in particular position");
		Collections.swap(al1Copy,  2, 3);
		System.out.println("elements after swapping"+ al1Copy);
		

	}

}
