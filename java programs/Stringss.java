package in.oops;

public class Stringss {
	//collection of word or anything in double quotes
	
	public static void main(String[] args) {
		String s = "test in java";
		System.out.println(s);
		char ch = s.charAt(2);
		System.out.println(ch);
		boolean b =s.equals("test");
		System.out.println(b);
		boolean b1 = s.equalsIgnoreCase("TEST in java");
		System.out.println(b1);
		boolean b3 =s.contains("s");
		System.out.println(b3);
		String [] x =s.split("s");
		System.out.println(x.length);
		System.out.println(s.length());
		String [] x1 =s.split(" ");
		for (int i = 0; i < x1.length; i++) {
			System.out.println(x1[i]);
		}
		String s3= s.toUpperCase();
		String s4= s.toLowerCase();
		System.out.println(s3);
		System.out.println(s4);
		String s5=s.substring(3);
		String s6=s.substring(3, 7);
		System.out.println(s5);
		System.out.println(s6);
		int s7 =s.indexOf("j");
		int s8 =s.lastIndexOf("a");
		System.out.println(s7);
		System.out.println(s8);
		String s9=s.replaceAll("in", "to");
		System.out.println(s9);
		boolean s10=s.isEmpty();
		System.out.println(s10);
		boolean s11=s.startsWith("test");
		System.out.println(s11);
		boolean s12=s.endsWith("JAVA");
		System.out.println(s12);
		char ch1 ='j';
		int s13 = ch;
		System.out.println(s13);
		String a = "testing";
		int s14 =a.compareTo("test");
		System.out.println(s14);
		System.out.println(s.charAt(2));
	}

}
