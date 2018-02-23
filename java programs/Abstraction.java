package in.oops;

public abstract class Abstraction {
	/* Hiding the implementation part is called abstraction
	It will support abstract method and non-abstract method.
	We can’t create object for abstract class because in the method signature we
	didn't mention any business logic. so In abstract method, we only mention
	abstract signature, won't create business logic */
	abstract void test1();

	abstract void test2();

	abstract void test3();

	public void test4() {
		System.out.println("goodiee");
	}

}

class abstract1 extends Abstraction {

	@Override
	void test1() {
		System.out.println("test1");
	}

	@Override
	void test2() {
		System.out.println("test2");
	}

	@Override
	void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		abstract1 obj = new abstract1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}