package in.oops;

public class MethodRide extends Polymorphism {
	//In a different class , the method name should be same and argument name should be same
	
	@Override
	public void name(int a) {
	System.out.println("n"+ a);	
	}
	@Override
	public void name(String s) {
		System.out.println("test"+ s);
		super.name(s);
	}
	public  void name() {
System.out.println("eame");
	}
	public static void name1() {
		System.out.println("goodieee");
	}
public static void main(String[] args) {
	Polymorphism obj =new MethodRide();
	obj.name(234);
	obj.name("test");
	obj.name();
	obj.nam1();
	MethodRide obj1 =new MethodRide();
	obj1.name();
}
}