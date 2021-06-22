package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeTwoArrays {
	
	public void mergearr(String[] a, String[] b) {
		
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));		
	}

	public static void main(String[] args) {
mergeTwoArrays merge = new mergeTwoArrays();
String[] a = {"a", "b", "c"};
String[] b = {"d","e"};

 merge.mergearr(a, b);
		

	}

}
