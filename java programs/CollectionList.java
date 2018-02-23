package in.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		List ex = new ArrayList();
		// add() is a method, it is used to insert a value.
		ex.add(10);
		ex.add(12.3);
		ex.add("as");
		System.out.println("Arraylist will display the output based on the insertion order" + ex);
		List<Integer> ey = new ArrayList<Integer>();
		// generics is used to define the particular datatype
		// List allows the duplicate value
		// ArrayList print in a insertion order
		ey.add(12);
		ey.add(13);
		ey.add(2, 254);
		ey.add(2, 13);
		ey.add(12);
		//is used to add the value based on the index
		//if we insert one value based on index, after all the index value move to backward
		ey.add(34);
		ey.add(35);
		ey.add(10);
		System.out.println(ey);
		int s = ex.size();
		// it is used to find the size of the ArrayList
		System.out.println(s);
		int s1 = ey.get(1);
		// is used to print the particular value
		System.out.println(s1);
		//to iterate the value
		for (int i = 0; i < ey.size(); i++) {
			System.out.println(ey.get(i));
		}
		ey.remove(2);
		// it is used to remove the particular index value
		// If we remove the particur index value, index order will not change After that
		// the index value move to forward
		System.out.println(ey);
		ey.set(2, 17);
		//is used to replace the value but index and value order will not change
		System.out.println(ey);
		boolean s5 = ey.contains(3);
		//used to check the particular value or object
		System.out.println(s5);
		int s6 = ey.indexOf(12);
		//used to print the position of the list
		System.out.println(s6);
		int u = ey.lastIndexOf(12);
		System.out.println(u);
		System.out.println(ex);
		ex.addAll(ey);
		//used to copy from one list to another list
		System.out.println(ex);
		System.out.println(ey);
		ex.removeAll(ey);
		//it is used to compare the both list and remove all the list1 values in list 2
		//list2=list2-list1
		//ex compare to ey and remove all ey values in the ex.
		ey.removeAll(ex);
		System.out.println(ex);
		System.out.println(ey);
		ex.retainAll(ey);
		//used to compare both list and print the common values
		System.out.println(ex);

	}
}
