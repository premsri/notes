package in.oops;

public class Polymorphism {
	//one task completed by many ways -manyform
	//In a same class method name is same and the argument is different

	public void name(String s) {
 System.out.println("name "+ s);
	}
	public void name(int a) {
System.out.println("name1"+ a);
	}
	public  void name() {

		System.out.println("name");
}	
	public static void nam1() {
		System.out.println("gooodieessss");
	}
	public static void main(String[] args) {
		Polymorphism load =new Polymorphism();
		load.name(23);
		load.name("good");
		load.name();
		MethodRide obj2=new MethodRide();
		obj2.name();
		nam1();
		MethodRide.name1();
		 
	}
}
