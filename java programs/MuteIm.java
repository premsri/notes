package in.oops;

public class MuteIm {
	public static void main(String[] args) {
		String s1= "Test";
		String s2= "Testing";
		System.out.println("immutable");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String x =s1.concat(s2);
		System.out.println(x);
		System.out.println(System.identityHashCode(x));
		StringBuffer s3 = new StringBuffer("Test");
		StringBuffer s4 = new StringBuffer("Testing");
		System.out.println("muttable");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		StringBuffer y =s3.append(s4);
		System.out.println(y);
		System.out.println(System.identityHashCode(y));
		
		
	}

}
