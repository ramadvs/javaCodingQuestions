package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

	public static void main(String[] args) {
		
LinkedList<String> lnklst = new LinkedList<String>();
		
		System.out.println("Is The Given Linked List empty: "+ lnklst.isEmpty());
		
		lnklst.add("Tom");
		lnklst.add("John");
		lnklst.add("Harry");
		lnklst.addFirst("Garry");
		lnklst.addLast("Grover");
		lnklst.add(3,null);
		
		System.out.println(lnklst);
		
		System.out.println("index of element John: "+ lnklst.indexOf("John"));
		
		System.out.println(" last index of element John: "+ lnklst.lastIndexOf("John"));
		
		System.out.println("Get element at index at 2: "+ lnklst.get(2));
		
		System.out.println("Get the First element: "+ lnklst.getFirst());
		
		System.out.println(" Get the last element: "+ lnklst.getLast());
		
		System.out.println("peek last element: "+ lnklst.peekLast());
		
		System.out.println("check if Linked list contains Harry :" + lnklst.contains("Harry"));
		
		lnklst.set(3, "Mathew");
		
		lnklst.add("peter");
		
		System.out.println(lnklst);
		
		System.out.println("Size of the  linked list is: "+lnklst.size());
		
		System.out.println(" the subset of linked list from index 1 to 4 : "+ lnklst.subList(1, 4));
		
		lnklst.remove("peter");
		
		System.out.println(lnklst);
		
		System.out.println(" pop removes the first element in the linked list at a time.")
;		
		lnklst.pop();  
		
		System.out.println(lnklst);
		
		List<String> lnklstCopy = (List<String>) lnklst.clone();
		
		System.out.println("Cloned linked list: "+ lnklstCopy);
		
		lnklst.addAll(lnklstCopy);

		System.out.println("After adding copy to lnklst: "+ lnklst);
		
		//Reversing the list
		Collections.reverse(lnklst);
		System.out.println("linkedList after reversing : "+lnklst);
		
		//Shuffling the list
		Collections.shuffle(lnklst);
		System.out.println("LinkedList after shuffling : "+lnklst);
		
		//Swap two elements in list
		Collections.swap(lnklst, 1, 2);
		


	}

}
