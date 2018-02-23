package in.oops;

public class LitNon {
	 public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String s3 =new String("Test");
		String s4 =new String("Test");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
	}
	 
}
