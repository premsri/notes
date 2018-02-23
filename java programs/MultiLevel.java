package in.oops;

public class MultiLevel  {
	//more than one parent class supports one child class in tree form.
	private void test4() {
		System.out.println("testing");
	}
	public static void main(String[] args) {
		
		MultiLevel newobj =new MultiLevel();
		SingleInheritance newobj1 =new SingleInheritance();
		newobj1.singleInheri();
		newobj1.singleInheri2();
		newobj.test4();
		newobj1.test3();
	}

}
