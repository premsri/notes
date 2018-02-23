package in.oops;

import java.util.ArrayList;
import java.util.List;

public class CollPractise {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		List b = new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(60);
		b.add(70);
		System.out.println(b);
		System.out.println(a);
		a.retainAll(b);
		System.out.println(a);
	}

}
