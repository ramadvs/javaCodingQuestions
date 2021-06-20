package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentnames = new ArrayList<String>();
		
        studentnames.add("tom");
        studentnames.add("david");
        studentnames.add("henry");
        studentnames.add("jim");
//Iterator
      System.out.println("USING ITERATOR"); 
        Iterator it = studentnames.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
       

// for loop
System.out.println("USING FOR LOOP");
for(int i=0; i<studentnames.size();i++) 
{
	System.out.println(studentnames.get(i));
}


 //for each loop
System.out.println("USING FOR EACHLOOP");
for(String s:studentnames)
{
	System.out.println(s);
}

System.out.println("*******");
//Streams with lambda
//studentnames.stream().forEach(ele->System.out.println(ele));

	}

}
