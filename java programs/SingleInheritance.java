package in.oops;

public class SingleInheritance extends Inheritance {
	//one parent class supports one child class
	public void test3() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		
		SingleInheritance myobj =new SingleInheritance();
		myobj.test3();
		myobj.singleInheri();
		myobj.singleInheri2();
	}
}
