package in.oops;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet ex =new HashSet();
		ex.add(12);
		ex.add("test");
		ex.add(122);
		System.out.println(ex);
		int i = ex.size();
		System.out.println(i);
		ex.remove("test");
		ex.add("ww");
		System.out.println(ex);
		for (Object obj : ex) {
			System.out.println(obj);
		}
		String ey =ex.toString();
		System.out.println(ey);
		
		
	}
}
