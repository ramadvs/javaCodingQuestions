package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

	public static void main(String[] args) {
		
LinkedList<String> lnklst = new LinkedList<String>();
		
		lnklst.add("First");
		lnklst.add("Second");
		lnklst.add("Third");
		lnklst.add("Fourth");
		
		ListIterator lstltr = lnklst.listIterator();
		
		System.out.println("Print elements in forward direction using List iterator");
		
		while(lstltr.hasNext())
		{
			System.out.println(lstltr.next());
		}
		
		System.out.println("Print elements in backward direction using List iterator");
		
		while(lstltr.hasPrevious())
		{
			System.out.println(lstltr.previous());
		}
		
		System.out.println("printing the elements in descending order");
		Iterator<String> itr = lnklst.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
