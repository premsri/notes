package in.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Listing {
	public static void main(String[] args) {
	
		List test =new Vector();
		test.add("1");
		test.add(12);
		test.add(true);
		
		System.out.println(test);
		test.remove(2);
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		System.out.println(test1);
		System.out.println(test1.size());
		System.out.println(test1.get(1));
		for (int i = 0; i < test.size(); i++) {
			System.out.println(i);
		}
		for (Integer j : test1) {
			System.out.println(j);
		}
		
		System.out.println(test);
		test.add(2, 23);
		System.out.println(test);
		test.set(2, 10);
		System.out.println(test);
		boolean t =test.contains(12);
		System.out.println(t);
		
		
	}
}
