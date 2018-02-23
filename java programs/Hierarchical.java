package in.oops;

public class Hierarchical extends Inheritance {
	//One parent class and more than one child class
	private void method1() {
		System.out.println("hierarchy");
	}
public static void main(String[] args) {
	Hierarchical obj=new Hierarchical();
	SingleInheritance obj1=new SingleInheritance();
	obj.singleInheri();
	obj.method1();
	obj.singleInheri2();
	obj1.singleInheri();
	obj1.singleInheri2();
}
}
