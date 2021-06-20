package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		 
		 //adding key value pairs to hashmap
		 
		 hm.put("First","John");
		 hm.put("second","Tom");
		 hm.put("Third","Harry");
		 hm.put("Fourth","David");
		 
		 System.out.println("printing all values from hm");
		 System.out.println(hm);
		 
		 System.out.println("getting a value from the given key in hashmap");
		 System.out.println("the value at second:  "+hm.get("second"));
		 
		System.out.println("Is hashmap empty: "+ hm.isEmpty()); 
		
		hm.remove("Third");
		
		System.out.println(hm);
		
		System.out.println("size of the hashmap :" + hm.size());

	}

}
