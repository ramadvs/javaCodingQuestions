package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// to create hashMap
				HashMap<Integer, String> hm = new HashMap<Integer, String>();
				
				//Adding key value pairs in HashMap
				hm.put(1,"selenium");
				hm.put(2, "QTP");
				hm.put(3, "testng");
				
				//Read values using get(key) method using a specific key
				System.out.println(hm.get(1));
				System.out.println(hm.get(4));
				
				
				for(Entry m: hm.entrySet())
				{
					System.out.println(m.getKey()+ " " +m.getValue());
				}
				
				hm.put(4, "python");
				System.out.println(hm);
				hm.remove(3);
				System.out.println(hm);

	}

}
