package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayListIteration {
	
		public static void main(String[] args) {
			
			ArrayList<String> al = new ArrayList<String>();
			al.add("tom");
			al.add("henry");
			al.add("john");
			al.add("tim");
			

//Iterator		
		Iterator it = al.iterator();		
while(it.hasNext()) {
	System.out.println(it.next());	
	             }
//for loop
System.out.println("**For loop**"); 
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}

//for each loop
System.out.println("**for each loop**");
for(String s:al)
{
	System.out.println(s);
}




	}

}
