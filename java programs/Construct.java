package in.oops;

public class Construct {
	/*
	 * Class name and constructor name must be same. */
	public Construct() {
		System.out.println("w/o arg");
	}

	public Construct(int a) {
		System.out.println("with arg");
	}

	public void construct(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Construct myobj = new Construct();
		Construct myobj1 = new Construct(24);
		myobj.construct(10);
	}
}
